package testngPractice;

import org.testng.annotations.Test;

public class Testpractice {

	
	@Test(invocationCount= 2)
	public void update() {
		System.out.println("Update");
	}
		@Test(priority=-1)
		public void one() {
			System.out.println("Harshitha");
		}
		
		@Test
		public void delete() {
			System.out.println("Delete");
		}
		
		@Test(dependsOnMethods="update")
		public void create() {
			System.out.println("Create");
		}
		
		@Test(dataProviderClass=DataProvider1.class, dataProvider="data")
			public void getdata(String src, String dest, int price)
			{
				System.out.println("From"+src+"To"+dest+"Price"+price);
				
			}
		}
	

