package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.faceook.com");

        WebElement emaiKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        emaiKutusu.sendKeys("techproed@gmail.com");

        WebElement sifreKutusu=driver.findElement(By.id("pass"));
        sifreKutusu.sendKeys("Test1234");

        WebElement loginButonu=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButonu.click();

        try {
            Thread.sleep(18000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String url=driver.getCurrentUrl();
        System.out.println(url);

        if(url.contains("faceook.com/login/")){
            System.out.println("giris basarisiz");
        }else{
            System.out.println("giris basarili");
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      driver.quit();
    }
}
