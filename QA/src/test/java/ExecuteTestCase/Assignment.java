package ExecuteTestCase;
import org.testng.Assert;
import pageobject.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Assignment extends driver {

	@Test
	public void first() throws InterruptedException {
		String title= driver.getTitle();
		System.out.println("The page title is : "+title);
		String expected_title="My Store";
		Assert.assertEquals(title, expected_title);
		System.out.println("Page Title is Correct");
		
		pageobject.Homepage.ContactUs(driver).click();
		pageobject.ContactPage.SubjectHeading(driver).click();		    
		pageobject.ContactPage.SubjectHeadingSelection(driver,1);
		pageobject.ContactPage.Email(driver).sendKeys("abcd@gmail.com"); 
		pageobject.ContactPage.Message(driver).sendKeys("Happy New Year");
		pageobject.ContactPage.Submit(driver).click();
		   
		String actual_msg= pageobject.ContactPage.SuccessMessage(driver).getText();    
	    String expect="Your message has been successfully sent to our team.";
		Assert.assertEquals(actual_msg, expect);
		System.out.println("Test 1 completed");
		driver.quit();

	}
		
	
	@Test
	public void second() throws InterruptedException {
	    
		webdriver();
		
		String title= driver.getTitle();
		System.out.println("The page title is : "+title);
		String expected_title="My Store";
		Assert.assertEquals(title, expected_title);
		System.out.println("Page Title is Correct");
			
		pageobject.Homepage.ContactUs(driver).click();
		pageobject.ContactPage.SubjectHeading(driver).click();		    
		pageobject.ContactPage.SubjectHeadingSelection(driver,1);
		    
		pageobject.ContactPage.Email(driver).sendKeys("abcd"); 
		pageobject.ContactPage.Message(driver).sendKeys("Happy New Year");
		pageobject.ContactPage.Submit(driver).click();
		    
		String actual_msg= pageobject.ContactPage.InvalidMessage(driver).getText();    
		String expect="Invalid email address.";
		Assert.assertEquals(actual_msg, expect);
		System.out.println("Test 2 completed");
		driver.quit();

		 }
		
	
	@Test
	public void third() throws InterruptedException {
		
		webdriver();

		WebElement dresses = pageobject.Homepage.Dresses(driver);
		Actions action = new Actions(driver);
		action.moveToElement(dresses).perform();
		
		pageobject.Homepage.CasualDresses(driver).click();
		Thread.sleep(3000);
		
//		WebElement dressImg = pageobject.CasualWear.DressImage(driver);
//	    action.moveToElement(dressImg).perform();
	    
	    String productName = pageobject.CasualWear.ProductName(driver).getText();
	    String productPrice = pageobject.CasualWear.ProductPrice(driver).getText();
	    System.out.println("Product Price"+" "+productPrice);
	    System.out.println("Product Name"+" "+productName);
	    
	    pageobject.CasualWear.ProductName(driver).click();
	    Thread.sleep(5000);
	    pageobject.CasualWear.AddToCart(driver).click();
	    Thread.sleep(5000);
	    
	    pageobject.PopUp.ContinueShopping(driver).click();
	    pageobject.Homepage.Cart(driver).click();
	    
	    String ProductName = pageobject.Cart.CartProductName(driver).getText();
	    String ProductPrice = pageobject.Cart.CartProductPrice(driver).getText();
	    System.out.println("Cart Product Price"+" "+ProductPrice);
	    System.out.println("Cart Product Name"+" "+ProductName);

	    if(ProductName.equals(productName) && ProductPrice.equals(productPrice)) {
	    	System.out.println("Product Name and Price matched");
	    }
	    Thread.sleep(1000);
	    driver.quit();
	}
}
