package GenericScript;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_ReadExcel
{
	public static String getdata(String sheet,int row,int cell)
	{
		String val="";
		try
		{
			FileInputStream fis=new FileInputStream("./excel/Fb_login.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
			val=c.toString();
		}
		catch(Exception e)
		{
			System.out.println("file not found");
			e.printStackTrace();
		}
		return val;
		}

}
