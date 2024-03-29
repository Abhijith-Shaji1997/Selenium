package utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitClass {
	
	
	
	public void elementToBeClickableWait(WebDriver driver,WebElement element) {
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

		 .withTimeout(Duration.ofSeconds(10))

		.pollingEvery(Duration.ofSeconds(5))

		 .ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.alertIsPresent());
	}

}
