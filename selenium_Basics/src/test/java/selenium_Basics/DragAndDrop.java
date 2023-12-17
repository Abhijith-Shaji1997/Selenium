 package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions action = new Actions(driver);
		
		WebElement fiveThousand = driver.findElement(By.xpath("(//*[@class='button button-orange'])[4]"));
		
		WebElement Amount = driver.findElement(By.xpath("(//*[@class='placeholder'])[4]"));
		
		action.dragAndDrop(fiveThousand, Amount).build().perform();
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
