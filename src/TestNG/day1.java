package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void demo() {
		// TODO Auto-generated method stub
       System.out.println("Hello");
	}

	@Test(groups= {"Smoke"})
	public void SecondTest() {
		System.out.println("2nd Test");
	}
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("I'm the no.1 to execute");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("I'm the no. last to execute");
	}
}
