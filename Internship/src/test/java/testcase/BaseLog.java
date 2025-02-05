package testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class BaseLog {
	WebDriver driver;
	Properties prop;
	public void readprops() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\ictconfig.properties");
		prop.load(fis);
	}
	@BeforeMethod
	public void testConfig() throws IOException
	{
		readprops();
		String browser=prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}

		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown()
	{
	driver.quit();
	}
}
