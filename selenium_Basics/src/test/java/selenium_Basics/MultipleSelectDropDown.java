package selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.obsqurazone.com/select-input.php");

		driver.manage().window().maximize();

		WebElement selectColor = driver.findElement(By.id("multi-select-field"));

		Select select = new Select(selectColor);

		select.selectByValue("Yellow");

		select.selectByValue("Green");

		List<WebElement> list = select.getAllSelectedOptions();

		for (WebElement l : list) {

			System.out.println(l.getText());
		}

		WebElement Color = select.getFirstSelectedOption();

		System.out.println(Color.getText());

		Boolean result = select.isMultiple();

		System.out.println(result);

		List<WebElement> list1 = select.getOptions();

		for (WebElement a : list1) {

			System.out.println(a.getText());
		}

		// TODO Auto-generated method stub

	}

}
