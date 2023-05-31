package testngPractice;

import org.testng.annotations.DataProvider;

public class DataProvider1 {
	
	//@Test(dataProvider="data")
	

	@DataProvider
	public Object[][] data() {
		Object [][] arr= new Object[2][3];
		arr[0][0]="Bangalore";
		arr[0][1]="Mysore";
		arr[0][2]=100;
		
		arr[1][0]="Qspiders";
		arr[1][1]="Testyantra";
		arr[1][2]=200;
		return arr;
		
	}
}
