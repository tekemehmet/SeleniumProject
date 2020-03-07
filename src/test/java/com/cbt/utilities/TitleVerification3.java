package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {

        List<String> browserList = new ArrayList<>(Arrays.asList("chrome", "edge" , "firefox","safari"));

        for (String eachBrowser : browserList ) {

            WebDriver driver = BrowserFactory.getDriver(eachBrowser);




        }
    }
}
