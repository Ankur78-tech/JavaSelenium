import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows=driver.getWindowHandles(); //[parentid, childid]
		
		Iterator<String> it = windows.iterator();
		
		String parentId=it.next();  //get parent Id
		
		String childId=it.next();   //child Id
		
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());

		String s= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(s);
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(s);
	}

}
