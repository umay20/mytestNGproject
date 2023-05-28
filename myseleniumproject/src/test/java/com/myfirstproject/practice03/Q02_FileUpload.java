package com.myfirstproject.practices.practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class Q02_FileUpload extends TestBase {
   /*
    Given
        Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
    When
       Type "My File" into "Notes about the file" input
    And
        Click "Choose File" button
    And
        Select the file to upload
    And
        Click on "Press" button
    Then
        Assert that "Your notes on the file were" equals "My File"
    And
        Assert that file Content contains "Hello, I am uploaded file"
     */

    @Test
    public void uploadTest() {
//        Go to "https://cgi-lib.berkeley.edu/ex/fup.html"
        driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

//        Type "My File" into "Notes about the file" input
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("My File");

//        Click "Choose File" button
//        Select the file to upload
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(System.getProperty("user.home") + "/Desktop/text.txt");

//        Click on "Press" button
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        Assert that "Your notes on the file were" equals "My File"
        String note = driver.findElement(By.xpath("//blockquote")).getText();
        assertEquals("My File", note);

//        Assert that file Content contains "Hello, I am uploaded file"
        String fileContent = driver.findElement(By.tagName("pre")).getText();
        assertEquals("Hello, I am uploaded file", fileContent);

    }
}