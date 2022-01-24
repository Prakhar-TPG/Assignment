package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	private static WebElement element =null;
		
	public static WebElement Cart(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		return element;
	}
	public static WebElement ContactUs(WebDriver driver) {
		element = driver.findElement(By.id("contact-link"));
		return element;
	}
	public static WebElement Dresses(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		return element;
	}
	public static WebElement CasualDresses(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a"));
		return element;
	}

}

