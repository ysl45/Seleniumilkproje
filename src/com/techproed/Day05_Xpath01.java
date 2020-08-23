package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //xpath ile emailkutusu
        WebElement emailKutusu=driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //xpath ile sifre kutusu
        WebElement sifreKutusu=driver.findElement(By.xpath("//input[@type='password']"));
        sifreKutusu.sendKeys("Test1234!");

        WebElement signInButonu=driver.findElement(By.xpath("//input[@type='submit']"));
        signInButonu.click();


    }
}
