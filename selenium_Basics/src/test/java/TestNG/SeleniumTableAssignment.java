package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTableAssignment {

	WebDriver driver;

	@Test
	public void addNewproduct() {

		WebElement userName = driver.findElement(By.name("username"));

		userName.sendKeys("Admin");

		WebElement passWord = driver.findElement(By.name("password"));

		passWord.sendKeys("admin");

		WebElement login = driver.findElement(By.name("submit"));

		login.click();

		WebElement product = driver.findElement(By.xpath("//*[(text()='Product')]"));

		product.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement addProduct = driver.findElement(By.xpath("(//*[(text()='Add Product')])[1]"));

		js.executeScript("arguments[0].scrollIntoView();", addProduct);

		addProduct.click();

		WebElement selectType = driver.findElement(By.xpath("//*[@id='Type']"));

		Select select = new Select(selectType);

		select.selectByIndex(1);

		WebElement enterCode = driver.findElement(By.xpath("//*[@id='ProductCode']"));

		enterCode.sendKeys("2216");

		WebElement enterName = driver.findElement(By.xpath("//*[@id='ProductName']"));

		enterName.sendKeys("Sandwich");

		WebElement category = driver.findElement(By.xpath("//*[@name='category']"));

		Select select1 = new Select(category);

		select1.selectByValue("non veg");

		WebElement selectTax = driver.findElement(By.xpath("//*[@name='tax']"));

		selectTax.sendKeys("10");

		WebElement selectTaxMethod = driver.findElement(By.name("taxmethod"));

		Select select2 = new Select(selectTaxMethod);

		select2.selectByVisibleText("exclusive");

		WebElement selectPrice = driver.findElement(By.xpath("//*[@name='price']"));

		selectPrice.sendKeys("120");

		WebElement productOptions = driver.findElement(By.id("ProductOptions"));

		productOptions.sendKeys("Premium Quality, Healthy");

		WebElement chooseImage = driver.findElement(By.xpath("(//*[@id='ImageInput'])[1]"));

		chooseImage.sendKeys("H:\\images.jpeg");

		WebElement productDescription = driver.findElement(By.xpath("//*[@contenteditable='true']"));

		productDescription.sendKeys("Two breads with a mixture of magic");

		WebElement chooseColor = driver.findElement(By.xpath("//*[@class='btn color06']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='btn color06']")));

		js.executeScript("arguments[0].scrollIntoView();", chooseColor);

		chooseColor.click();

		WebElement submit = driver.findElement(By.xpath("//*[(text()='Submit')]"));

		submit.submit();

		// WebElement searchProduct =
		// driver.findElement(By.xpath("//*[@type='search']"));

		// WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

		// wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@type='search']")));

		// Actions action = new Actions(driver);

		// action.moveToElement(searchProduct).build().perform();

		// action.click(searchProduct).build().perform();

		// js.executeScript("arguments[0].scrollIntoView();", searchProduct);

		// searchProduct.sendKeys("Sandwich");

		// WebElement displayProduct =
		// driver.findElement(By.xpath("//table/tbody/tr/td[2]"));

		// Boolean actresult = displayProduct.isDisplayed();

		// Assert.assertTrue(actresult);

	}

	@Test

	public void verifyAddedProductIsDisplayedOrNot() {

		WebElement userName = driver.findElement(By.name("username"));

		userName.sendKeys("Admin");

		WebElement passWord = driver.findElement(By.name("password"));

		passWord.sendKeys("admin");

		WebElement login = driver.findElement(By.name("submit"));

		login.click();

		WebElement product = driver.findElement(By.xpath("//*[(text()='Product')]"));

		product.click();

		WebElement searchProduct = driver.findElement(By.xpath("//*[@type='search']"));

		searchProduct.sendKeys("Sandwich");

		WebElement displayProduct = driver.findElement(By.xpath("//table/tbody/tr/td[2]"));

		Boolean actresult = displayProduct.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void verifyEditFunctionalityOfaddedproduct() {

		WebElement userName = driver.findElement(By.name("username"));

		userName.sendKeys("Admin");

		WebElement passWord = driver.findElement(By.name("password"));

		passWord.sendKeys("admin");

		WebElement login = driver.findElement(By.name("submit"));

		login.click();

		WebElement product = driver.findElement(By.xpath("//*[(text()='Product')]"));

		product.click();

		WebElement searchProduct = driver.findElement(By.xpath("//*[@type='search']"));

		searchProduct.sendKeys("Sandwich");

		WebElement editButton = driver.findElement(By.xpath("//*[@class='fa fa-pencil']"));

		editButton.click();

		WebElement selectTax = driver.findElement(By.xpath("//*[@name='tax']"));

		selectTax.clear();

		selectTax.sendKeys("15");

		WebElement clickSubmit = driver.findElement(By.xpath("//*[@type='submit']"));

		clickSubmit.click();

		WebElement searchProduct1 = driver.findElement(By.xpath("//*[@type='search']"));

		searchProduct1.sendKeys("Sandwich");

		WebElement selectRows = driver.findElement(By.xpath("//table/tbody/tr"));

		System.out.println(selectRows.getText());

		WebElement displayEditedTax = driver.findElement(By.xpath("//table/tbody/tr/td[5]"));

		Boolean actresult = displayEditedTax.isDisplayed();

		Assert.assertTrue(actresult);

	}

	@Test

	public void printAllRowValues() {

		WebElement userName = driver.findElement(By.name("username"));

		userName.sendKeys("Admin");

		WebElement passWord = driver.findElement(By.name("password"));

		passWord.sendKeys("admin");

		WebElement login = driver.findElement(By.name("submit"));

		login.click();

		WebElement product = driver.findElement(By.xpath("//*[(text()='Product')]"));

		product.click();

		WebElement searchProduct = driver.findElement(By.xpath("//*[@type='search']"));

		searchProduct.sendKeys("Sandwich");

		WebElement selectRows = driver.findElement(By.xpath("//table/tbody/tr"));

		System.out.println(selectRows.getText());
	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://qalegend.com/restaurant/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
