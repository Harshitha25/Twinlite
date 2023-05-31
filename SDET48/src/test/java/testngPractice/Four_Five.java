package testngPractice;

import org.testng.annotations.DataProvider;

public class Four_Five {
	@DataProvider
	public Object[][] data(){
		Object[] [] arr= new Object[4][5];
		arr[0][0]=1;
		arr[0][1]="animals";
		arr[0][2]="Dog";
		arr[0][3]="cat";
		arr[0][4]="Cow";
		
		arr[1][0]=2;
		arr[1][1]="fruits";
		arr[1][2]="Apple";
		arr[1][3]="Orange";
		arr[1][4]="Mango";
		
		arr[2][0]=3;
		arr[2][1]="City";
		arr[2][2]="Mysuru";
		arr[2][3]="Bengaluru";
		arr[2][4]="Mangaluru";
		
		arr[3][0]=4;
		arr[3][1]="seasons";
		arr[3][2]="Summer";
		arr[3][3]="Spring";
		arr[3][4]="Rain";
		return arr;
		
	}
}
