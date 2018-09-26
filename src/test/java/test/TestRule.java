package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	
	@Before
	public void beforeCenario(){		
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.navigate().to("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@After
	  public void tearDown() throws Exception {
	    //driver.quit();
	  }

}
