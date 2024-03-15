package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.dddemo.webautomation.pages.BasePage;


public class RegisterPage extends BasePage {

	// Constructor
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	// WebElements

	@FindBy(xpath = "//a[normalize-space()='Register']")
	private WebElement registerNavbarButton;

	@FindBy(xpath = "//input[@id='userName']")
	private WebElement userNameInput;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement emailInput;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement registerButton;

	// Methods to interact with elements on the page
	
	public void clickRegisterNavbarButton() {
		registerNavbarButton.click();
	}
	
	
	public void enterUserName(String userName) {
		userNameInput.sendKeys(userName);
	}

	public void enterEmail(String email) {
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}

	public void clickRegisterButton() {
		registerButton.click();
	}
}