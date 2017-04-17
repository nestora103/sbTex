package com.sbTex.gubenkodm;

import com.sbTex.gubenkodm.page.*;
import org.openqa.selenium.WebDriver;

/**
 * Created by Nestor on 17.04.2017.
 */
public class YandexSite {
    WebDriver wbd;

    public YandexSite(WebDriver wbd) {
        this.wbd = wbd;
    }

    public MainPage mainPage(){
        return new MainPage(wbd);
    }

    public CatalogPage catalogPage(){
        return new CatalogPage(wbd);
    }

    public PcPage pcPage(){
        return new PcPage(wbd);
    }

    public SelectProductPage selectProductPage(){
        return new SelectProductPage(wbd);
    }

    public SearchPage searchPage(){  return new SearchPage(wbd); }
}
