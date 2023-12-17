package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragAnddropTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
		
	WebElement fiveThousand = driver.findElement(By.xpath("(//*[@class='button button-orange'])[4]"));
		
		WebElement Amount = driver.findElement(By.xpath("(//*[@class='placeholder'])[4]"));
		
		 Actions action = new Actions(driver);
		  
		  action.dragAndDrop(fiveThousand, Amount).build().perform();
			
		
  }
  
 
  
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
		
 driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
