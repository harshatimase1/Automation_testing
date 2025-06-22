package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentsreports {
	static String projectpath = System.getProperty("user.dir");
	public static WebDriver driver;

	public static void reports(String Testname1,String Testname2, String Testinfo, String browser, String url, String Screenshot_name)
			throws IOException {

		ExtentSparkReporter ex = new ExtentSparkReporter(projectpath + "\\Reports\\Mainreport");

		ex.config().setDocumentTitle("Document1");
		ex.config().setReportName("Report_name");
		ex.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(ex);

		er.setSystemInfo("Operating system", "windows");
		er.setSystemInfo("Browser", "chrome");
		er.setSystemInfo("Tester", "Harsha");
		er.setSystemInfo("E-commers site", "Flipkart");
		er.setSystemInfo("Software test engineer", "Harsha");

		ExtentTest test1 = er.createTest(Testname1);
		test1.log(Status.INFO, Testname1);
		

		ExtentTest test2 = er.createTest(Testname2);
		test2.log(Status.INFO, Testname2);

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		System.out.println("The browser launched is : " + browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get(url);
		System.out.println(driver.getTitle());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File target = new File("./Screenshot/" + Screenshot_name + ".png");

		FileHandler.copy(source, target);

		er.flush();
	}
}
