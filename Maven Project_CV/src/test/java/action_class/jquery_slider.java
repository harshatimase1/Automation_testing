package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class jquery_slider extends Base_class{

	public static void main(String[] args) throws Throwable {
		
		launch_Browser("chrome");
		 Hiturl("https://jqueryui.com/slider/");
		 
		WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
	    driver.switchTo().frame(frame1);
	    
	    Actions action=new Actions(driver);
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		action.moveToElement(slider).clickAndHold(slider).moveByOffset(500, 0).release().build().perform();
		action.dragAndDropBy(slider, -400, 0).build().perform();
		Thread.sleep(200);
		
		Thread.sleep(200);
        action.clickAndHold(slider).moveByOffset(400,0).release(slider).build().perform();
        
	}

}
