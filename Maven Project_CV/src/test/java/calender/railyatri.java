package calender;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import automate.launch_browser;
import dynamic_code.Base_class;

public class railyatri extends Base_class {

	public static void main(String[] args) {
		launch_Browser("Chrome");
		Hiturl("https://railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		

		WebElement calender = driver.findElement(By.xpath("//input[@id='datepicker_train']"));
		calender.click();
		
		//I have used fluent wait here as I was getting NoSuchElementException even after locator was showing 1 of 1
		
		FluentWait<WebDriver>wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(25)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement month_year = driver.findElement(By.xpath("(//th[@class=\"datepicker-switch\"])[1]"));
		System.out.println("The current month and year is as :"+month_year.getText());
		
//		FluentWait<WebDriver>wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
//		driver.findElement(By.xpath("(//td[text()=\"27\"])[1]")).click();
//		System.out.println("The selected date is :"+calender.getAttribute("value"));

//		WebElement month_year = driver.findElement(By.xpath("(//input[@class=\"span2 form-control date_in dtp_main tt_datepicker radiusLeft\"]"));
//		System.out.println("The current month and year is :" + month_year.getText());
	
			//driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
			//driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
			//WebElement month_year = driver.findElement(By.xpath("//th[text()=\"June 2025\"]"));

//		driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
//		WebElement month_year = driver.findElement(By.xpath("//th[text()=\"June 2025\"]"));
		//System.out.println("MonthYear is as" + month_year);
//		driver.findElement(By.xpath("//td[text()='25']")).click();
//		System.out.println("The date selected is :" + calender.getAttribute("value"));
//
//		driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
	}

}
