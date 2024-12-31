import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class relativeLocaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//getting Name text using above
		WebElement editBox = driver.findElement(By.cssSelector("input[name='name']"));
		
		String s= driver.findElement(with(By.tagName("label")).above(editBox)).getText();
		
		System.out.println(s);
		
		//Skipping flex element and clicking on submit button using below
		WebElement dob= driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		//using toleft
		
		WebElement checkBox = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		
		driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
		
		//using right		
		WebElement status= driver.findElement(By.id("inlineRadio1"));
		
		String s1=driver.findElement(with(By.tagName("label")).toRightOf(status)).getText();
		System.out.println(s1);
	}

}
