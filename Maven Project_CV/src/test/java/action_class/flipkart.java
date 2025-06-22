package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class flipkart extends Base_class {

	public static void main(String[] args) {
		
		launch_Browser("chrome");
		Hiturl("https://www.flipkart.com/");
		
		Actions act=new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
		act.moveToElement(fashion).build().perform();
		
		

	}

}
