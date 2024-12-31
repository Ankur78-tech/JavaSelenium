package seleniumPractic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class random1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("benzradio")).click();
		
		driver.findElement(By.xpath("//input[@id='benzcheck']")).click();
		
		WebElement dropdown= driver.findElement(By.id("carselect"));
		Select staticDD = new Select(dropdown);
		staticDD.selectByValue("honda");
		
		//alert
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("ankur");
		driver.findElement(By.xpath("//input[@class='btn-style'][1]")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//select multiple option
		Actions a = new Actions(driver);
		
		WebElement opt1 = driver.findElement(By.xpath("//option[@value='apple']"));
		WebElement opt2 = driver.findElement(By.xpath("//option[@value='orange']"));
		
		a.keyDown(Keys.CONTROL).click(opt1).click(opt2).keyUp(Keys.CONTROL).build().perform();
		
	
		
		
		//autosuggestive
		driver.findElement(By.id("autosuggest")).sendKeys("appi");
		
		Thread.sleep(3000);
		List<WebElement> items = driver.findElements(By.id("ui-id-1"));
		
		for(int i=0; i<items.size(); i++) {
			System.out.println(items.get(i).getText());
			
			if(items.get(i).getText().equalsIgnoreCase("Appium Java")) 
				driver.findElement(By.xpath("//a[@id='ui-id-27']")).click();
			break;
		}
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement hover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		a.moveToElement(hover).build().perform();
		
			
	}
}
