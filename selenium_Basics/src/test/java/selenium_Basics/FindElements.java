package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");

		List<WebElement> radiobuttonClick = driver.findElements(By.className("form-check-input"));

		for (WebElement element : radiobuttonClick) {

			element.click();

			System.out.println(element.isSelected());
		}

		// TODO Auto-generated method stub

	}

}
