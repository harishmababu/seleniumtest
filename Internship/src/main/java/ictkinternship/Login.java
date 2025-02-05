package ictkinternship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void setLog() {
		WebElement logg=driver.findElement(By.xpath("//a[@href='/login']"));
		logg.click();
	}
//entering username
	public void setUsername(String  username) {
		WebElement uname=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedStart css-1ixds2g']"));
		uname.click();
		uname.sendKeys(username);
		
	}
//entering password
	public void setPasswrd(String password) {
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.click();
		pass.sendKeys(password);
		
	}
//clicking login button
	public void login() {
		WebElement log=driver.findElement(By.xpath("//button[@type='submit']"));
		log.click();
		System.out.println("Mentor login sucessfull");
		
	}
}

