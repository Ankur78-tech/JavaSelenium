package seleniumPractic;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleDrivers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(""));
	}

}
