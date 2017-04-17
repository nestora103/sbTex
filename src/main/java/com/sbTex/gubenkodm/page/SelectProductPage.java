package com.sbTex.gubenkodm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by Nestor on 17.04.2017.
 */
public class SelectProductPage extends Page {
    @FindBy(linkText="Перейти ко всем фильтрам")
    WebElement allsearch;

    @FindBy(id="glf-priceto-var")
    WebElement inputMaxCost;

    @FindBy(id="glf-pricefrom-var")
    WebElement inputMinCost;

    @FindBy(css="label[for='glf-7893318-152722']")
    WebElement hpCheckBox;

    @FindBy(css="label[for='glf-7893318-152981']")
    WebElement loCheckBox;

    @FindBy(css="label[for='glf-7893318-267101']")
    WebElement acerCheckBox;

    @FindBy(id="glf-7893318-153080")
    WebElement dellCheckBox;


    @FindBy(linkText="Показать подходящие")
    WebElement applyButton;

    @FindBy(className="filter-applied-results")
    WebElement elemResult;

    @FindBy(id="header-search")
    WebElement searchField;

    @FindBy(className="search2__button")
    WebElement searchButton;


    public SelectProductPage(WebDriver wbd) {
        super(wbd,10);
    }

    public void inputMaxCost(String cost){
        inputMaxCost.clear();
        inputMaxCost.sendKeys(cost);
    }

    public void clickHP() {
        hpCheckBox.click();
    }

    public void clickLo() {
        loCheckBox.click();
    }

    public void clickApply() {
        applyButton.click();
    }

    public ArrayList<WebElement> getList() {
        return (ArrayList<WebElement>) elemResult.findElements(By.className("n-snippet-card"));
    }


    public void insertElem(String productName) {
        searchField.sendKeys(productName);
        searchButton.click();
    }


    public void inputMinCost(String cost) {
        inputMinCost.clear();
        inputMinCost.sendKeys(cost);
    }

    public void clickAcer() {
        //acerCheckBox.click();
        //wbd.findElement(By.cssSelector("div[onclick='return {\"n-filter-block\":{\"activatedCount\":\"0\",\"filterId\":\"7893318\"}}']")).
        //          findElement(By.cssSelector("span[data-filter='glf,7893318,267101']")).click();
        wbd.findElement(By.cssSelector("span[data-filter='glf,7893318,267101']")).click();

    }

    public void clickDell() {
        dellCheckBox.click();
       // wbd.findElement(By.cssSelector("label[for='glf-7893318-153080']")).click();
    }

    public void clickAllSearch() {
        allsearch.click();
    }

    public void clickAllBrands() {
        wbd.findElement(By.cssSelector("div[onclick='return {\"n-filter-block\":{\"activatedCount\":\"0\",\"filterId\":\"7893318\"}}']")).
                findElement(By.tagName("button")).click();
                //findElement(By.tagName("span")).click();
    }
}
