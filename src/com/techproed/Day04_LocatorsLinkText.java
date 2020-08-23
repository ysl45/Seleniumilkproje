package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsLinkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

       //yazi ile webelement bulma
        WebElement singInLinki=driver.findElement(By.linkText("Sign in"));
        singInLinki.click();

       // home inkine tiklama
        WebElement homeLinki=driver.findElement(By.partialLinkText("Home"));
        homeLinki.click();

    }
}
