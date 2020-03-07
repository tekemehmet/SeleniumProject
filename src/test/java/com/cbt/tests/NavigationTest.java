package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NavigationTest {

    public static void main(String[] args) throws Exception {


        List<String> browserList = new ArrayList<>(Arrays.asList("chrome", "edge" , "firefox","safari"));

        for (String eachBrowser : browserList ) {

            WebDriver driver = BrowserFactory.getDriver(eachBrowser);
            driver.get("http://google.com");
            Thread.sleep(3000);
            String title1 = driver.getTitle();
            System.out.println("title1 = " + title1);

            driver.get("http://etsy.com");
            Thread.sleep(3000);
            String title2 = driver.getTitle();
            System.out.println("title2 = " + title2);

            driver.navigate().back();
            Thread.sleep(3000);
            StringUtility.verifyEquals(title1, driver.getTitle());


            driver.navigate().forward();
            Thread.sleep(3000);
            StringUtility.verifyEquals(title2, driver.getTitle());


            driver.quit();
        }

    }
}
