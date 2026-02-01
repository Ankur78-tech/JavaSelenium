package test.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test
	public void WebloginCarLoan(String urlName) {
		System.out.println("WebloginCarLoan");
		System.out.println(urlName);
	}
	
	@Test
	public void MobilloginCarLoan() {
		System.out.println("MobilloginCarLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void APIloginCarLoan() {
		System.out.println("APIloginCarLoan");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Execute before every method in day3 class");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Execute before any method in the class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Execute after every method in the class");
	}
	
	// before class and before method is depends on class level
}
