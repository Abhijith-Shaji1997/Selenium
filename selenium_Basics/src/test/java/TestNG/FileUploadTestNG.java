package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FileUploadTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	WebElement chooseFile = driver.findElement(By.id("file-upload"));
		
		chooseFile.sendKeys("H:\\java\\Screenshot (1).png");
  }
  
  @Test
  
  public void TestCase1() {
	  
	  System.out.println("File uploaded susccessfully");
		
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
	driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
