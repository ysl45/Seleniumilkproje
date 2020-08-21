package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //Webelementimizi id kullanarak buluyoruz
        WebElement signInLinki=driver.findElement(By.id("sign-in"));
        signInLinki.click();

        //e mail kutusunu bulalim
        WebElement emailKutusu=driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //email kutusuna yazi yazdirmak
        WebElement sifreKutusu=driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        //sign in butonunu bulmak
        WebElement signInButonu=driver.findElement(By.name("commit"));
        signInButonu.click();

        String baslik=driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giris basarili");

        }else {
            System.out.println("Giris basarisiz");
        }

    }
}
