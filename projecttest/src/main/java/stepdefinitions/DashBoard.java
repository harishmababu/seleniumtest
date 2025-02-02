package stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoard {
	WebDriver driver=new ChromeDriver();
	@Given("the user is logged into the visitapp using {string} and {string}")
	public void the_user_is_logged_into_the_visitapp_using_and(String username, String password) {
		driver.get("https://dev.visit.ictkerala.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='bg-[#32b1dc] w-2/3 rounded-xl hover:bg-[#11a5d7] active:opacity-70 text-white font-bold py-2 px-4 mt-10 h-14 text-[20px] cursor-pointer']")).click();
	    
	}
	
	
	@When("the user navigates to the dashboard page")
	public void the_user_navigates_to_the_dashboard_page() {
	    driver.findElement(By.xpath("//a[@class='flex items-center p-2 text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700 group']")).click();
	}
	@Then("the dashboard should be displayed with relevant data")
	public void the_dashboard_should_be_displayed_with_relevant_data() {
	    System.out.println("Dashboard is displayed");
	}
	@Then("the user click add new visit")
	public void the_user_click_add_new_visit() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@class='relative w-full rounded-lg bg-[#3465eb] hover:bg-[#1d4ed8] p-0.5 shadow-lg focus:outline-none']")).click();
	    System.out.println("before select"); 
	 //  List<WebElement> ad= driver.findElements(By.xpath("//div[@id='react-select-6-placeholder']"));
	   // List<WebElement> ad= driver.findElements(By.xpath("//div[@class='css-1xc3v61-indicatorContainer']"));
//	    System.out.println("done************************"); 
//	    WebElement sd=ad.get(0);
//	    sd.click();
//	    
//	    System.out.println("done*"); 
//	    Select dropdown=new Select(sd);
//	    dropdown.selectByVisibleText("College of Engineering Vadakara(CEV) vadakara");
	   // driver.findElement(By.id("react-select-6-placeholder[0]")).click();
	   // System.out.println("done*"); 
	    
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //driver.findElement(By.xpath("//input[@class='css-8mmkcg']")).click();
	  // abd.sendKeys("adbv");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	   // WebElement a=driver.findElement(By.xpath("//input[@type='datetime-local']"));
	 // a.click();
	//  a.sendKeys("07-11-2024 16:53");
	  
	   // driver.findElement(By.xpath("//div[@id='react-select-6-placeholder' and @class='css-1jqq78o-placeholder']")).click();
	  //  System.out.println("after select");
	    //driver.findElement(By.xpath("//div[text()='College of Engineering Vadakara(CEV) vadakara']")).click();
	}
	@Then("successfully add new visit")
	public void successfully_add_new_visit() {
	    System.out.println("Successfull");
	}
}
