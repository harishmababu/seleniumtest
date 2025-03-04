package internshiptestcase;

import org.testng.annotations.Test;

import internshiptest.AdminDashboard;
import internshiptest.AdminLogin;
import internshiptest.Login;
import internshiptest.MentorDashboard;
import internshiptest.ReferenceMaterial;
import internshiptest.ViewMentor;

public class TestLog extends BaseLog
{
	
	Login obj=null;
	MentorDashboard mod=null;
	ReferenceMaterial ref=null;
	AdminLogin al=null;
	AdminDashboard ad=null;
	ViewMentor vm=null;
	@Test
	public void LogTest() throws InterruptedException
	{
		
		obj=new Login(driver);
		obj.setLog();
		obj.setUsername(prop.getProperty("username"));
		obj.setPasswrd(prop.getProperty("password"));
		obj.login();
		mod=new MentorDashboard(driver);
		mod.showProject();
		mod.view();
		ref=new ReferenceMaterial(driver);
		ref.viewRef();
		ref.addRef();
		ref.delRef();
		ref.logout();
		al=new AdminLogin(driver);
		al.Log();
		al.setEmail(prop.getProperty("mail"));
		al.setPasswd(prop.getProperty("pass"));
		al.login();
		ad=new AdminDashboard(driver);
		ad.project();
		ad.addTitle("Test");
		ad.titleEdit("Test Sample");
		//ad.titledel();
//	ad.addMentor();
//	ad.name("Rohit");
//		ad.mail("rohit@gmail.com");
//		ad.phoneNo("1234567890");
//	ad.paswrd("asdfg1234");
		//ad.topic("Test ");
		//ad.submit();
		vm=new ViewMentor(driver);
		vm.mentor();
		//vm.update();
		//vm.name("anju");
		//vm.sub();
		vm.project();
		vm.logout();
	}
	

}
