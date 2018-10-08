package demo.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	WebDriver driver;
	
	public void Testng()
	{
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com");
	DemoMethod M = new DemoMethod();
	M.Test();
	}

}
