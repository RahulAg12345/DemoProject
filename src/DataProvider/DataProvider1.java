package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	
	@Test(dataProvider="DataTest")
	public void testdata(String Name,String dep,int Sal) {
		
		System.out.println("Name is "+ Name+ ", Department is "+ dep+ ", Salary is "+ Sal);
		
	}
	
	@DataProvider(name="DataTest")
	public Object[][] getdata() {
		
		Object[][] data = {{"Rahul","IT",35000},{"Aman","BPO",15000}};
		return data;
	}
	

}
