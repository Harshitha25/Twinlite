package testngPractice;

import org.testng.annotations.DataProvider;

public class Two_Two {
	@DataProvider
	public Object[][] capital(){
		Object[][] arr= new Object[2][2];
		arr[0][0]="India";
		arr[0][1]="Delhi";
		
		arr[1][0]="USA";
		arr[1][1]="Washington";
		return arr;
	}

}
