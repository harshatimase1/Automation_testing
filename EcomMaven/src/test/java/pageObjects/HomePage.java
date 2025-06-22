package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	 
	
	public HomePage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath = "//a[@title='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkResister;
	
	@FindBy(linkText="Login")WebElement linkLogin;//login link added in step5
	
	
	public void clickMyAccount() {
		lnkMyAccount.click();	
	}
	
	public void clickResister() {
		lnkResister.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}
}
