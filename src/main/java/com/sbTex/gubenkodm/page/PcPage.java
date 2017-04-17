package com.sbTex.gubenkodm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Nestor on 17.04.2017.
 */
public class PcPage extends Page {
    @FindBy(linkText="Ноутбуки")
    WebElement notePc;

    @FindBy(linkText="Планшеты")
    WebElement tablet;

    public PcPage(WebDriver wbd) {
        super(wbd,10);
    }
    public void clickOnNotePc() {
        notePc.click();
    }

    public void clickOnTablet() {
        tablet.click();
    }
}
