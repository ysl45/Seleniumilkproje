package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://amazon.com");

        String titleAmazon = webDriver.getTitle();
        if (titleAmazon.contains("car")) {
            System.out.println("iceriyor");
        } else {
            System.out.println("icermiyor");
        }
        webDriver.quit();
    }
}
