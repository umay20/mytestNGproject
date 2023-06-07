import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test01 {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

    }



}
