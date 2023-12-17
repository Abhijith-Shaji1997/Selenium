package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TutorialsPoint {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

		driver.manage().window().maximize();

		WebElement firstName = driver.findElement(By.name("firstname"));

		firstName.sendKeys("Abhijith");
		
		//System.out.println(firstName.getText());

		WebElement secondName = driver.findElement(By.name("lastname"));

		secondName.sendKeys("Shaji");

		WebElement Gender = driver.findElement(By.xpath("//*[@value='Male']"));

		Gender.click();

		WebElement yearOfExperience = driver.findElement(By.xpath("(//*[@name='exp'])[2]"));

		yearOfExperience.click();

		WebElement Date = driver.findElement(By.xpath("(//*[@type='text'])[3]"));

		Date.sendKeys("12-10-2022");

		WebElement Profession = driver.findElement(By.xpath("//*[@value='Automation Tester']"));

		Profession.click();

		WebElement chooseImage = driver.findElement(By.name("photo"));

		chooseImage.sendKeys("H:\\19149 (1).jpg");

		System.out.println("File uploaded susccessfully");

		WebElement flavoursOfSelenium = driver.findElement(By.xpath("//*[@value='Selenium Webdriver']"));

		flavoursOfSelenium.click();

		WebElement chooseContinent = driver.findElement(By.xpath("//*[@name='continents']"));

		Select select = new Select(chooseContinent);

		select.selectByVisibleText("Asia");

		List<WebElement> list = select.getAllSelectedOptions();

		for (WebElement i : list) {

			System.out.println(i.getText());
		}

		WebElement seleniumCommands = driver.findElement(By.name("selenium_commands"));

		Select select1 = new Select(seleniumCommands);

		select1.selectByVisibleText("Browser Commands");

		select1.selectByVisibleText("Navigation Commands");

		List<WebElement> list1 = select1.getAllSelectedOptions(); // List<WebElement> list (is a return type of
																	// getAllSelectedOptions)

		for (WebElement a : list1) {

			System.out.println(a.getText());
		}

		WebElement buttonClick = driver.findElement(By.xpath("//*[@name='submit']"));

		buttonClick.submit();

		Thread.sleep(3000);

		driver.switchTo().alert().accept();

		// TODO Auto-generated method stub

	}

}
