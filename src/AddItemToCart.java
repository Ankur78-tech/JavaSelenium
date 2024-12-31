import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCart {

	private static void addItem(WebDriver driver, String itemsNeeded[]) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j = 0;
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List itemsList = Arrays.asList(itemsNeeded);

			if (itemsList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// Thread.sleep(4000);
			}

		}
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String itemsNeeded[] = { "Cucumber", "Tomato", "Carrot", "Mushroom" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		addItem(driver, itemsNeeded);

		// Thread.sleep(2500);

		driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		// Thread.sleep(1000);
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacadem");

		driver.findElement(By.className("promoBtn")).click();
		
		String s= driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(s);
	}

}
