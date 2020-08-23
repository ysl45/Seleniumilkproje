package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CcSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mysl\\Documents\\selenium dependencies\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        //ccselectorde class(.value) id(#value)
        WebElement emailKutusu=driver.findElement(By.cssSelector("#session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        //ccs="tagName[attributename='value']"
        WebElement sifreKutusu=driver.findElement(By.cssSelector("input[placeholder='Password']"));
        sifreKutusu.sendKeys("Test1234!");
        sifreKutusu.submit();


    }
}
