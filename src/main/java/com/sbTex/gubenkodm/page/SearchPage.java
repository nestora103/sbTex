package com.sbTex.gubenkodm.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Nestor on 17.04.2017.
 */
public class SearchPage extends Page {

    @FindBy(className="n-title__text")
    WebElement searchResult;

    public SearchPage(WebDriver wbd) {
        super(wbd,10);
    }

    public String getSearchResult() {
        return searchResult.getText();
    }
}
