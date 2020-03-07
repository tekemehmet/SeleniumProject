package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) throws Exception {

        List<String> browserList = new ArrayList<>(Arrays.asList("chrome", "edge" , "firefox"));

        for (String eachBrowser : browserList ) {

            WebDriver driver = BrowserFactory.getDriver(eachBrowser);
            TitleVerification.TitleUnique(eachBrowser);

            driver.quit();
        }
        for (String eachBrowser : browserList) {

            WebDriver driver = BrowserFactory.getDriver(eachBrowser);
            TitleVerification2.TitleVerify(eachBrowser);

            driver.quit();

        }


        }
    }

