package seleniumPractic;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flightBooking {

	public static void main(String[] args) throws InterruptedException {
	    
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropDown = new Select(staticDropdown);	
		dropDown.selectByVisibleText("INR");
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();	
		
		int i=1;
		while(i<5) {
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		/*-----------Auto Suggestive from text-----------------------------------*/
		
		driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("ind");
		Thread.sleep(3000);
		
		List <WebElement> autoSuggestive= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement items : autoSuggestive) {
			if(items.getText().equalsIgnoreCase("India")) {
				items.click(); 
		break;}
			
		}
			    
		
     /*--------------------//Dynamic DropDown------------------------------------*/
		
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		    
		Thread.sleep(2000);
		
	     driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		
	     Thread.sleep(1000);
	  /*-------------------to select calender date----------------------------*/
	 	
	 	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();
	 	
	 	
	  /*-------------------validation to check the enabled/disable button--------------------------

	 	System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style"));
	 	
	 	if(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style").contains("1")) {
	 		System.out.println("Enabled");
	 	}-*/
	}
	
}
