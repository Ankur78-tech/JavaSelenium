package main.java;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
        WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown= new Select(staticDropdown);
		dropdown.selectByIndex(2);
		
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
	    driver.findElement(By.xpath("//a[@value='VNS']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
	    
	 //   Assert.assertFalse(false)
	    
	    
	    
	    driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(2000);
	    
	   List<WebElement> items = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	   
	   for(WebElement option: items) {
		   if(option.getText().equalsIgnoreCase("India")) {
			   option.click();
			   break;
		   }
	   }
	   
	   
	}

}
