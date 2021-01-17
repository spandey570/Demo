package testScripts;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LaunchSafari {

    public void brows() throws MalformedURLException, MalformedURLException {
        IOSDriver driver;

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://gmail.com");
        driver.findElementByName("Email").sendKeys("spandey570");
        driver.findElementByName("Passwd").sendKeys("Srikant");
        driver.findElementByName("signIn").click();
    }
}
