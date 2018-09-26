package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRules {

	private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(cucumber.api.Scenario scenario) {

		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/report/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);

		}

		extentTest = extentReport.createTest(scenario.getId());

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}

	@After
	public void tearDown(cucumber.api.Scenario scenario) {
		extentTest.log(Status.PASS, "Scenario" + scenario.getName() + "executed successfully.");
		extentReport.flush();
	}

}
