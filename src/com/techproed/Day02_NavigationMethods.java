package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();



        webDriver.get("https://google.com");




   webDriver.navigate().to("http://amazon.com");
   webDriver.navigate().back();
   webDriver.navigate().forward();


    }
}
