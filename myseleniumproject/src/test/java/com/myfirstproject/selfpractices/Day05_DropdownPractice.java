package com.myfirstproject.selfpractices;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Day05_DropdownPractice extends TestBase {


@Test
public void selectByIndexTest(){
    //Go to https://testcenter.techproeducation.com/index.php?page=dropdown

    driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

    //        1. locating the dropdown
    WebElement dropdown=driver.findElement(By.id("dropdown"));

    //        2. create a select object
    Select options =new Select(dropdown);

    //        3. use select object to select your option
    options.selectByIndex(1);





}

}
