package com.myfirstproject.practices.practice02;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Q02_Form_Addition extends TestBase {
        /*
   Given
        Go to url : https://phptravels.com/demo/
   When
        Fill the form
   And
        Click on 'SUBMIT'
   Then
        Assert that the form has been sent
    */

    @Test
    public void test() throws InterruptedException {

//        Go to url : https://phptravels.com/demo/
        driver.get("https://phptravels.com/demo/");

//        Fill the form
        Thread.sleep(1000);
        driver.findElement(By.name("first_name")).sendKeys(Faker.instance().name().firstName());
        Thread.sleep(1000);
        driver.findElement(By.name("last_name")).sendKeys(Faker.instance().name().lastName());
        Thread.sleep(1000);
        driver.findElement(By.name("business_name")).sendKeys(Faker.instance().name().title());
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys(Faker.instance().internet().emailAddress());
        Thread.sleep(1000);

        //Locate number1
        int number1 = Integer.parseInt(driver.findElement(By.id("numb1")).getText());
        int number2 = Integer.parseInt(driver.findElement(By.id("numb2")).getText());
        int sum = number1+number2;
        WebElement result = driver.findElement(By.id("number"));
        Thread.sleep(1000);
        result.sendKeys(sum+"");//sum+"" ==> converts int to String

//        Click on 'SUBMIT'
        driver.findElement(By.id("demo")).click();

//        Assert that the form has been sent
        Thread.sleep(1000);
        String thankYouText = driver.findElement(By.xpath("//strong[.=' Thank you!']")).getText();
        System.out.println("thankYouText = " + thankYouText);
        assertTrue(thankYouText.contains("Thank you"));

        //or

        WebElement checkCircle = driver.findElement(By.id("colored"));
        assertTrue(checkCircle.isDisplayed());

    }
}