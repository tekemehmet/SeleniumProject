package com.cbt.utilities;

public class StringUtility {

    public static void verifyEquals(String expected,String actual){

        if (actual.equals(expected)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

    }
}
