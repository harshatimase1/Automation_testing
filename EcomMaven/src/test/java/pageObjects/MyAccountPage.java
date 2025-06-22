package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//h2[text()='My Account']")
	WebElement msgHeading;// My account page heading
	
	@FindBy(xpath = "//div[@class=\"list-group\"]//a[text()=\"Logout\"]")
	WebElement lnkLogout;// added in step6

	public boolean isMyAccountPageExist() {
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}

	public void clickLogout() {
		lnkLogout.click();
	}
}
