package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitilization {

    private static DriverInitilization instance = null;
    WebDriver driver;

    private DriverInitilization() {

    }

    public static DriverInitilization getInstance() {
        if (instance == null) {
            instance = new DriverInitilization();
        }
        return instance;
    }

    public WebDriver openBrowser() {

        System.setProperty("webdriver.chrome.driver", "E:\\AndroidAutomation\\Demo\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
