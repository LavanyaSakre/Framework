package GenericScript;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import Utils.Fetch_prop;

public class Baseclass implements Framework1_constants
{
	public WebDriver driver;
	 @BeforeMethod
	 public void openapp() throws FileNotFoundException, IOException
	 {
		 System.setProperty(chrome_key1, chrome_value1);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Fetch_prop.fetch_data("./Prop.properties","baseUrl"));
	 }
	 @AfterMethod
	 public void closeapp(ITestResult res)
	 {
		 if(ITestResult.FAILURE==res.getStatus())
		 {
			 Gen_screenshot.get_photo(driver);
		 }
		 driver.close();
	 }

}
