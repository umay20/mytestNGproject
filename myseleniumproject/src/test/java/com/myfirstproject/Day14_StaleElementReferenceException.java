package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Day14_StaleElementReferenceException extends TestBase {
    /*
    StaleElementException:
    *The reference is no longer FRESH and it can no longer be usable
    *Reasons may be trying to use the same reference after refreshing the page,
    or going back and forward between the pages
    *SOLUTION: Try not using the old reference
    And relocate hte element one more time
     */
    @Test
    public void staleElementReferenceExceptionTest1(){
        driver.get("https://testcenter.techproeducation.com/");
//        and click on CheckBox link
//        Location checkboxes element
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
//        REFRESH
        driver.navigate().refresh();
//        checkboxesLink.click();//StaleElementReferenceException
        driver.findElement(By.linkText("Checkboxes")).click();
    }
    @Test
    public void staleElementReferenceExceptionTest2(){
        driver.get("https://testcenter.techproeducation.com/");
        WebElement checkboxesLink = driver.findElement(By.linkText("Checkboxes"));
        checkboxesLink.click();
        driver.navigate().back();
        waitFor(5);
        checkboxesLink.click();
    }
    @Test
    public void staleElementReferenceExceptionTest3(){
        driver.get("https://www.amazon.com/");
        WebElement registry = driver.findElement(By.xpath("//*[@id='nav-xshop']//a[11]"));
        registry.click();
        waitFor(5);
        driver.navigate().back();
        waitFor(5);
        registry.click();//StaleElementReferenceException:
//        SOLUTION
        driver.findElement(By.xpath("//*[@id='nav-xshop']//a[11]")).click();
    }
}
