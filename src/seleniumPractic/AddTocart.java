package seleniumPractic;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String itemsNeeded[] = { "Cucumber", "Tomato", "Carrot", "Mushroom" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
          Thread.sleep(1500);
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int j=0;
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List itemsList = Arrays.asList(itemsNeeded);

			if (itemsList.contains(formatedName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		//		 Thread.sleep(4000);
			}

		}
	}
}
