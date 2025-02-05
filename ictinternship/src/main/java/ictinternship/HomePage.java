package ictinternship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		
		this.driver = driver;
	}
	//Verify whether design and graphics is displayed		

public void verifyelement() throws InterruptedException {
	Thread.sleep(1000);
	boolean isDisplayed=driver.findElement(By.xpath("//img[@src='/static/media/homeimage.b8e88c90be67b07eac3b.png']")).isDisplayed();
	
	if (isDisplayed) {
		System.out.println("ICTAKinternship portal design is displayed.");
		
	} else {
        System.out.println("ICTAKinternship portal design is not displayed");
	}
//Verify whether login is displayed

	boolean isDisplayedD=driver.findElement(By.xpath("//a[@href='/login']")).isDisplayed();
	
	if (isDisplayedD) {
		System.out.println("Login is displayed.");
		
	} else {
        System.out.println("Login is not displayed");
	}
	
}

}
