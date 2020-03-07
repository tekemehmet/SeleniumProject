package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) throws Exception {


        TitleVerify("chrome");


    }

    public static void TitleVerify(String browserName) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://www.westelm.com/");


        for (String eachURLs : urls) {

            driver.get(eachURLs);
            Thread.sleep(3000);
            String titles = driver.getTitle().replace(" ", "").toLowerCase().substring(0, 7);
            System.out.println(eachURLs + " contains " + titles + " : " + eachURLs.contains(titles));

        }

        driver.quit();


    }


}