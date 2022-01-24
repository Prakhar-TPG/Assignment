package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {
	private static WebElement element = null;
	
	public static WebElement SubjectHeading(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='id_contact']"));
		return element;
	}
	public static void SubjectHeadingSelection(WebDriver driver,int index) {
		Select drop = new Select(SubjectHeading(driver));
		drop.selectByIndex(index);
	}
	public static WebElement Email(WebDriver driver) {
//		element= driver.findElement(By.id("email"));
		element= driver.findElement(By.xpath("//input[@class='form-control grey validate']"));
		return element;
	}
	public static WebElement Message(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='message']"));
		return element;
	}
	public static WebElement Submit(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(@id,'submitMessage')]"));
		return element;
	}
	
	public static WebElement SuccessMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[contains(@class,'alert alert-success')]"));
		return element;
	}
	public static WebElement InvalidMessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div//ol/li[contains(text(),'Invalid email address')]"));
		return element;
	}

}

