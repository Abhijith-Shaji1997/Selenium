package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPage {

	WebDriver driver;

	@Test
	public void f() {

		WebElement userName = driver.findElement(By.name("username"));

		userName.sendKeys("admin");

		WebElement passWord = driver.findElement(By.name("password"));

		passWord.sendKeys("1234");

		WebElement submit = driver.findElement(By.xpath("//*[@type='submit']"));

		submit.click();
		
		

		WebElement alert = driver.findElement(By.xpath("//*[(text()=' Alert!')]"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[(text()=' Alert!')]")));
		
		wait.until(ExpectedConditions.visibilityOf(alert));

		Boolean actresult = alert.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://groceryapp.uniqassosiates.com/admin/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {
		
		driver.quit();
	}

}
