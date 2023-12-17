package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhir\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();


		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		//driver.get("https://selenium.obsqurazone.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement ShowMessage= driver.findElement(By.id("button-one"));
		
		
		
		System.out.println(ShowMessage.getText());
	
		//System.out.println(ShowMessage.getTagName());
		
		System.out.println(ShowMessage.getAttribute("class"));
		
		//System.out.println(ShowMessage.getCssValue("font-family"));
		
		//System.out.println(ShowMessage.getSize());
		
		
		// TODO Auto-generated method stub

	}

}
