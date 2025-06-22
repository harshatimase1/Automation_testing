package automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.id("nav-iss-attach"));
		//driver.findElement(By.className("nav-search-submit nav-sprite"));
		//driver.findElement(By.linkText("Today's Deals"));
		driver.close();

	}

}
