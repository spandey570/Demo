package demo.maven;

public class Test {
	WebDriver driver;
	@Test
	public void Testng()
	{
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com");
	DemoMethod M = new DemoMethod();
	M.Test();
	}

}
