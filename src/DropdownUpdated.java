import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUpdated {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

         WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
//		Thread.sleep(3000);
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(2000);
		
		List<WebElement> option=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement options:option) {
			
			if(options.getText().equalsIgnoreCase("India")) {
				options.click();
			}
		}
		
	}

}
