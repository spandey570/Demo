package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class TableTesting {

    DriverInitilization instance;
    WebDriver driver;
    @BeforeTest
    public void setUp()
    {
        instance= DriverInitilization.getInstance();
        driver= instance.openBrowser();
    }

    @Test
    public void TesTable()
    {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> eleCount= driver.findElements(By.xpath("//*[text()='Structure']/../../following-sibling::tbody//tr//th"));
        int no= eleCount.size();
        for(int i=0; i<no; i++)
        {
            System.out.println(eleCount.get(i).getText());
        }

    }
}
