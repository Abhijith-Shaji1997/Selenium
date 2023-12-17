package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AlertHandlingTestNG {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  WebElement clickMe = driver.findElement(By.xpath("//*[@class='btn btn-warning']"));
		
		clickMe.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		  driver.switchTo().alert().accept();
		
		
  }
  
  @Test
  
  public void test2() throws InterruptedException {
	  WebElement b = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		
		b.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Abhijith");
		
		  driver.switchTo().alert().accept();
		
		
  }
  
 
  
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		
	driver=new ChromeDriver();
		
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
