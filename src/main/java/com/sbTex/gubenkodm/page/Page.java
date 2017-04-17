package com.sbTex.gubenkodm.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Nestor on 17.04.2017.
 */
public class Page {
    WebDriver wbd=null;
    public void setFindWaitInSec(final int iSec) {
        wbd.manage().timeouts().implicitlyWait(iSec, TimeUnit.SECONDS);
    }

    public Page(WebDriver wbd,int waitSec) {
        this.wbd = wbd;
        //задание времени ожидания после каждого поиска элемента на странице
        setFindWaitInSec(waitSec);
        PageFactory.initElements(wbd,this);
    }
}
