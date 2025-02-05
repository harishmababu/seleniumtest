package ictinternship;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminDashboard {
	WebDriver driver;

	public AdminDashboard(WebDriver driver) {
		this.driver=driver;
	}

//adding a new mentor	
public void addMentor()
{

	driver.findElement(By.xpath("//a[@href='/addmentor']")).click();
}
//enter name
public void name(String nme)
{
	WebElement nm=driver.findElement(By.xpath("//input[@type='text']"));
	nm.click();
	nm.sendKeys(nme);
}
//adding  email
public void mail(String mal) {

	WebElement ml=driver.findElement(By.xpath("//input[@name='Email']"));
	ml.click();
	ml.sendKeys(mal);
}
//adding phone number
public void phoneNo(String phn) {
	WebElement ph=driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
	ph.click();
	ph.sendKeys(phn);
	
}
//adding password
public void paswrd(String psw) throws InterruptedException {
	WebElement pw=driver.findElement(By.xpath("//input[@type='password']"));
	pw.click();
	pw.sendKeys(psw);
	Thread.sleep(1000);
	
}
//adding project topic
public void topic(String pr) throws InterruptedException {
	WebElement combo=driver.findElement(By.xpath("/html/body/div/div/div/form/div/div[5]/div/div/div"));
	combo.click();
	Thread.sleep(1000);
	//combo.sendKeys(Keys.ENTER);
	combo.sendKeys(pr);
	combo.sendKeys(Keys.RETURN);
	//driver.findElement(By.xpath("/html/body/div/div/div")).click();
	Actions actions = new Actions(driver);
	actions.sendKeys(Keys.ESCAPE).perform();
	
}
//submit details
public void submit() {
	WebElement sub=driver.findElement(By.xpath("//button[@type='button']"));
	sub.click();
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	alert.dismiss();

}
//view project details
public void project() {
	WebElement prj=driver.findElement(By.xpath(" //a[text()='Projects']"));
	prj.click();
	WebElement ap=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-colorPrimary css-79xub']"));
	ap.click();
}
//adding new project
public void addTitle(String ptitle) 
 {	
	WebElement pt=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));
	pt.sendKeys(ptitle);
	WebElement pad=driver.findElement(By.xpath("//button[text()='Add']"));
	pad.click();
	System.out.println("New project is added");
	
}
//edit project title
public void titleEdit(String tedit) 
 {
	WebElement ed=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeSmall MuiButton-textSizeSmall MuiButton-colorPrimary css-1rtnrqa']"));
	ed.click();
	WebElement tedt=driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']"));
	tedt.clear();
	tedt.sendKeys(tedit);
	WebElement tsa=driver.findElement(By.xpath("//button[text()='Save']"));
	tsa.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.dismiss();
	System.out.println("Project title is edited");
 }
//deleting project title
public void titledel()
 {
	WebElement tdel=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[10]/div/div[2]/button[2]"));
	tdel.click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.dismiss(); 
	System.out.println("Project is deleted");	
 }
}
