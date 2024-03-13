package Runner;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericScript.Baseclass;
import PomScript.Pom_FB;

public class Runner2 extends Baseclass
{
	@DataProvider(name="test1")
	 public Object[][] createData1()
	 {
		 return new Object[][]
		{
			 {"lavanya" , "123"},{"pooja","456"}
		};
	 }
	@Test(dataProvider="test1")
	 public void fblogin(String un,String pwd) throws InterruptedException
	 {
		 Pom_FB p=new Pom_FB(driver);
		 p.username(un);
		 p.pass(pwd);
		 Assert.fail();
		 Thread.sleep(8000);
		 p.login();
		 
		 
	 }
	 		 

}
