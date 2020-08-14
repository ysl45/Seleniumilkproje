package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();

        webDriver.get("https://youtube.com");
        String sayfaBasligi=webDriver.getTitle();
        if (sayfaBasligi.contains("video")){
            System.out.println("var");
        }else{
            System.out.println("yok");
        }

      webDriver.quit();
    }
}
