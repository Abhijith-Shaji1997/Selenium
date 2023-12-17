package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTotal {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement inputForm = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
		
		inputForm.click();
		
		WebElement enterValueA = driver.findElement(By.xpath("(//*[@class='form-control'])[2]"));
		
		enterValueA.sendKeys("45");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.TAB).build().perform();
		
		WebElement enterValueB = driver.findElement(By.xpath("//*[@id='value-b']"));
		
		enterValueB.sendKeys("76");
		
		action.keyDown(Keys.TAB).build().perform();
		
		WebElement geTotal = driver.findElement(By.xpath("(//*[@type='button'])[3]"));
		
		action.keyDown(Keys.ENTER).build().perform();
		
		WebElement Total = driver.findElement(By.xpath("//*[@id='message-two']"));
		
		System.out.println(Total.getText());
		
		//driver.close();
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

