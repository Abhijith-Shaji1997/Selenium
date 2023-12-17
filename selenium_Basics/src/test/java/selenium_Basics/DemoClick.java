package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		WebElement Click = driver.findElement(By.id("newWindowBtn"));
		
		Click.click();
		
		System.out.println(Click.getText());
		
		Boolean result = Click.isDisplayed();
		
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
