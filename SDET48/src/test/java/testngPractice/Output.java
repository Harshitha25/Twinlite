package testngPractice;

import org.testng.annotations.Test;

public class Output {

	@Test(dataProviderClass=Two_Two.class, dataProvider="capital")
	public void getdata(String country, String capital) {
		System.out.println("Capital of "+ country +" is " + capital);
	}
	
	@Test(dataProviderClass=Three_Two.class, dataProvider="states")
	public void getstates(String example, String state) {
		System.out.println(state +" example is "+ example);
	}
	
	@Test(dataProviderClass=Four_Five.class, dataProvider="data")
	public void getinfo(int No, String Name, String ex1, String ex2, String ex3) {
		System.out.println(No +" "+Name+"----->"+ex1+","+ex2+","+ex3);
	}
	
}
