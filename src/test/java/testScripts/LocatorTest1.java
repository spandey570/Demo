package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorTest1 {
    DriverInitilization instance;
    WebDriver driver;
    @BeforeTest
    public void setup()
    {
        instance = DriverInitilization.getInstance();
        driver= instance.openBrowser();
    }


    @Test
    public void OpenGoogle() {
        driver.get("https://www.phptravels.net/");

        driver.findElement(By.xpath("//*[@href='#flights']")).click();
        driver.findElement(By.xpath("//*[@id='flightSearchRadio-1']/following-sibling::label")).click();
        WebElement cabinDrp= driver.findElement(By.name("cabinclass"));

        driver.findElement(By.xpath("//*[@name='fadults']/..//button[text()='+']")).click();
       // driver.close();
    }
}
