package main.java;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		int tLinkCount = driver.findElements(By.tagName("a")).size();
		System.out.println(tLinkCount);

		WebElement footer = driver.findElement(By.id("gf-BIG"));
		int fLinkCount = footer.findElements(By.tagName("a")).size();
		System.out.println(fLinkCount);

		WebElement column1 = driver.findElement(By.xpath("//div/table/tbody[1]/tr/td[1]/ul"));
		int cLinkCount = column1.findElements(By.tagName("a")).size();
		System.out.println(cLinkCount);

		List<WebElement> cLink = column1.findElements(By.tagName("a"));

		for (int i = 1; i < cLink.size(); i++) {

			String ClickOn = Keys.chord(Keys.CONTROL, Keys.ENTER);

			column1.findElements(By.tagName("a")).get(i).sendKeys(ClickOn);

		}

		Set<String> title = driver.getWindowHandles();
		Iterator<String> it = title.iterator();

		while (it.hasNext()) {

			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	} 

}
