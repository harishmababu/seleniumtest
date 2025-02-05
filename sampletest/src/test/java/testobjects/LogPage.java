package testobjects;

import java.time.Duration;

import org.testng.annotations.Test;

import objects.LogIn;

public class LogPage extends LogTest {
	LogIn ob;
	@Test(priority = 1)
	public void logset() throws Exception
	{
		ob=new LogIn(driver);
		ob.user(props.getProperty("uname"));
		ob.pass(props.getProperty("passwrd"));
		ob.submit();
		ob.leave();
		ob.assignLeave();
		ob.hint();
		//ob.dateOf();
		//ob.submit1();
		ob.logout();
	}
	
//@Test(priority = 2)
//public void neglog() {
//	ob=new LogIn(driver);
//	
//	ob.user(props.getProperty("usname"));
//	ob.pass(props.getProperty("pass"));
//	ob.submit();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//}
//@Test(priority = 3)
//public void neglogin() {
//	ob=new LogIn(driver);
//	ob.user(props.getProperty("uname"));
//	ob.pass(props.getProperty("pwd"));
//	ob.submit();
//}

}

