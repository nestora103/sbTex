package com.sbTex.gubenkodm.helpClasses;

/**
 * Created by Nestor on 17.04.2017.
 */
public class HelpClass {
    public void setDriver(final String drvName, final String pathToChromedriverExe) {
        System.setProperty(drvName, pathToChromedriverExe);
    }
    public void waitResult(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
