package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhir\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		//WebElement inputForm=driver.findElement(By.className("nav-link"));
		
		WebElement alertAndModals=driver.findElement(By.id("alert-modal"));
		
		WebElement alertAndModals1=driver.findElement(By.cssSelector("a#alert-modal"));
		
		//WebElement alertAndModals2=driver.findElement(By.linkText("Alerts and Modals"));
		
		//WebElement alertAndModals3=driver.findElement(By.partialLinkText("Alerts"));
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
