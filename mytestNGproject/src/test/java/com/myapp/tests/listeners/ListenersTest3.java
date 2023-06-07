package com.myapp.tests.listeners;
import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class ListenersTest3 {
    /*
    If a test case fails, then that test case is run again thanks to Listeners retry method
    This method fails, but will be rerun automatically
    We are able to rerun failed test cases multiple times using test ng listeners with retryAnalyzer
    NOTE: this class is linked to restyAnalyzer with ANNOTATION
    We can also link a class using xml files
     */
    @Test(retryAnalyzer = com.myapp.utilities.ListenersUtil.class)
    public void test4(){
        System.out.println("FAIL - Exception");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().findElement(By.id("wrong id"));//FAILED NO SUCH
//        throw new NoSuchElementException("No Such ");
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}