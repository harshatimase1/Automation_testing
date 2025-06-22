package page_object_model001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base_package01.Base_class_01;

public class Demo_01 extends Base_class_01{

	
	@FindBy(css="a.login") WebElement sign_in_btn;
	@FindBy(css="input#email_create") WebElement email_box;
	@FindBy(css="button#SubmitCreate")WebElement create_an_acc;
	
	public Demo_01(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Account() {
		
		sign_in_btn.click();
		scroll(400); 
		email_box.sendKeys("abcnd123@gmail.com");
		create_an_acc.click();
	}
	
}

