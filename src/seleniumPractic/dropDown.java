package seleniumPractic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		  
		 
		/* -----Static Dropdown-------
		 WebElement staticDrop= driver.findElement(By.className("valid"));
				 
		 Select dropdown= new Select(staticDrop);
		 
		 dropdown.selectByValue("AED");
		 
		 dropdown.selectByIndex(1);
		 
		 dropdown.selectByVisibleText("INR");
		 
		 String s= dropdown.getFirstSelectedOption().getText();
		 
		 System.out.println(s);  */
		 
		 driver.findElement(By.cssSelector("#divpaxinfo")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		 
		 driver.findElement(By.cssSelector("#hrefIncAdt")).click();

	}

}
