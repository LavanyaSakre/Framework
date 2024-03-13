package GenericScript;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_repo 
{
	@Test
	  public void reports1()
	  {
		 ExtentReports reports= new ExtentReports("./reports/r.html",false);
		 ExtentTest test=reports.startTest("Runner_FB");
		 test.log(LogStatus.PASS, "tc passed");
		 test.log(LogStatus.FAIL, "tc failed");
		 test.log(LogStatus.SKIP, "tc skiped");
		 reports.endTest(test);
		 reports.flush();
	  }
}
