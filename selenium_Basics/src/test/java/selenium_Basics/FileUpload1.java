package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload1 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		
		chooseFile.sendKeys("H:\\java\\Screenshot (1).png");
		
		System.out.println("File uploaded susccessfully");
		
		
		// TODO Auto-generated method stub

	}

}
