package seleniumPractic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> it= windows.iterator();
		
		String parentID= it.next();
		String childID= it.next();
		
		driver.switchTo().window(childID);
		
	String s=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
	
	System.out.println(s);

	}

}
