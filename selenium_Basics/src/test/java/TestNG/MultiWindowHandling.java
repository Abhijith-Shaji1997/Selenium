package TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class MultiWindowHandling {

	WebDriver driver;

	@Test
	public void f() {

		String parentWindow = driver.getWindowHandle();     ///id of browser

		System.out.println(parentWindow);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement openNewWindowBtn = driver.findElement(By.id("newWindowBtn"));
		js.executeScript("arguments[0].scrollIntoView();", openNewWindowBtn);
		openNewWindowBtn.click();

		Set<String> allChildWindows = driver.getWindowHandles();    //id of all windows

		System.out.println(allChildWindows);

		// All child windows are stored in a set of strings.
		Iterator<String> iterator = allChildWindows.iterator(); // Here we will iterate through all child windows.
		while (iterator.hasNext()) {

			String childWindow = iterator.next();
			if (!parentWindow.equalsIgnoreCase(childWindow)) {

				driver.switchTo().window(childWindow);

				driver.manage().window().maximize();
				
				WebElement firstElement = driver.findElement(By.xpath("//*[@placeholder='Enter First Name']"));
				
				firstElement.sendKeys("abhijith");
				
				System.out.println(firstElement.getText());
				
				

				//System.out.println(driver.getCurrentUrl() + "  " + driver.getTitle());
				//driver.close();
			}

		}

		//driver.switchTo().window(parentWindow);

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

		//driver.quit();
	}

}
