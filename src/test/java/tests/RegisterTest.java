package tests;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterTest extends BaseTest {
	
	
	@Test
	
	public void verityUserRegistration() {
		
		RegisterPage registerPage = new RegisterPage(driver);
		
		registerPage.enterUserName("dd");
		registerPage.enterEmail("dd@gmail.com");
		registerPage.enterPassword("dd@123");
		registerPage.clickRegisterButton();
		
		String alertText = driver.switchTo().alert().getText();
		
		Assert.assertEquals(alertText.contains("User Registered"), true, "Test Failed");
		
		
		
	}

}
