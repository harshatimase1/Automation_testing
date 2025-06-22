package window_handles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import action_class.Action_class;
import dynamic_code.Base_class;

public class Parent_child extends Base_class {

	public static void main(String[] args) throws Throwable {
          launch_Browser("Chrome");
          takescreenshot("Browser_Launch");
          
          Hiturl("https://www.naukri.com/");
        
          takescreenshot("Naukri_webpage");
          
          Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
        Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='About us']")).click();
		takescreenshot("Clicked on about us");
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> id = window.iterator();
		
		String parent_id = id.next();
		System.out.println("The parent id is :" + parent_id);
		String child_id = id.next();
		
        Thread.sleep(2000);

		System.out.println("The child id is :" +child_id);
		driver.switchTo().window(child_id);
		
		System.out.println("Shifted to child window");
		
        Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='LEARN MORE']"));
		System.out.println("Clicked on learn more");
		takescreenshot("Clicked on learn more");
		
		
        Thread.sleep(2000);

		driver.switchTo().window(parent_id);
		System.out.println("Back to parent window");
		takescreenshot("Back to parent window");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		act.keyDown(Keys.PAGE_UP).build().perform();
		takescreenshot("Page_up");

		
		
        Thread.sleep(2000);

		driver.quit();
		
		
	}

}
