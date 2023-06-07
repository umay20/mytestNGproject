package com.myapp.tests.listeners;
import com.myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
public class ListenersTest2 {
    /*
    We can link this class and listeners using @Listeners annotation or xml file
    In this class we will use xml files
     */
    @Test
    public void test1(){
        System.out.println("PASS");
        assertTrue(true);
    }
    @Test
    public void test2(){
        System.out.println("FAIL");
        assertTrue(false);
    }
    @Test
    public void test3(){
        System.out.println("SKIP");
        throw new SkipException("SKIPP THIS TEST CASE FOR TESTING PURPOSE");
    }
    @Test
    public void test4(){
        System.out.println("FAIL - Exception");
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().findElement(By.id("wrong id"));//FAILED NO SUCH
//        throw new NoSuchElementException("No Such ");
    }
}
