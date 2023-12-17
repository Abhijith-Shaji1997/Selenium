package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement Documentation= driver.findElement(By.xpath("//a[contains(@href,'/documentation/')]"));
		
		Documentation.click();
		
		
		// TODO Auto-generated method stub

	}

}
