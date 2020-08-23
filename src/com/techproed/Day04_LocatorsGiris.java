package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //Webelementimizi id kullanarak buluyoruz
        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();
       //email kutusu
        WebElement emailKutusu=driver.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusu
        WebElement sifreKutusu=driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");






    }
}
