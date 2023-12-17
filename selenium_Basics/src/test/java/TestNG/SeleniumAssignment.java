package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment {

	WebDriver driver;

	@Test
	public void VerifyThePageIsOpenWhileHittingTheUrl() {

		String expurl = "https://demo.guru99.com/test/newtours/index.php";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(expurl, acturl);

	}

	@Test

	public void VerifyTheLogo() {

		WebElement logo = driver.findElement(By.xpath("//*[@src='images/logo.gif']"));

		Boolean actresult = logo.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void VerifySignOnButton() {

		WebElement signOn = driver.findElement(By.xpath("//*[@href='login.php']"));

		String expresult = "SIGN-ON";

		String actresult = signOn.getText();

		Assert.assertEquals(expresult, actresult);

		signOn.click();

		WebElement userName = driver.findElement(By.xpath("//*[@name='userName']"));

		userName.sendKeys("anna");

		WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));

		passWord.sendKeys("123");

		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));

		submit.submit();

	}

	@Test

	public void verifyInvalidUserNameAndPassword() {

		WebElement signOn = driver.findElement(By.xpath("//*[@href='login.php']"));

		signOn.click();

		WebElement userName = driver.findElement(By.xpath("//*[@name='userName']"));

		userName.sendKeys("abhijith");

		WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));

		passWord.sendKeys("9087");

		WebElement submit = driver.findElement(By.xpath("//*[@name='submit']"));

		submit.submit();

		WebElement loginSucessFully = driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]"));

		String expresult = "Login Successfully";

		String actresult = loginSucessFully.getText();

		Assert.assertEquals(actresult, expresult);

	}

	@Test

	public void registerPageIsWorkingOrNot() {

		WebElement register = driver.findElement(By.xpath("(//*[@href='register.php'])[1]"));

		register.click();

		String expurl = "https://demo.guru99.com/test/newtours/register.php";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);

	}

	@Test

	public void oneWayRadioButtonIsSelectedOrNot() {

		WebElement flightClick = driver.findElement(By.xpath("(//*[@href='reservation.php'])[1]"));

		flightClick.click();

		WebElement oneWay = driver.findElement(By.xpath("//*[@value='oneway']"));

		Boolean actresult = oneWay.isSelected();

		Assert.assertFalse(actresult);
	}

	@Test

	public void roundTripButtonIsSelectedOrNot() {

		WebElement flightClick = driver.findElement(By.xpath("(//*[@href='reservation.php'])[1]"));

		flightClick.click();

		WebElement roundTrip = driver.findElement(By.xpath("//*[@value='roundtrip']"));

		Boolean actresult = roundTrip.isSelected();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyAllRadioButtons() {

		WebElement flightClick = driver.findElement(By.xpath("(//*[@href='reservation.php'])[1]"));

		flightClick.click();

		List<WebElement> allRadioadioButtonClick = driver.findElements(By.xpath("//*[@type='radio']"));

		for (WebElement allRadioButtons : allRadioadioButtonClick) {

			Boolean actresult = allRadioButtons.isDisplayed();

			Assert.assertTrue(actresult);

		}

	}

	@Test

	public void verifyAllDropDownsInFlightPage() {

		WebElement flightClick = driver.findElement(By.xpath("(//*[@href='reservation.php'])[1]"));

		flightClick.click();

		List<WebElement> allDropDownButtonsSelect = driver.findElements(By.tagName("select"));

		for (WebElement allDropDownButtons : allDropDownButtonsSelect) {

			Boolean actresult = allDropDownButtons.isDisplayed();

			Assert.assertTrue(actresult);

		}

	}

	@Test

	public void verifyAnOptionParisFromDropDown() {

		WebElement flightClick = driver.findElement(By.xpath("(//*[@href='reservation.php'])[1]"));

		flightClick.click();

		WebElement dropDown = driver.findElement(By.name("fromPort"));

		Select select = new Select(dropDown);

		select.selectByValue("Paris");

		List<WebElement> Paris = select.getAllSelectedOptions();

		for (WebElement parisSelect : Paris) {

			String expresult = "Paris";

			String actresult = parisSelect.getText();

			Assert.assertEquals(actresult, expresult);

		}

	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
