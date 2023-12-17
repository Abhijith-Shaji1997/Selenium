package TestNG;

import org.testng.annotations.Test;
import org.testng.reporters.jq.TestNgXmlPanel;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.webaudio.WebAudio;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TableAssignment {

	WebDriver driver;

	@Test
	public void printDetailsOfPerson() {

		WebElement table = driver.findElement(By.xpath("//*[@href='table-pagination.php']"));

		table.click();

		WebElement tableUser = driver.findElement(By.xpath("//table/tbody/tr[1]"));

		System.out.println(tableUser.getText());

		String expresult = "Tiger Nixon System Architect Edinburgh 61 2011/04/25 $320,800";

		String actresult = tableUser.getText();

		Assert.assertEquals(actresult, expresult);

	}

	@Test

	public void tableSortAndSearch() {

		WebElement table = driver.findElement(By.xpath("//*[@href='table-pagination.php']"));

		table.click();

		WebElement tableSortandSerach = driver.findElement(By.xpath("//*[@href='table-sort-search.php']"));

		tableSortandSerach.click();

		WebElement search = driver.findElement(By.xpath("//*[@type='search']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@type='search']")));

		search.sendKeys("Dai Rios");

		WebElement displayName = driver.findElement(By.xpath("//table/tbody/tr/td"));

		Boolean actresult = displayName.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyHomeTab() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@href='index.php'])[2]"))).click();

		WebElement clickHome = driver.findElement(By.xpath("//*[(text()='Home')]"));

		Boolean actresult = clickHome.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyAlertsAndModels() {

		WebElement alertsAndModels = driver.findElement(By.id("alert-modal"));

		alertsAndModels.click();

		WebElement javaScriptAlert = driver.findElement(By.xpath("//*[@href='javascript-alert.php']"));

		javaScriptAlert.click();

		WebElement clickMe = driver.findElement(By.xpath("//*[@class='btn btn-success']"));

		// Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

		// .withTimeout(Duration.ofSeconds(10))

		// .pollingEvery(Duration.ofSeconds(5))

		// .ignoring(NoSuchElementException.class);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.alertIsPresent());

		// wait.until(ExpectedConditions.alertIsPresent());

		clickMe.click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/index.php");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
