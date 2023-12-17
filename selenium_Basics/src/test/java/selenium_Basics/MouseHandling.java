package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling {


	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
		
		Actions action = new Actions(driver);
		
		//action.moveToElement(inputForm).build().perform();
		
	    action.click(inputForm).build().perform();
	    
	   // action.contextClick(inputForm).build().perform(); //rightclick
	    
	    
	    
		
	    
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
