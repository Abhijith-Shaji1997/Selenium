package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		
		driver.manage().window().maximize();
		
		WebElement clickMe = driver.findElement(By.xpath("//*[@class='btn btn-warning']"));
		
		clickMe.click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		WebElement b = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
		
		b.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys("Abhijith");
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		// TODO Auto-generated method stub

	}

}
