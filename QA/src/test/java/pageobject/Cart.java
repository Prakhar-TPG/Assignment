package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
	private static WebElement element= null;
	
	public static WebElement CartProductName(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[@class=\"product-name\"]//a"));
		return element;
	}
	public static WebElement CartProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@id='total_product_price_3_13_0']"));
		return element;
	}

}