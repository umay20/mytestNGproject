package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import java.awt.*;
public class Day07_WindowHandle2 extends TestBase {
    @Test
    public void newTabTest() throws InterruptedException {
//        amazon title test
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        String amazonWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
//        linkedin title test
        driver.switchTo().newWindow(WindowType.TAB);//Create a NEW TAB AND SWITCH TO IT
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
//        ebay title test
        driver.switchTo().newWindow(WindowType.TAB);//create a new TAB and switch to it
        driver.get("https://www.ebay.com");
        Assert.assertTrue(driver.getTitle().contains("eBay"));
        Thread.sleep(5000);
//        At this point driver is on EBAY, but I can switch to AMAZON or LINKEDIN
        driver.switchTo().window(amazonWindowHandle);
        System.out.println("TITLE OF AMAZON : "+ driver.getTitle());
        Thread.sleep(5000);
        driver.switchTo().window(linkedinWindowHandle);
        System.out.println("TITLE OF LINKEDIN : "+ driver.getTitle());
    }

    //    copy method 1 body
//    change TAB -> WINDOW
    @Test
    public void newWindowTest() throws InterruptedException {
        //        amazon title test
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        String amazonWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
//        linkedin title test
        driver.switchTo().newWindow(WindowType.WINDOW);//Create a NEW WINDOW AND SWITCH TO IT
        driver.get("https://www.linkedin.com");
        Assert.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinWindowHandle = driver.getWindowHandle();
        Thread.sleep(5000);
//        ebay title test
        driver.switchTo().newWindow(WindowType.WINDOW);//create a new WINDOW and switch to it
        driver.get("https://www.ebay.com");
        Assert.assertTrue(driver.getTitle().contains("eBay"));
        Thread.sleep(5000);
//        At this point driver is on EBAY, but I can switch to AMAZON or LINKEDIN
        driver.switchTo().window(amazonWindowHandle);
        System.out.println("TITLE OF AMAZON : "+ driver.getTitle());
        Thread.sleep(5000);
        driver.switchTo().window(linkedinWindowHandle);
        System.out.println("TITLE OF LINKEDIN : "+ driver.getTitle());
    }
}
