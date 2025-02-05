package testobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class LogTest {
	WebDriver driver;
	Properties props;
	
	public void readProp() throws  IOException  { 
		
		props=new Properties();
		FileInputStream fileinp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\log.properties");
		props.load(fileinp);
		
		
		
	}

	@BeforeMethod
	public void testLog() throws IOException
	{ 
		readProp();
		String browser=props.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) 
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get(props.getProperty("url"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
	

@AfterTest
public void tearDown() {
	driver.quit();
}
}
