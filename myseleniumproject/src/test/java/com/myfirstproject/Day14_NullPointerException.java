package com.myfirstproject;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day14_NullPointerException  {
    //    When the object are declared but never instantiated, then we get NullPointerException
    Faker faker;
    //    Faker faker=new Faker();
    WebDriver driver;
    //    WebDriver driver=new ChromeDriver();
    @Test
    public void nullPointerExceptionTest1(){
        driver.get("https://www.amazon.com");//NullPointerException cause driver has no assigned value.(not instantiated)
    }
    @Test
    public void nullPointerExceptionTest2(){
        System.out.println(faker.name().firstName());//NullPointerException
    }
}
