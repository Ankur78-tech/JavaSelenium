package seleniumPractic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameWorkDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName= "ZARA COAT 3";
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
		driver.findElement(By.id("userEmail")).sendKeys("anshika@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Iamking@000");
		
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> items= driver.findElements(By.cssSelector(".mb-3"));
		
//		for(int i=0; i<items.size(); i++) {
//              String name= items.get(i).getText();
//              
//              System.out.println("name");
		
		
		WebElement prod = items.stream().filter(item->item.findElement
				(By.cssSelector("b")).getText().equals("productName")).findFirst().orElse(null);
		
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
             
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
		
		driver.findElement(By.cssSelector("btn btn-custom"));
		}

	}


