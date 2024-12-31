package seleniumPractic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generalRevision {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
        
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("ankur");
		
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("123");
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		String s=driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(s);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.cssSelector(("input[placeholder='Name']"))).sendKeys("Ankur");
		
		driver.findElement(By.cssSelector(("input[placeholder='Email']"))).sendKeys("xyz@gmail.com");
		
		driver.findElement(By.cssSelector(("input[placeholder='Email']"))).clear();
		
		driver.findElement(By.cssSelector(("input[placeholder='Email']"))).sendKeys("abc@gmail.com");
		
		driver.findElement(By.cssSelector(("input[placeholder='Phone Number']"))).sendKeys("964896");
		
		driver.findElement(By.cssSelector(("button[class='reset-pwd-btn']"))).click();
		
		
		
		String s1=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		
		System.out.println(s1);
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] psswrdArray=s1.split("'");
		System.out.println(psswrdArray[1]);
		
		
	}

}
