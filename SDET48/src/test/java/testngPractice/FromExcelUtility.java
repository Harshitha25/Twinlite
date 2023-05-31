package testngPractice;

import org.testng.annotations.DataProvider;

public class FromExcelUtility {
 @DataProvider
 public Object[][] getdata() throws Throwable{
	 Fromexcel excel= new Fromexcel();
	 Object[][] value= excel.data("Sheet1");
 
 return value;
}}
