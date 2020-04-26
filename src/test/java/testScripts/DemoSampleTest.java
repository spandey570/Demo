package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DemoSampleTest {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("user-name")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
        String errorMsg= driver.findElement(By.xpath("//*[@data-test='error']")).getText();
        Assert.assertEquals(errorMsg,"Epic sadface: Username and password do not match any user in this service");
        driver.quit();


    }
}
