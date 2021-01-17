package testScripts;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LocatorsAndGestures {


    IOSDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {

        File appDir = new File("src");
        File app = new File(appDir, "Demos-debug.ipa");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void locatorTest() {

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
        driver.findElementByName("OK").click();
        driver.navigate().back();

    }

    @Test
    public void scollDown()
        {
            Dimension size = driver.manage().window().getSize();
            int x = size.getWidth() / 2;
            int starty = (int) (size.getHeight() * 0.60);
            int endy = (int) (size.getHeight() * 0.10);
      //      driver.swipe(x, starty, x, endy, 2000);

        }

     @Test
     public void datePicker()
     {
         WebElement e;
        driver.findElementByAccessibilityId("Steppers").click();
        driver.findElementByAccessibilityId("Increment").click();
        driver.findElementByAccessibilityId("Increment").clear();
        e= (WebElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(1);
        System.out.println(e.getText());
        WebElement e2= (WebElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(2);
        System.out.println(e.getText());
        driver.findElementByAccessibilityId("Decrement").click();
        e= (WebElement) driver.findElementsByClassName("XCUIElementTypeStaticText").get(1);
        System.out.println(e.getText());
        driver.navigate().back();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByName("Green color component value").sendKeys("220");
        driver.findElementByClassName("XCUIElementTypePickerWheel").sendKeys("55");
        driver.findElementByXPath("//*[@name='Blue color component value']").sendKeys("130");
    }
}
