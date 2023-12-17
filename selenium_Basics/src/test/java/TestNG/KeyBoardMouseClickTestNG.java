package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class KeyBoardMouseClickTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
			inputForm.click();
			
			 
			  }
  
 @Test
  
  public void TestCase2() {
	  
	  
	Actions action = new Actions(driver);
		
	WebElement EnterMessage= driver.findElement(By.xpath("//*[@id='single-input-field']"));
		
		action.keyDown(Keys.SHIFT).build().perform();
		
		EnterMessage.sendKeys("hai");
		
		action.keyUp(Keys.SHIFT).build().perform();
  }
 
 @Test
 
 public void TestCase3() {
	  
	  
	  
	  WebElement showMessage = driver.findElement(By.xpath("//*[text()='Show Message']"));
	  
	  Actions action = new Actions(driver);
	  
	  
	  
		
		action.sendKeys(showMessage,Keys.ENTER).build().perform();
		
 }
	  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
