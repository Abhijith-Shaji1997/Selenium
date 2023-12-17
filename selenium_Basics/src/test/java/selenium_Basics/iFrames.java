package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		
		WebElement Text = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(Text.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame2");
		
		WebElement Text1 = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(Text1.getText());
		
		driver.switchTo().parentFrame();
		
		
		
		driver.quit();
		// TODO Auto-generated method stub
       
	}

}
