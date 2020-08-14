package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
       webDriver.manage().window().maximize();
        webDriver.get("http://amazon.com");

        String sayfaBasligi=webDriver.getTitle();
        if (sayfaBasligi.contains("car")){
            System.out.println("iceriyor");
        }else{
            System.out.println("icermiyor");
        }

        String amazonTitle=webDriver.getTitle();
        if (amazonTitle.contains("zon")){
            System.out.println("geciyor");
        }else{
            System.out.println("gecmiyor");
        }
        webDriver.quit();
    }
}
