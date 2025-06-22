package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports extends Base_class {

	public static void main(String[] args) {
		String projectpath = System.getProperty("user.dir");

		System.out.println(projectpath);

		// create object ExtentsparkReport
		ExtentSparkReporter ex = new ExtentSparkReporter(projectpath + "\\Reports\\Mainreport");
		ex.config().setDocumentTitle("Document1");
		ex.config().setReportName("Report_name");
		// ex.config().setTheme(Theme.DARK);

		ex.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(ex);
		
		er.setSystemInfo("Operating system", "windows");
		er.setSystemInfo("Browser", "chrome");
		er.setSystemInfo("Tester", "Harsha");
		er.setSystemInfo("E-commers site", "Flipkart");
		er.setSystemInfo("Software test engineer", "Harsha");

		ExtentTest et = er.createTest("Search_flipkart");

		et.log(Status.INFO, "Search_functionality");
		et.log(Status.PASS, "Pass_search_functionality");

		launch_Browser("chrome");
		Hiturl("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));

		search.click();
		search.sendKeys("mobiles");

		er.flush();

	}

}
