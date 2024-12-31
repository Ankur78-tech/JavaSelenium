import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		// driver.manage().deleteCookieNamed("sessionKey"); (delete specific cookie)

		driver.get("https://www.google.com/");

		// OutputType.FILE is saying get screenshot in file open format
	  	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("D:\\Delete\\screenshot.png"));
	}

}
