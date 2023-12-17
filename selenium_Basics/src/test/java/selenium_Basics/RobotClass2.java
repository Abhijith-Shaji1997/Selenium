package selenium_Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass2 {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.grammarly.com/plagiarism-checker");

		driver.manage().window().maximize();

		WebElement uploadFile = driver.findElement(By.xpath("(//*[@class='o9viu-text'])[2]"));

		// creating object of Robot class
		Robot rb = new Robot();

		// Store the File path to the StringSelection class
		StringSelection filePath = new StringSelection("H:\\java\\12.05.23.txt");

		// Copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(4000); // used to stop the execution
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(4000);
		rb.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("file uploaded..");

		// WebElement upLoad = driver.findElement(By.id("file-submit"));

		// upLoad.click();

		// TODO Auto-generated method stub

	}

}