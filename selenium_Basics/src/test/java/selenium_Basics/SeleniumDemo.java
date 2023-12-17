package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		
		WebElement openSelenium = driver.findElement(By.xpath("//*[@href='org/openqa/selenium/package-frame.html']"));
		
		openSelenium.click();
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(2);
		
		WebElement displayAbove = driver.findElement(By.xpath("//*[@href='package-summary.html']"));
		
		Boolean result=displayAbove.isDisplayed();
		
		System.out.println(result);
		
		driver.switchTo().parentFrame();
		
		
		// TODO Auto-generated method stub

	}

}
