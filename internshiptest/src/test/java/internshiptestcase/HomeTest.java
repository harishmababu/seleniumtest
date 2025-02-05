package internshiptestcase;

import org.testng.annotations.Test;

import internshiptest.HomePage;

public class HomeTest extends BaseLog {
HomePage HP;
	
	@Test
	public void verifyelements() throws Exception {
		HP=new HomePage(driver);
		HP.verifyelement();

}
}
