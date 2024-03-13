package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetch_prop 
{
  @Test
  public static String fetch_data(String path,String key) throws FileNotFoundException, IOException
  {
	  Properties p=new Properties();
	  p.load(new FileInputStream(path));
	  String val=p.getProperty(key);
	  return val;
  }
  
}
