package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TutorialsPointTestNG {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement firstName = driver.findElement(By.name("firstname"));
		
		firstName.sendKeys("Abhijith");
		
		WebElement secondName = driver.findElement(By.name("lastname"));
		
		secondName.sendKeys("Shaji");
		
  }
  
  @Test
  
  public void Gender() {
	  
	WebElement Gender = driver.findElement(By.xpath("//*[@value='Male']"));
		
		Gender.click();
  }
  
  @Test
  
  public void Experience() {
	  
	  WebElement yearOfExperience = driver.findElement(By.xpath("(//*[@name='exp'])[2]"));
		
		yearOfExperience.click();
		
  }
  
  @Test
  
  public void Date() {
	  
	WebElement Date = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		
		Date.sendKeys("12-10-2022");
  }
  
  @Test
  
  public void Profession() {
	  
	WebElement Profession = driver.findElement(By.xpath("//*[@value='Automation Tester']"));
		
		Profession.click();
  }
  
  @Test
  
  public void ChooseImage() {
	  
		
		WebElement chooseImage = driver.findElement(By.name("photo"));
		
		chooseImage.sendKeys("H:\\19149 (1).jpg");
		
		System.out.println("File uploaded susccessfully");
		
  }
  
  @Test
  
  public void Flavours() {
	  
	  WebElement flavoursOfSelenium = driver.findElement(By.xpath("//*[@value='Selenium Webdriver']"));
		
		flavoursOfSelenium.click();
		
  }
  
  @Test
  
  public void Continent() {
	  
	  WebElement chooseContinent = driver.findElement(By.xpath("//*[@name='continents']"));
		
		Select select = new Select(chooseContinent);
		
		select.selectByVisibleText("Asia");
		
List<WebElement> list = select.getAllSelectedOptions();         
		
		for(WebElement i: list) {
			
			System.out.println(i.getText());
		}
  }
  
  @Test
  
  public void SeleniumCommands() {
	  
	  WebElement seleniumCommands = driver.findElement(By.name("selenium_commands"));
		
		Select select1 = new Select(seleniumCommands);
		
		select1.selectByVisibleText("Browser Commands");
		
		select1.selectByVisibleText("Navigation Commands");
		
List<WebElement> list1 = select1.getAllSelectedOptions();         //List<WebElement> list (is a return type of getAllSelectedOptions)
		
		for(WebElement a: list1) {
			
			System.out.println(a.getText());
		}
		
  }
  
  @Test
  
  public void Click() throws InterruptedException {
	  
	  WebElement buttonClick = driver.findElement(By.xpath("//*[@name='submit']"));
		
		buttonClick.submit();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
