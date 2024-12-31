package seleniumPractic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class delete {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#top");
		driver.manage().window().maximize();
		
		
		
		
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
		
				
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dropDown = new Select(staticDropdown);
		
		dropDown.selectByIndex(2);
		
		
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("I don't know");
		
		driver.findElement(By.xpath("(//input[@value='radio1'])[1]")).click();
		
       driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys("user");
		
       driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
       
       System.out.println(driver.switchTo().alert().getText());
       
       driver.switchTo().alert().accept();

	}

}
