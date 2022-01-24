package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CasualWear {
	private static WebElement element = null;
	
	public static WebElement DressImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive' and (@title='Printed Dress')]"));
		return element;
	}
	public static WebElement ProductName(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='product-name' and (@title='Printed Dress')]"));
		return element;
	}
	public static WebElement ProductPrice(WebDriver driver) {
		element = driver.findElement(By.xpath("//span[@class='price product-price']"));
		return element;
	}

//	public static WebElement PrintedDress(WebDriver driver) {
//		element = driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a"));
//		return element;
//	}

	public static WebElement AddToCart(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]//span"));
		return element;
	}

}

