import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        //<a href="http://www.restapitutorial.com/" xpath="1">REST API</a>
        String url= driver.findElement(By.cssSelector("a[href='http://www.restapitutorial.com/']")).getAttribute("href");
        
       HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
       
       conn.setRequestMethod("HEAD");
       conn.connect();
       int respCode=conn.getResponseCode();
       
       System.out.println(respCode);
       
       
      // for all the links test 
       List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li] a"));
       
       for(WebElement link: links) {
    	   String url1= link.getAttribute("href");
           
           HttpURLConnection conn1= (HttpURLConnection)new URL(url).openConnection();
           
           conn.setRequestMethod("HEAD");
           conn.connect();
           int respCode1=conn.getResponseCode();
           
           System.out.println(respCode);
           
           if(respCode1>400) {
        	   System.out.println("Broken Link: "+ link.getText()+ " havinf code as "+ respCode);
        	 //  Assert.assertTrue(false);
           }
       }
	}

}
