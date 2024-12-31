package seleniumPractic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerElement=driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerElement.findElements(By.tagName("a")).size());
		
		WebElement columElement = footerElement.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
        System.out.println(columElement.findElements(By.tagName("a")).size());
        
        for(int i=1; i<columElement.findElements(By.tagName("a")).size(); i++) {
        	String clickonLink= Keys.chord(Keys.CONTROL, Keys.ENTER);
        	columElement.findElements(By.tagName("a")).get(i).sendKeys(clickonLink);
        			
        }
        
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        
        while(it.hasNext()) {
        	driver.switchTo().window(it.next());
        	System.out.println(driver.getTitle());
        }

	}

}
