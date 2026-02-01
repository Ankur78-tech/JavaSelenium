package main.java;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCheck {

	public static void main(String[] args) {
		
		//chromeOption is used to set the behaviour of the browser
		ChromeOptions option = new ChromeOptions();
				
		//by invoking this class. I tried by setting true as all https, ssl verified or not
		option.setAcceptInsecureCerts(true);
				
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
	      System.out.println(driver.getTitle());
		
	   //option.setCapability("proxy", value);   ---for proxy login
	      
	   //to Disable website login popus
	      
	  option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

	}

}
