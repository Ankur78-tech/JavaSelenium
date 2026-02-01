import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@AfterTest
	public void AftereTest() {
		System.out.println("I will execute After test");

	}
	
	@Test
	public void pLoan() {
		System.out.println("personal loan");

	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I will execute before test");

	}
	
	@Test(groups= {"Smoke"})
	public void smoke2() {
		System.out.println("I'm smoke 2, from day2 class");

	}
}
