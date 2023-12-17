package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WebElementCommandsTestNG {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
		
		WebElement EnterMessage= driver.findElement(By.id("single-input-field"));
		
		EnterMessage.sendKeys("hai");
		
		WebElement ShowMessage= driver.findElement(By.id("button-one"));
		
		ShowMessage.click();
  }
  
  @Test
  
  public void Radio() {
	  
	  WebElement RadioButtonDemo= driver.findElement(By.linkText("Radio Buttons Demo"));
		
		RadioButtonDemo.click();
		
		WebElement Male = driver.findElement(By.id("inlineRadio1"));
		
		Male.click();
		
		Boolean result = Male.isSelected();
		
		System.out.println(result);
		
  }
  
  @Test
  
  public void EnterValue() {
	  
	WebElement enterValueA= driver.findElement(By.id("value-a"));
		
		enterValueA.sendKeys("10");
		
		WebElement enterValueB= driver.findElement(By.id("value-b"));
		
		enterValueB.sendKeys("20");
		
		WebElement getTotal= driver.findElement(By.id("button-two"));
		
		getTotal.click();
		
		Boolean result1 = getTotal.isDisplayed();
		
		System.out.println(result1);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
