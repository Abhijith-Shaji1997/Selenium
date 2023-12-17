package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class GetTotalTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		
		inputForm.click();
		
  }
  
  public void EnterValues() {
	  
	WebElement enterValueA = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		
		enterValueA.sendKeys("45");
		
WebElement enterValueB = driver.findElement(By.xpath("//*[@id='value-b']"));
		
		enterValueB.sendKeys("76");
		
  }
  
 
  
  
  
  @Test
  
  public void Print() {
	  
	  WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		
			inputForm.click();
			
	WebElement enterValueA = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
			
			enterValueA.sendKeys("45");
			
	WebElement enterValueB = driver.findElement(By.xpath("//*[@id='value-b']"));
			
			enterValueB.sendKeys("76");
			
		  
			Actions action = new Actions(driver);
			
			action.keyDown(Keys.TAB).build().perform();
			
	WebElement geTotal = driver.findElement(By.xpath("(//*[@type='button'])[3]"));
			
			action.keyDown(Keys.ENTER).build().perform();
	  
	 
	  

	
  }
  
  
  @Test 
 public void Print2(){
	  WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		
		inputForm.click();
		
WebElement enterValueA = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		
		enterValueA.sendKeys("45");
		
WebElement enterValueB = driver.findElement(By.xpath("//*[@id='value-b']"));
		
		enterValueB.sendKeys("76");
		
	  
		Actions action = new Actions(driver);
		
WebElement geTotal = driver.findElement(By.xpath("(//*[@type='button'])[3]"));
		
		action.keyDown(Keys.ENTER).build().perform();
		
		WebElement Total = driver.findElement(By.xpath("//*[@id='message-two']"));
		
		System.out.println(Total.getText());
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.edgedriver().setup();
		
	 driver = new EdgeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.quit();
  }

}
