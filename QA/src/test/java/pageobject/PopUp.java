package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUp {
	private static WebElement element = null;
	
	public static WebElement ContinueShopping(WebDriver driver) throws InterruptedException {
		Thread.sleep(8000);
		element = driver.findElement(By.xpath("//span[@class='continue btn btn-default button exclusive-medium']"));
		return element;
	}

}
