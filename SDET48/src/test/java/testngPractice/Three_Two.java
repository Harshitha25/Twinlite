package testngPractice;

import org.testng.annotations.DataProvider;

public class Three_Two {
	@DataProvider
	public Object[][] states(){
		Object[][]arr= new Object[3][2];
		arr[0][0]= "water";
		arr[0][1]="liquid";
		
		arr[1][0]="vapour";
		arr[1][1]="gas";
		
		arr[2][0]="ice";
		arr[2][1]="solid";
		return arr;
		
		
	}

}
