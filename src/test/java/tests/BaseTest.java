package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.dddemo.webautomation.config.ConfigReader;
import com.dddemo.webautomation.utils.DriverFactory;

public class BaseTest extends DriverFactory {
	
	protected WebDriver driver;
	
	@BeforeMethod
	
	public void setup() {
		
		driver = createDriver("edge");
		
        String currentDirectory = System.getProperty("user.dir");
		
		ConfigReader configReader = new ConfigReader(currentDirectory + "\\src\\main\\resources\\config.properites");
		
		String url = configReader.getPropertyValue("url");
		
		driver.get(url);		
		
	}
	
	@AfterMethod
	
	public void tearDown() {
		
		if (driver!=null) {
			
			driver.quit();
		}
	}

}
