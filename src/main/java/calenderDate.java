package main.java;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String year= "2027";

		String month= "6";

		String date= "15";

		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.className("react-date-picker__inputGroup")).click();

		driver.findElement(By.className("react-calendar__navigation__label")).click();

		driver.findElement(By.className("react-calendar__navigation__label")).click(); 

		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();

		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();

		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		//System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).getText());
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i=0; i<actualList.size(); i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
		}
	}

}
