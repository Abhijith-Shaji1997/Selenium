package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuter {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.selenium.dev/");
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			//js.executeScript("window.scrollBy(0,4000)");
			
			//js.executeScript("window.scrollBy(0,-4000)");
			
			//WebElement News = driver.findElement(By.className("selenium"));
			
			//js.executeScript("arguments[0].scrollIntoView();",News );
			
			WebElement readMore = driver.findElement(By.xpath("(//a[contains(text(),'Read more')])[2]"));
			
			js.executeScript("arguments[0].scrollIntoView();",readMore);
			
			js.executeScript("arguments[0].click();",readMore);
			
			
			
			
		
		
		
		// TODO Auto-generated method stub

	}

}
