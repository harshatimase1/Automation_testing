package action_class;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import dynamic_code.Base_class;

public class jeevansathi extends Base_class{

	public static void main(String[] args) throws Throwable {
            launch_Browser("chrome");
            
            Hiturl("https://www.jeevansathi.com/");
            
            Actions action= new Actions(driver);
            
            WebElement profile = driver.findElement(By.xpath("//p[text()='BROWSE PROFILES BY']"));
            
            action.moveToElement(profile).perform();
            screenshot("profile");
            
            WebElement occupation = driver.findElement(By.xpath("//p[text()='Occupation']"));
            
		    action.moveToElement(occupation).perform();
		    screenshot("occupation");
		
            WebElement IT = driver.findElement(By.xpath("//a[text()='IT Software']"));
            
            action.moveToElement(IT).click().build().perform();
            screenshot("IT");
            System.out.println("The current webpage title is: "+ driver.getTitle());
            
            WebElement Help= driver.findElement(By.xpath("//a[text()='HELP']"));
            
            action.moveToElement(Help).contextClick().build().perform();
            
            WebElement mail= driver.findElement(By.xpath("//input[@placeholder='someone@example.com']"));
            
           // mail.click();
            //mail.sendKeys("Harsha");
            //action.doubleClick(mail).build().perform();
            
            action.moveToElement(mail).click().sendKeys("Sharvi").doubleClick().build().perform();

            Thread.sleep(2000);
            
            action.keyDown(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(2000);
            
            action.keyDown(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(2000);
            
            action.keyDown(Keys.PAGE_DOWN).build().perform();
            
            
            Thread.sleep(2000);
            action.keyDown(Keys.PAGE_UP).build().perform();
            
            Thread.sleep(2000);
            action.sendKeys(Keys.PAGE_UP).build().perform();
            
            Thread.sleep(2000);
            action.sendKeys(Keys.PAGE_DOWN).build().perform();
            
        
            
	}

}
