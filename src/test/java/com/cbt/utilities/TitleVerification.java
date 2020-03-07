package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.*;

public class TitleVerification {

    public static void main(String[] args) throws Exception {

        TitleUnique("chrome");

    }

    public static void TitleUnique(String browserName) throws Exception {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        Set<String> titles = new HashSet<>();
        List<String> currentURLs = new ArrayList<>();

        for (String eachUrl : urls) {
            driver.get(eachUrl);
            titles.add(driver.getTitle());
            driver.getCurrentUrl();
            currentURLs.add(driver.getCurrentUrl());
        }

        System.out.println(titles);

        if (titles.size()==1){
            System.out.println("All have the same title");
        }else{
            System.out.println("All have not same title");
        }

        //=======Verify that all URLs of all pages start with http://practice.cybertekschool.com ===============
        System.out.println(currentURLs);

        for (String eachURL : currentURLs) {

            if (eachURL.startsWith("http://practice.cybertekschool.com")){
                continue;
            }else{
                System.out.println("All pages does NOT start with http://practice.cybertekschool.com");
            }
        }


        driver.quit();


    }
}
