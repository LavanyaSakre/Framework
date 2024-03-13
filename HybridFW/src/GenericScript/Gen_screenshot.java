package GenericScript;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Gen_screenshot 
{
	public static void get_photo(WebDriver driver) 
	{
		 Date d=new Date();
		 String d1=d.toString();
		 String da=d1.replaceAll(":","-");
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File tmp = ts.getScreenshotAs(OutputType.FILE);
	     File pmt=new File("./screenshot/"+da+".jpeg");
	     try
	     {
	     FileHandler.copy(tmp, pmt);
	     }
	     catch(IOException e)
	     {
	    	 System.out.println("not captured");
	    	 e.printStackTrace();
	     }
   		
	}

	


}
