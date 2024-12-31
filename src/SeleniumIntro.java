import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        WebDriver driver= new ChromeDriver();
      //implict wait - 5 sec time out	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        
     // String password=getPassword(driver);
        
//<input type="text" placeholder="Username" id="inputUsername" value="">  
     driver.findElement(By.id("inputUsername")).sendKeys("Ankur");
     
//<input type="password" placeholder="Password" name="inputPassword" value="">   
     driver.findElement(By.name("inputPassword")).sendKeys("Akuyd");
        
     
//<button class="submit signInBtn" type="submit">Sign In</button>
     driver.findElement(By.className("signInBtn")).click();
 

     
//<p class="error">* Incorrect username or password </p>
    //tagname.classname
    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    
//<a href="#">Forgot your password?</a>
    //linkText

    
     
//as click on forgot psswrd, it is swwitching to another login button     
     Thread.sleep(1000);
     driver.findElement(By.linkText("Forgot your password?")).click();
//<input type="text" placeholder="Name">    
     //Tagname[@attribute=’value’][index]
     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

//<input type="text" placeholder="Email">
     //Tagname[attribute='value']
     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
     driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();

     driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("xyz@gmail.com");
     
//<input type="text" placeholder="Phone Number" xpath="1">     
     driver.findElement(By.xpath("//form/input[3]")).sendKeys("964896");
     
//<button class="reset-pwd-btn" xpath="1">Reset Login</button>
     //.classname 
     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
     
//<p class="infoMsg" xpath="1">Please use temporary password 'rahulshettyacademy' to Login. </p>
     System.out.println(driver.findElement(By.cssSelector("form p")).getText());
     
     
//<button class="go-to-login-btn" xpath="1">Go to Login</button>
     
     driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
     
     //Now try to login with correct ID psswrd
     driver.findElement(By.cssSelector("#inputUsername")).sendKeys("ankur");
     driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("password");
    
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
  }
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String psswrdText=driver.findElement(By.cssSelector("form p")).getText();
		
		//spliting this string
		String[] psswrdArray=psswrdText.split("'");
		//0th index->Please use temporary password '
		//1st Index-->'rahulshettyacademy' to Login.
		String password=psswrdArray[1].split("'")[0];
		
		return password;
	}
}
