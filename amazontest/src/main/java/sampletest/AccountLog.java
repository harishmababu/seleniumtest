package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLog {
	WebDriver driver;

	public AccountLog(WebDriver driver) {
		this.driver=driver;
	}
//search an item iphone
	public void search() throws InterruptedException {
		WebElement sear=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sear.click();
		sear.sendKeys("iphone");
		sear.sendKeys(Keys.RETURN);
		//WebElement itm=driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//a[]@href='/Apple-iPhone-14-128GB-Midnight/dp/B0BN72FYFG/ref=sr_1_1?crid=1D5YV7Q5XU9QA&dib=eyJ2IjoiMSJ9.Y6ERtAXi4bn8Q3Q1ZFAAuUyLoQhX1ooHeL27Kd1MW0CAQAGssb3mQhwNy-j5cJOLfZlnfe42Qj3xr9Ueok3ftWSYUflJ0uwea0AX5-IsPl27Vrg4XPhImToqzPcDn_-jT-L1CabQhIdl6zSq3tHIfTmAmWPfBV92WVJFPKpMcPUIp4d_Gi3UD1XGLD4enrQcvBlo8rm4_83xoikqfGVenZM3AbzN8iu-J5y-wEPabkE.gFdyOp8cRzDr6e0wuvxNvqGTWbTl3__wng75uX3J6LQ&dib_tag=se&keywords=iphone&qid=1732951932&sprefix=%2Caps%2C320&sr=8-1']"));
		WebElement itm=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		Thread.sleep(1000);
		itm.click();
	}
//search another item watches,select and add to cart and then view cart
	public void itemCart() throws InterruptedException {
		WebElement sea=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sea.click();
		sea.clear();
		sea.sendKeys("watches");
		sea.sendKeys(Keys.RETURN);
		//WebElement it=driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']//a[@href='/sspa/click?ie=UTF8&spc=MTo2NzU2ODc2OTA2NTE4MTY5OjE3MzI5NTE1OTI6c3BfYXRmOjIwMDAyMTgwMDcwNDUyMTo6MDo6&url=%2FAmazon-Essentials-Digital-Chronograph-Black%2Fdp%2FB07YQFY579%2Fref%3Dsr_1_1_ffob_sspa%3Fcrid%3D2508M5YK03JC4%26dib%3DeyJ2IjoiMSJ9.zO-fdz_ooUMgYYW_u_dkFDy0Ma1sw7o3JHa7fnKTVeNnsAhHYYuMt9f-MG5cKIfpfyEkfXUiilWBMwZHiHWC1Bv-TnF6cOMR3dC8gnkpU3ZiFhcm3pyGKPNuauBBwr07CvngwFDIOUFUH5wSv_AAIiBHaL7-1CO3Hwa0X3Ba9siaLX0HZ72d5L0oEWXtcb-V0iRdBwkc-cjCBOUr7MSPd3vnH40538aMfG7s5kQpRi2WasGEGJIngvR6eqnnQu9jSQ7EOKtMC2iB4ZLvLq8LhAgIV5pMNLLJZ4k_iFgxmIQ.jGrj9bHQJtnZdCHOgc4uxwGhr0zr91Yf7c7t2MQHEJA%26dib_tag%3Dse%26keywords%3Dwatches%26qid%3D1732951592%26sprefix%3Diphone%252Caps%252C949%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1']"));
		//it.click();
		WebElement se=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a"));
		se.click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("//a[@href='/cart?ref_=sw_gtc']")).click();
		
		}
	//go to homepage
	public void homepage()
	{
		WebElement home=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		home.click();
	}
//clicking sale
	public void sale() {
		WebElement add=driver.findElement(By.xpath("//a[@id='swm-link']"));
		add.click();
		
	}
	//click menu
	public void menuSelect() throws InterruptedException {
		WebElement item=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		Thread.sleep(1000);
		item.click();
		WebElement it=driver.findElement(By.xpath("//a[@class='hmenu-item']//div[text()='Electronics']"));
		Thread.sleep(1000);
		it.click();
			
	}

}
