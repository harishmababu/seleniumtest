package testcases;

import org.testng.annotations.Test;

import sampletest.AccountLog;

public class Amazonlog extends AmazonTest{
AccountLog obj;
@Test
public void test() throws InterruptedException
{
	obj=new AccountLog(driver);
	obj.search();
	obj.itemCart();
	obj.homepage();
	obj.sale();
	obj.menuSelect();
	
}
}
