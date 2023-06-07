package com.myapp.tests.listeners;
import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
public class ListenersTest4 {
    /*
    NOTE: We will link this class to retryAnalyzer using xml file
    By default, this class has no relationship with Listeners
    We will link using xml file
     */
    @Test
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
