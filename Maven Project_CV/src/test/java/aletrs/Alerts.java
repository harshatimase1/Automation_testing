package aletrs;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dynamic_code.Base_class;

public class Alerts extends Base_class {

	public static void main(String[] args) throws Throwable {

		launch_Browser("Chrome");
		Hiturl("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		//simple alerts
		Alert simplealert = driver.switchTo().alert();
		System.out.println(simplealert.getText());
		Thread.sleep(3000);
		simplealert.accept();
		
		//confirmation alerts
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert confirmationalerts = driver.switchTo().alert();
		System.out.println(confirmationalerts.getText());
		
		Thread.sleep(3000);
		//to press ok
		//confirmationalerts.accept();
		
		//to press cancel
		confirmationalerts.dismiss();
		
		//prompt alert
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert promptalerts = driver.switchTo().alert();
		System.out.println(promptalerts.getText());
		
		Thread.sleep(3000);
		promptalerts.sendKeys("STP Infotech");
		promptalerts.accept();
		
		WebElement msg = driver.findElement(By.xpath("//p[@id='demo1']"));
		
		System.out.println(msg.getText());

	}

}
