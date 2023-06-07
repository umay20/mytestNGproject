package com.myapp.tests.paralleltesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
public class Day23_WebTables {
    @Test
    public void printTable(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        //    Task 1 : Print the entire table
        driver.get("https://the-internet.herokuapp.com/tables");

        String entireTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);
//        ALTERNATIVELY
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachData : elements){
            System.out.println(eachData.getText());
        }
//        GET SPECIFIC INDEXED ELEMENTS
        System.out.println("6TH DATA IN THE TABLE =>>> "+elements.get(5).getText());
        driver.close();
    }
    //    Task 2 : Print All Rows
    @Test
    public void printAllRows(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum=1;
        for (WebElement eachRow : allRows){
            System.out.println(rowNum + " :  "+eachRow.getText());
            rowNum++;
        }
        System.out.println("2ND ROW DATA : "+allRows.get(1).getText());
        //    Task 3 : Print Last row data only
        System.out.println("LAST ROW DATA : "+allRows.get(allRows.size()-1).getText());
        driver.close();
    }
}
