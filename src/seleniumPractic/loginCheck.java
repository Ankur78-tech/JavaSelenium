package seleniumPractic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.id("inputUsername")).sendKeys("ankurky007");
		driver.findElement(By.name("inputPassword")).sendKeys("xyzabc");

		driver.findElement(By.className("signInBtn")).click();

		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.partialLinkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ankur");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("psswrd");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("6916329619");
		driver.findElement(By.className("reset-pwd-btn")).click();
		String s=driver.findElement(By.xpath("//form/p")).getText();
		System.out.println(s);
		
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Go to')]")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("unknown");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	}

}
