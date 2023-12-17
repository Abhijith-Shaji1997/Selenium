package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class RainbowsTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement searchProducts= driver.findElement(By.id("un"));
		
		searchProducts.sendKeys("APPLE");
		
	WebElement searchButton=driver.findElement(By.name("Search"));
		
		searchButton.click();
		
  }
  

  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	   driver = new ChromeDriver();
	  
		
		driver.get("https://groceryapp.uniqassosiates.com/home");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
