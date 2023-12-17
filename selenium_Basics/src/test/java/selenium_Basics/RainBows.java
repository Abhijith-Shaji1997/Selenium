package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RainBows {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhir\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://groceryapp.uniqassosiates.com/home");
		
		driver.manage().window().maximize();
		
		WebElement searchProducts= driver.findElement(By.id("un"));
		
		searchProducts.sendKeys("APPLE");
		
		WebElement searchButton=driver.findElement(By.name("Search"));
		
		searchButton.click();
		
		
		
		//WebElement searchProducts1= driver.findElement(By.className("form-control"));
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
