package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class KeyBoardAndMouseTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
		inputForm.click();
  }
  
  @Test
  
  public void TestCase2() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
		inputForm.click();
	  
	  WebElement EnterMessage= driver.findElement(By.xpath("//*[@id='single-input-field']"));
	  
	  
	Actions action = new Actions(driver);
		
	
		
		action.keyDown(Keys.SHIFT).build().perform();
		
		EnterMessage.sendKeys("hai");
		
		action.keyUp(Keys.SHIFT).build().perform();
  }
  
  
  @Test
  
  public void TestCase3() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
		inputForm.click();
	  
	//  WebElement EnterMessage= driver.findElement(By.xpath("//*[@id='single-input-field']"));
	  
	  
	Actions action = new Actions(driver);
		
	
		
		//action.keyDown(Keys.SHIFT).build().perform();
		
		//EnterMessage.sendKeys("hai");
		
		//action.keyUp(Keys.SHIFT).build().perform();
	  
	  
	  
	  WebElement showMessage = driver.findElement(By.xpath("//*[text()='Show Message']"));
	  
	  
	  action.sendKeys(showMessage,Keys.ENTER).build().perform();
	  
	  
	  
	  
  }
  
  
  @BeforeClass
  
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
