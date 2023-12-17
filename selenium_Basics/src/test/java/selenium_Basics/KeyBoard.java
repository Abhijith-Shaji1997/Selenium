package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoard {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
	    action.keyDown(Keys.ENTER).build().perform();
	    
	    action.keyUp(Keys.ENTER).build().perform();
		
		// TODO Auto-generated method stub

	}

}
