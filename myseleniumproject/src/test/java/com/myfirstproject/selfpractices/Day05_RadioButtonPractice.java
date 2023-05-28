package com.myfirstproject.selfpractices;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day05_RadioButtonPractice extends TestBase {

    @Test
    public void radioButtonTest(){

        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");
        WebElement red=driver.findElement(By.id("red"));
        red.click();
        Assert.assertTrue(red.isSelected());

        //Click on Football
        //find the element
        WebElement football=driver.findElement(By.id("football"));
        //click on football
        football.click();
        //verify that football is clicked(selected)
        Assert.assertTrue(football.isSelected());



    }

}
