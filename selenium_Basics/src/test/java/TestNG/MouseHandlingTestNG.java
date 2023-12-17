package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class MouseHandlingTestNG {

	WebDriver driver;

	@Test
	public void f() {

		WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));

		Actions action = new Actions(driver);

		action.contextClick(inputForm).build().perform();
	}

	@Test

	public void Move() {

		WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));

		Actions action = new Actions(driver);

		action.moveToElement(inputForm).build().perform();

	}

	@Test

	public void Click() {

		WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));

		Actions action = new Actions(driver);

		action.click(inputForm).build().perform();
	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/index.php");

		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
