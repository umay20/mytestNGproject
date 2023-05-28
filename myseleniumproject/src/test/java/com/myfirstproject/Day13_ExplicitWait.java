package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Day13_ExplicitWait extends TestBase {
    //    Create a class:ExplicitWait
//    Create a method: explicitWait
//    Go to https://the-internet.herokuapp.com/dynamic_loading/1
//    When user clicks on the Start button
//    Then verify the ‘Hello World!’ Shows up on the screen
    @Test
    public void explicitWaitTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
//        WAIT AFTER BUTTON CLICK
//        TRYING HARD WAIT
//        Thread.sleep(10000);//SOLVED THE WAIT ISSUE BUT NOT RECOMMENDED CAUSE NOT DYNAMIC
//        TRYING EXTRA IMPLICIT WAIT
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// DIDN'T SOLVE THE WAIT ISSUE
//        TRYING EXPLICIT WAIT
//        1. create webdriverwait object
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        2. use the wait object to handle the wait issue
        wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//div[@id='finish']//h4"))  ));
//        FAILS
        WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4"));
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }
    @Test
    public void explicitWaitTest2() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();
//        TRYING EXPLICIT WAIT
//        1. create webdriverwait object
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        2. use the wait object to handle the wait issue
        WebElement helloWorld = wait.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//div[@id='finish']//h4"))  ));
//        WebElement helloWorld=driver.findElement(By.xpath("//div[@id='finish']//h4"));
        Assert.assertEquals("Hello World!",helloWorld.getText());
    }

    @Test
    public void explicitWaitTest3(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']//button"));
        startButton.click();


    }
}
