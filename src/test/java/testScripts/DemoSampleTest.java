package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class DemoSampleTest {

    @Test
    public void verifyInvalidLogin()
    {
    //  WebDriverManager for setting up execution on chrome browser

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();

    //  WebDriverManager for setting up execution on firefox browser
    //  WebDriverManager.firefoxdriver().setup();
   //   WebDriver driver = new FirefoxDriver();
        String url="https://www.saucedemo.com/";
        driver.get(url);
        System.out.println("Browser launched & navigated to "+url);
        driver.manage().window().maximize();
        System.out.println("Browser window is maximized");
        driver.findElement(By.id("user-name")).sendKeys("admin");
        System.out.println("User name is entered successfully");
        driver.findElement(By.id("password")).sendKeys("admin");
        System.out.println("Password is entered successfully");
        driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
        System.out.println("Successfully clicked on login button");
        String errorMsg= driver.findElement(By.xpath("//*[@data-test='error']")).getText();
        Assert.assertEquals(errorMsg,"Epic sadface: Username and password do not match any user in this service");
        System.out.println("Error message is successfully verified");
        driver.quit();
        System.out.println("Browser closed successfully");
    }
}
