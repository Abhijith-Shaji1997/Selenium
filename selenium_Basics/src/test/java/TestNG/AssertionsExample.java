package TestNG;

import org.testng.annotations.Test;

import com.google.common.eventbus.AllowConcurrentEvents;

//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AssertionsExample {

	WebDriver driver;

	@Test
	public void VerifyThePageIsOpenWhileHittingTheUrl() {

		String expurl = "https://selenium.obsqurazone.com/index.php";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(expurl, acturl);

	}

	@Test

	public void verifyLogoIsDisplayedOrNot() {

		WebElement logo = driver.findElement(By.xpath("//*[@src='images/logo.png']"));

		Boolean actresult = logo.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyInputform() {

		WebElement inputForm = driver.findElement(By.xpath("//*[@href='simple-form-demo.php']"));

		inputForm.click();

		WebElement singleInput = driver.findElement(By.xpath("(//*[@class='card-header'])[2]"));

		String expResult = "Single Input Field";

		String actResult = singleInput.getText();

		Assert.assertEquals(actResult, expResult);
	}

	@Test

	public void verifyAllRadioButton() {

		WebElement inputForm = driver.findElement(By.xpath("//*[@href='simple-form-demo.php']"));

		inputForm.click();

		WebElement radioButtonClick = driver.findElement(By.xpath("//*[@href='radio-button-demo.php']"));

		radioButtonClick.click();

		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//*[@class='form-check-input']"));

		for (WebElement radioButton1 : allRadioButtons) {

			//radioButton1.click();

			Boolean actResult = radioButton1.isSelected();

			Assert.assertTrue(actResult);

		}

	}

	@Test

	public void NullAssertion() {

		WebElement SearchBoX = driver.findElement(By.xpath("//*[@placeholder='Search products in Your City']"));

		SearchBoX.sendKeys("apple");

		String actRes = SearchBoX.getAttribute("value");

		Assert.assertNotNull(actRes);
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
