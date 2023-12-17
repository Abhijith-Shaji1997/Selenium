package selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager1{

	public static void main(String[] args) {
		
	   WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1= new EdgeDriver();


		driver1.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		// TODO Auto-generated method stub

	}

}
