package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions a= new Actions(driver);
		
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
        a.moveToElement(move).build().perform();
        
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")))
        .click().keyDown(Keys.SHIFT).sendKeys("new balance").doubleClick().build().perform();
        
        a.moveToElement(move).contextClick().build().perform();  //right click 
	}

}
