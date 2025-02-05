package objects;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Local;

public class LogIn {
WebDriver driver;
	
public LogIn(WebDriver driver) {
	this.driver=driver;
}
	
public void user(String uname)
{
	WebElement usrn=driver.findElement(By.name("username"));
	usrn.click();
	usrn.sendKeys(uname);
	
}
public void pass(String passwrd) {
	WebElement pwd=driver.findElement(By.name("password"));
	pwd.click();
	pwd.sendKeys(passwrd);
	
}
public void submit() {
	WebElement pw=driver.findElement(By.xpath("//button[@type='submit']"));
	pw.click();
}

public void leave() {
	WebElement lv=driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']"));
	lv.click();
	
}

public void assignLeave() throws InterruptedException {
	WebElement lve =driver.findElement(By.xpath("//a[text()='Apply']"));
	lve.click();
}
public void hint() throws InterruptedException
{
	WebElement hi =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
	Select hiv=new Select(hi);
	hiv.selectByVisibleText("CAN - FMLA");
//	hi.click();
//	hi.sendKeys("CAN - FMLA");
//	Thread.sleep(1000);
//	hi.sendKeys(Keys.ENTER);
//	WebElement lvm =driver.findElement(By.xpath("//div[@class='oxd-select-text-input']//div[text()='CAN - FMLA']"));
//	lvm.click();
//	Thread.sleep(1000);
//	lvm.sendKeys(Keys.RETURN);
	
	
	}
public void dateOf() throws InterruptedException
{
	WebElement dat=driver.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
	dat.click();
	LocalDate dattime=LocalDate.of(2024,12,11);
//	String jsScript=String.format("arguments[0].value='%$';"+"const event=new Event('change',{bubbles:true});"+"arguments[0].dispatchEvent(event);",dattime.format(DateTimeFormatter.ISO_LOCAL_DATE)); 
//((JavascriptExecutor) driver).executeScript(jsScript,dat);
	//	dat.click();
//	dat.sendKeys("2024-11-12");
	Thread.sleep(1000);
	//dat.sendKeys(Keys.RETURN);
}
//public void submit1()
//{
//	WebElement ps=driver.findElement(By.xpath("//button[@type='submit']//button[@class='submitoxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
//	ps.click();
//}
public void logout()
{
	WebElement log=driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
	log.click();
	WebElement lo=driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']"));
	lo.click();
}
}
