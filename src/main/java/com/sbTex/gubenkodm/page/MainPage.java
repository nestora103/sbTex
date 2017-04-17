package com.sbTex.gubenkodm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nestor on 16.04.2017.
 */
public class MainPage extends Page {
    @FindBy(css="a[data-id='market']")
    WebElement marketLink;
    public MainPage(WebDriver wbd) {
        super(wbd,10);
    }
    public void openUrl(String s) {
        wbd.get(s);
    }
    public void maximize() {
        wbd.manage().window().maximize();
    }
    public void clickOnMarket() {
        marketLink.click();
    }
}
