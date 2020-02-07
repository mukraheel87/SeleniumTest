package WebAutomation.WebAutomation;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.WebDriver.Options;


public class MyClassTest {
	
	  //Create driver object for Chrome
    
    WebDriver driver;
    
    
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Befor Test");
		
		
		
		//setup the chromedriver using WebDriverManager 
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      
	}
	
  @Test(description = "This is my Login Test")
  public void LoginTest() {
	
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
      //Navigate to a URL
      driver.get("https://crown-micro.net/");
      
      //WebElement txtUserName = wait.until(presenceOfElementLocated(By.name("txtUserName")));
     // txtUserName.sendKeys("test");
      
      int a =  driver.findElements(By.xpath("dd")).size();
      

      
      WebElement txtUserPassword = wait.until(presenceOfElementLocated(By.name("txtUserPassword")));
      txtUserPassword.sendKeys("test");
      
      WebElement btnLogin = wait.until(presenceOfElementLocated(By.name("btnLogin")));
      btnLogin.click();

     }
  
  
  @AfterTest
  public void AfterTest()
  {
	  System.out.println("After Test");
	  
	 
	  //quit the browser and next
      driver.quit();
  }

}
