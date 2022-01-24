package ExecuteTestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import io.qameta.allure.*;

public class driver {
	
	static WebDriver driver= null;
	@Owner("Prakhar Srivastava")

	@BeforeTest
	public void webdriver() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\prakhar.srivasatava\\eclipse-workspace\\QA_training\\resources\\chromedriver.exe");
			
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.get("http://automationpractice.com/");
		}
}
