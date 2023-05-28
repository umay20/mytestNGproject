package com.myfirstproject.pratices.practice01;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q05_MedunnaSignIn extends TestBase {

    @Test
    public void medunnaSignIn (){

        //Go to https://www.medunna.com/
        driver.get("https://www.medunna.com/");

        //Click on human sign
        driver.findElement(By.id("account-menu")).click();

        //Click on "sign in" option
        driver.findElement(By.id("login-item")).click();

        //Enter "mark_twain" username
        driver.findElement(By.name("username")).sendKeys("mark_twain");

        //Enter "Mark.123" password
        driver.findElement(By.name("password")).sendKeys("Mark.123");

        //Click on "remember me"
        driver.findElement(By.id("rememberMe")).click();

        //Locating Sign in "Submit" button
        WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));

        //clicking on submit
        submit.click();


        //verifying if submit is clicked
       // Assert.assertTrue(submit.isSelected());
        //Homework...


    }
}
//    WebElement red = driver.findElement(By.id("red"));
////        clicking on red
//        red.click();
////        verifying if red is checked
//                Assert.assertTrue(red.isSelected());
////    Click on Football 2 mins
//                WebElement football = driver.findElement(By.id("football"));
//                football.click();
//                Assert.assertTrue(football.isSelected());
//                }