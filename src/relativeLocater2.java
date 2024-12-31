import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativeLocater2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handels = driver.getWindowHandles();
		
		Iterator<String> it = handels.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/");
		
		String course= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		
		driver.switchTo().window(parentID);
		
	WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	name.sendKeys(course);
	
	File src = name.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("logo.png"));
//		
//	System.out.println(name.getRect().getDimension().getHeight());
//	System.out.println(name.getRect().getDimension().getWidth());
	}

}
