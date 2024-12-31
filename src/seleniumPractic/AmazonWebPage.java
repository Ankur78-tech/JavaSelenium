package seleniumPractic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebPage {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14"+ Keys.RETURN);

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> items= driver.findElements(By.className(".product-name"));
		
		for(int i=0; i<items.size(); i++) {
			String name=items.get(i).getText();
			
			if(name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[@type='button' and text()='ADD TO CART']")).get(i).click();
				
				break;
			}
		}
	}

}
