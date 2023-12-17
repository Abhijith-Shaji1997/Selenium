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

public class FirstProgram {

	WebDriver driver;

	@Test(priority = 2, enabled = false)

	public void f() {

		WebElement selectColor = driver.findElement(By.id("multi-select-field"));

		Select select = new Select(selectColor);

		select.selectByValue("Yellow");

		select.selectByValue("Green");

		List<WebElement> list = select.getAllSelectedOptions(); // List<WebElement> list (is a return type of
																// getAllSelectedOptions)

		for (WebElement i : list) {

			System.out.println(i.getText());
		}
	}

	@Test(priority = 1)

	public void TestCase1() {

		WebElement selectColor = driver.findElement(By.id("multi-select-field"));

		Select select = new Select(selectColor);

		select.selectByValue("Yellow");

		select.selectByValue("Green");

		WebElement color = select.getFirstSelectedOption();

		System.out.println(color.getText());
	}

	@Test(priority = 0)

	public void TestCase2() {

		WebElement selectColor = driver.findElement(By.id("multi-select-field"));

		Select select = new Select(selectColor);

		Boolean result = select.isMultiple();

		System.out.println(result);

	}

	@Test(priority = 3)

	public void TestCase3() {

		WebElement selectColor = driver.findElement(By.id("multi-select-field"));

		Select select = new Select(selectColor);

		List<WebElement> list1 = select.getOptions();

		for (WebElement a : list1) {

			System.out.println(a.getText());

		}

	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/select-input.php");

		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
