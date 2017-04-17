import com.sbTex.gubenkodm.YandexSite;
import com.sbTex.gubenkodm.helpClasses.HelpClass;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;


/**
 * Created by Nestor on 17.04.2017.
 */
public class TestClass {
    private final static  String PATH_TO_CHROMEDRIVER_EXE = "chromedriver.exe";
    //будем использовать драйвер хрома
    private static WebDriver wbd;
    //private static WebDriverWait wdw;
    private static HelpClass hec;
    private static YandexSite yandexSite;


    @BeforeClass
    public static void init(){
        hec=new HelpClass();
        //если драйвер не прописан в путях
        hec.setDriver("webdriver.chrome.driver",PATH_TO_CHROMEDRIVER_EXE);
        wbd=new ChromeDriver();
        yandexSite=new YandexSite(wbd);
    }

    @Test
    public void test1(){
        //открываем указынный url
        System.out.println("Открыли браузер и страницу https://yandex.ru");
        yandexSite.mainPage().openUrl("https://yandex.ru");
        System.out.println("Развернули окно на весь экран");
        //раскрываем окно на весь экран
        yandexSite.mainPage().maximize();
        System.out.println("Перейти в яндекс маркет");
        yandexSite.mainPage().clickOnMarket();
        System.out.println("Выбрать раздел Компьютеры");
        yandexSite.catalogPage().clickOnPc();
        System.out.println("Выбрать раздел Ноутбуки");
        yandexSite.pcPage().clickOnNotePc();
        System.out.println("Зайти в расширенный поиск");
            yandexSite.selectProductPage().clickAllSearch();
        System.out.println("Задать параметр поиска до 30000 рублей");
        yandexSite.selectProductPage().inputMaxCost("30000");
        System.out.println("Выбор производителя HP");
        yandexSite.selectProductPage().clickHP();
        System.out.println("Выбор производителя Lenovo");
        yandexSite.selectProductPage().clickLo();
        System.out.println("Нажать кнопку применить");
        yandexSite.selectProductPage().clickApply();
        //задерка
        hec.waitResult(2000);
        System.out.println("Проверить,что элементов на странице 12");
        //получим список элементов
        ArrayList<WebElement> listWebElem=yandexSite.selectProductPage().getList();
        //проверим
        Assert.assertTrue(listWebElem.size()==12);
        System.out.println("Запомнить первый элемент");
        WebElement fElem=listWebElem.get(0);
        String inpStr=fElem.findElement(By.className("snippet-card__header-text")).getText();
        System.out.println("В поисковую строку ввести запомненное значение и найти");
        yandexSite.selectProductPage().insertElem(inpStr);
        String searchResult=yandexSite.searchPage().getSearchResult();
        System.out.println("Проверить,что сохраненное значение равно найденному");
        Assert.assertTrue(inpStr.equals(searchResult));
        //задерка
        hec.waitResult(2000);

        //wbd.quit();
    }

    @Test
    public void test2(){
        //открываем указынный url
        System.out.println("Открыли браузер и страницу https://yandex.ru");
        yandexSite.mainPage().openUrl("https://yandex.ru");
        System.out.println("Развернули окно на весь экран");
        //раскрываем окно на весь экран
        yandexSite.mainPage().maximize();
        System.out.println("Перейти в яндекс маркет");
        yandexSite.mainPage().clickOnMarket();
        System.out.println("Выбрать раздел Компьютеры");
        yandexSite.catalogPage().clickOnPc();
        System.out.println("Выбрать раздел Планшеты");
        yandexSite.pcPage().clickOnTablet();
        System.out.println("Зайти в расширенный поиск");
        yandexSite.selectProductPage().clickAllSearch();

        System.out.println("Задать параметр поиска от 20000 рублей");
        yandexSite.selectProductPage().inputMinCost("20000");
        System.out.println("Задать параметр поиска до 25000 рублей");
        yandexSite.selectProductPage().inputMaxCost("25000");
        System.out.println("Выбор производителя Aser");
        yandexSite.selectProductPage().clickAcer();
        //открыть полный список производителей
        //yandexSite.selectProductPage().clickAllBrands();
        System.out.println("Выбор производителя DELL");
        //hec.waitResult(2000);
        //yandexSite.selectProductPage().clickDell();
        System.out.println("Нажать кнопку применить");
        yandexSite.selectProductPage().clickApply();
        //задерка
        hec.waitResult(2000);

        System.out.println("Проверить,что элементов на странице 12");
        //получим список элементов
        ArrayList<WebElement> listWebElem=yandexSite.selectProductPage().getList();
        //проверим
        Assert.assertTrue(listWebElem.size()==12);
        System.out.println("Запомнить первый элемент");
        WebElement fElem=listWebElem.get(0);
        String inpStr=fElem.findElement(By.className("snippet-card__header-text")).getText();
        System.out.println("В поисковую строку ввести запомненное значение и найти");
        yandexSite.selectProductPage().insertElem(inpStr);
        String searchResult=yandexSite.searchPage().getSearchResult();
        System.out.println("Проверить,что сохраненное значение равно найденному");
        Assert.assertTrue(inpStr.equals(searchResult));
        //задерка
        hec.waitResult(2000);

        //wbd.quit();

    }

    @AfterClass
    public static void closeT(){
        if (wbd!=null){
            wbd.quit();
        }
    }
}
