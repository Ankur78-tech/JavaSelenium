package TestNG;

import org.testng.annotations.Test;

public class day4 {

	@Test(dataProvider="getData")
	public void credential(String UssrName, String psswrd) {
		System.out.println("ussrname");
		System.out.println("psswrd");
	}

	
	public Object[][] getData()  {
		Object[][] data= new Object[3][2];
		
		data[0][0]= "fName";
		data[0][1]= "fPsswrd";
		
		data[1][0]= "sName";
		data[1][1]= "sPsswrd";
		
		data[2][0]= "tName";
		data[2][1]= "tPsswrd";
		
		return data;
	}
}
