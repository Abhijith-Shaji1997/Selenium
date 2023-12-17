         package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://selenium.obsqurazone.com/select-input.php");
			
			driver.manage().window().maximize();
			
			WebElement selectColor = driver.findElement(By.id("single-input-field"));
			
			Select select = new Select(selectColor);//element
			
			//select.selectByIndex(2);
			
			select.selectByValue("Red");
			
			select.selectByVisibleText("Green");
			
			List<WebElement> list = select.getAllSelectedOptions();        
			
			for(WebElement i: list) {
				
				System.out.println(i.getText());
				
				
			}
			
			List<WebElement> list1 = select.getOptions();
			
			for(WebElement a:list1) {
				
				System.out.println(a.getText());
			}
			
			Boolean result = select.isMultiple();
			
			System.out.println(result);
			
	}
}
			
			
			
			
			
			
			
		    
		// TODO Auto-generated method stub

	


