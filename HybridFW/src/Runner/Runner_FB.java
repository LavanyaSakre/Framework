package Runner;



import org.testng.annotations.Test;

import GenericScript.Baseclass;
import GenericScript.Generic_ReadExcel;
import PomScript.Pom_FB;

public class Runner_FB extends Baseclass
{
 @Test
 public void fblogin() throws InterruptedException
 {
	 Pom_FB p=new Pom_FB(driver);
	 String un=Generic_ReadExcel.getdata("Sheet1", 1, 0);
	 String pwd=Generic_ReadExcel.getdata("Sheet1", 1, 1);
	 p.username(un);
	 p.pass(pwd);
	 Thread.sleep(8000);
	 p.login();
	 
	 
 }
 
}
