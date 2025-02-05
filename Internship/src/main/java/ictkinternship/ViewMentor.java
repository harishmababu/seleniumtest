package ictkinternship;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewMentor {
	WebDriver driver;

	public ViewMentor(WebDriver driver) {
		this.driver=driver;
	}
	//viewing the list of mentors
	public void mentor() throws InterruptedException
	{

		driver.findElement(By.xpath("//a[@href='/mentors']")).click();
		Thread.sleep(1000);
		System.out.println("Mentor list is displayed");
	}
	public void update()
	{
		WebElement up=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary update-button css-1ujsas3']"));
		up.click();	
}
	
	public void name(String nname) 
	{
		WebElement ne=driver.findElement(By.xpath("//input[@aria-invalid='false']"));
		ne.click();
		ne.clear();
		ne.sendKeys(nname);
	}
	public void sub() throws InterruptedException
	{
		WebElement sb=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary submit-button css-1hw9j7s']"));
		sb.click();
		Thread.sleep(1000);
		
	}

	public void project() throws InterruptedException
	{

		driver.findElement(By.xpath("//a[@href='/project']")).click();
		Thread.sleep(3000);
		System.out.println("project list is displayed");
	}
	public void logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/login']")).click();	
		System.out.println("Admin logged out");
	}

}

