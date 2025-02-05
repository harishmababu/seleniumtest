package ictinternship;

import org.testng.annotations.Test;

public class HomeTest extends BaseLog {
HomePage HP;
	
	@Test
	public void verifyelements() throws Exception {
		HP=new HomePage(driver);
		HP.verifyelement();

}
}
