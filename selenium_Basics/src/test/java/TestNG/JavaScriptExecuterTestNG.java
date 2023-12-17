package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class JavaScriptExecuterTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  
		WebElement readMore = driver.findElement(By.xpath("(//a[contains(text(),'Read more')])[2]"));
		
		js.executeScript("arguments[0].scrollIntoView();",readMore);
		
		js.executeScript("arguments[0].click();",readMore);
		
		
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
