package selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhir\\Downloads\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);
	    //String currenturl=driver.getCurrentUrl();
	    //System.out.println(currenturl);
		//String PageSource=driver.getPageSource();
		//System.out.println(PageSource);
		
		//driver.navigate().to("https://translate.google.com/");
		//driver.navigate().back();
		//driver.close();
		//driver.quit();
		

	}
}


