package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MultiWindowHandlingAssignment {

	WebDriver driver;

	@Test
	public void f() {

		String parentWindow = driver.getWindowHandle(); /// id of browser

		System.out.println(parentWindow);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement openNewWindowBtn = driver.findElement(By.id("newWindowBtn"));
		js.executeScript("arguments[0].scrollIntoView();", openNewWindowBtn);
		openNewWindowBtn.click();

		Set<String> allChildWindows = driver.getWindowHandles(); // id of all windows

		System.out.println(allChildWindows);

		// All child windows are stored in a set of strings.
		Iterator<String> iterator = allChildWindows.iterator(); // Here we will iterate through all child windows.
		while (iterator.hasNext()) {

			String childWindow = iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

				driver.manage().window().maximize();

				WebElement firstElement = driver.findElement(By.className("bcTextBox"));

				firstElement.sendKeys("abhijith");

				WebElement secondElement = driver.findElement(By.name("lName"));

				secondElement.sendKeys("Shaji");

				WebElement gender = driver.findElement(By.xpath("//*[@id='malerb']"));

				gender.click();

				Boolean result = gender.isSelected();

				System.out.println(result);

				WebElement english = driver.findElement(By.id("englishchbx"));

				english.click();

				WebElement Hindi = driver.findElement(By.id("hindichbx"));

				Hindi.click();

				WebElement eMail = driver.findElement(By.xpath("//*[@placeholder='Enter Email']"));

				// js.executeScript("arguments[0].scrollIntoView();",eMail);

				eMail.sendKeys("abhijiths19122gmail.com");

				WebElement passWord = driver.findElement(By.xpath("//*[@id='password']"));

				passWord.sendKeys("Abhijith1997");

				WebElement register = driver.findElement(By.id("registerbtn"));

				js.executeScript("arguments[0].scrollIntoView();", register);

				register.click();

				System.out.println("Succesfully Registerd");

				WebElement suscessFull = driver.findElement(By.xpath("//*[text()='Registration is Successful']"));

				Boolean result1 = suscessFull.isDisplayed();

				System.out.println(result1);

			}

		}

		driver.switchTo().window(parentWindow);

	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.manage().window().maximize();
	}

	@AfterMethod
	public void afterMethod() {

		driver.quit();
	}

}
