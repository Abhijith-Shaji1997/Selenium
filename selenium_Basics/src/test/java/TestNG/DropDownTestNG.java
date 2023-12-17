package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropDownTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
		WebElement selectColor = driver.findElement(By.id("single-input-field"));
		
		Select select = new Select(selectColor);
		
		select.selectByValue("Red");
		
		List<WebElement> list = select.getAllSelectedOptions();        
		
		for(WebElement i: list) {
			
			System.out.println(i.getText());
			
		
		
		
  }
  }
  
  @Test
  
  public void getOptions() {
	  
		WebElement selectColor = driver.findElement(By.id("single-input-field"));
		
		Select select = new Select(selectColor);
		
		List<WebElement> list1 = select.getOptions();
		
		for(WebElement a:list1) {
			
			System.out.println(a.getText());
		}
  }
  
  @Test
  
  public void Multiple() {
	  
	  
	  WebElement selectColor = driver.findElement(By.id("single-input-field"));
	  
	  Select select = new Select(selectColor);
	  
	  Boolean result = select.isMultiple();
		
		System.out.println(result);
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.edgedriver().setup();
		 driver =new EdgeDriver();
		
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
