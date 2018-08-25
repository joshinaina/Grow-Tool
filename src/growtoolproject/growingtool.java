package growtoolproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.testng.annotations.Test;

public class growingtool {


	
	@Test

    public void naina() {
	
	WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver_win32\\chromedriver.exe");
				
		driver=new ChromeDriver();
		
		//opening a growtool 
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://growtool.littlemonkey.info/");
		
		//click on home page
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Home")).click();
		
		//click on About us
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.linkText("About Us")).click();
		

	       //click on contact
	       
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.linkText("Contact Us")).click();
	     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     
	     //click on register
	     
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.linkText("Register")).click();
	     
	     //JavascriptExecutor js = ((JavascriptExecutor) driver);
	     //js.executeScript("window.scrollTo(450, 500)");
	     
	 
	     
	        //writing a business name
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//*[@id=\"Form_Form_Name\"]")).sendKeys("littlemonkey");
	     
	       //Business Type
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.id("Form_Form_BusinessTypeID")).click();
	     
	     
	     
	     
	     
	     
	     // writing a first name
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.id("Form_Form_FirstName")).sendKeys("Sunaina Joshi");
	     
	     //sur name
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.id("Form_Form_Surname")).sendKeys("Josh");
	     
	   //email
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.id("Form_Form_Email")).sendKeys("abcd@gmail.com");
	     
	   //Phone Number
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     driver.findElement(By.id("Form_Form_Mobile")).sendKeys("0258963147");
	     
	     
	     
	     
       
       
    }
	}
	

