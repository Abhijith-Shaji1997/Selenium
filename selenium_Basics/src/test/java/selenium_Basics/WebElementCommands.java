package selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class WebElementCommands {

	public static void main(String[] args) {
		
		System .setProperty ("webdriver.chrome.driver", "C:\\Users\\abhir\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		
		
		
		
		WebElement EnterMessage= driver.findElement(By.id("single-input-field"));
		
		EnterMessage.sendKeys("hai");
		
		WebElement ShowMessage= driver.findElement(By.id("button-one"));
		
		ShowMessage.click();
		
		WebElement RadioButtonDemo= driver.findElement(By.linkText("Radio Buttons Demo"));
		
		RadioButtonDemo.click();
		
		WebElement Male = driver.findElement(By.id("inlineRadio1"));
		
		Male.click();
		
		Boolean result = Male.isSelected();
		
		System.out.println(result);
		
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		WebElement enterValueA= driver.findElement(By.id("value-a"));
		
		enterValueA.sendKeys("10");
		
		WebElement enterValueB= driver.findElement(By.id("value-b"));
		
		enterValueB.sendKeys("20");
		
		WebElement getTotal= driver.findElement(By.id("button-two"));
		
		getTotal.click();
		
		Boolean result1 = getTotal.isDisplayed();
		
		System.out.println(result1);
		
		//driver.navigate().to("https://selenium.obsqurazone.com/check-box-demo.php");
		
		
		//WebElement checkBoxOne= driver.findElement(By.id("check-box-one"));

		//checkBoxOne.click();
		
		//Boolean result2=checkBoxOne.isSelected();
		
		//System.out.println(result2);
		
		//driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		
		//WebElement Female= driver.findElement(By.id("inlineRadio21"));
		
		//Female.click();
		
		//Boolean result3 = Female.isSelected();
		
		//System.out.println(result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
