package robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamic_code.Base_class;

public class Upload_file extends Base_class {

	public static void main(String[] args) throws AWTException {

		
		launch_Browser("chrome");
		Hiturl("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		
		StringSelection ss=new StringSelection("\"C:\\Users\\Harsha Timase\\Desktop\\Harsha all docs\\Documents_Harsha\\Resume_HarshaTimase_QualityAnalyst_5 years of an experience.docx\"");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot r=new Robot();
		
		r.delay(3000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		r.delay(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
