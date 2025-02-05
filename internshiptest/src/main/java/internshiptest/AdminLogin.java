package internshiptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLogin {
	WebDriver driver;
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
	}
// admin login
	
	public void Log() {
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();	
	}
//entering username
	public void setEmail(String mail) {
		
	WebElement em=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ixds2g']"));
		em.click();
		em.sendKeys(mail);
	}
//entering password
	public void setPasswd(String pass) {

	WebElement ps=driver.findElement(By.xpath("//input[@type='password']"));
		ps.click();
		ps.sendKeys(pass);	
}
//click login
	public void login() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();	
	System.out.println("Admin Login successfull");
	}

}

