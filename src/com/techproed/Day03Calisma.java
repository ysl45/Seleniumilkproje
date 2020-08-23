package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03Calisma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //webeamani id ile bulma
        WebElement signIn=driver.findElement(By.id("sign-in"));
        signIn.click();

        //email kutusunu bulma
        WebElement emailKutusu=driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //sifre kutusu
        WebElement sifreKutusu=driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        //sign butonu
        WebElement signButonu=driver.findElement(By.name("commit"));
        signButonu.click();

        //baslik alma
        String baslik=driver.getTitle();

        if(baslik.equals("Address Book")){
            System.out.println("basarili");
        }else{
            System.out.println("basarisiz");
        }


    }
}
