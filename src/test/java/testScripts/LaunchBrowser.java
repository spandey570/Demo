package testScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LaunchBrowser {

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
        driver.get("https://www.google.com");
        driver.close();
    }
}