package testngPractice;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Fromexcel {
	public Object[][] data(String sheet) throws Throwable {
		FileInputStream fis= new FileInputStream("./src/test/resources/DataProvider.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh= wb.getSheet(sheet);
		int lastRow=sh.getLastRowNum()+1;
		int lastcell=sh.getRow(0).getLastCellNum();
		//DataFormatter dtf=new DataFormatter(); 
		Object [] [] obj= new Object[lastRow][lastcell];
		for(int i=0;i<lastRow;i++)
		{
			for (int j=0;j<lastcell;j++)
			{
				
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
	
	@Test(dataProviderClass=FromExcelUtility.class, dataProvider="getdata")
	public void getdata(String src, String dest, String price) {
		System.out.println(src+"---->"+dest+"---->"+price);
	}
}
