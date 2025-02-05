package internshiptest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReferenceMaterial {
WebDriver driver;
public ReferenceMaterial(WebDriver driver) {
	this.driver=driver;
}
public void viewRef()
{
	WebElement vr=driver.findElement(By.xpath("//a[@href='/reference-material']"));
	vr.click();
}
public void addRef()
{
	WebElement ar=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary css-79xub']"));
	ar.click();
	WebElement tl=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));
	tl.click();
	tl.sendKeys("projectTest");
	WebElement desc=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[2]/div/input"));
	desc.click();
	desc.sendKeys("details of project");
	WebElement link=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/div[3]/div/input"));
	link.click();
	link.sendKeys("www.wikipedia.com");
	driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-1ujsas3']")).click();
	System.out.println("New Reference material is added");
}
public void delRef()
{
	driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSecondary MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeSmall MuiButton-containedSizeSmall MuiButton-colorSecondary css-1y02dll']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.dismiss();
	System.out.println("Reference material is deleted");
}
public void logout() {
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	System.out.println("Mentor is loged out");
	
}
}
