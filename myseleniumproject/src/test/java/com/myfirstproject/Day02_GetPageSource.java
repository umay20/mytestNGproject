package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.time.Duration;

public class Day02_GetPageSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();


        driver.get("https://www.amazon.com");
        String pageSource=driver.getPageSource();
        if(pageSource.contains("registry")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(pageSource+"DOESNT EXIST ON THE PAGE");
        }
        driver.quit();


    }





}
