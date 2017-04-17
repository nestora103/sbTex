package com.sbTex.gubenkodm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Nestor on 17.04.2017.
 */
public class CatalogPage extends Page {
    @FindBy(className="topmenu__list")
    WebElement catalog;
    public CatalogPage(WebDriver wbd) {
        super(wbd,10);
    }
    public void clickOnPc() {
        catalog.findElement(By.cssSelector("li[data-department='Компьютеры']")).click();
    }
}
