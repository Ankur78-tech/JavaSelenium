package main.java;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.linkText("Top Deals")).click();
		
		Set<String> window= driver.getWindowHandles();
		Iterator<String> it= window.iterator();
		
		String parentID= it.next();
		String childId= it.next();
		
		driver.switchTo().window(childId);
		Thread.sleep(3000);
	   
	}

}
