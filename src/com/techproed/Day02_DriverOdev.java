package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();


        webDriver.manage().window().maximize();
        webDriver.get("https://google.com");
        String titleGooge= webDriver.getTitle();
        System.out.println(titleGooge);


    }
}
