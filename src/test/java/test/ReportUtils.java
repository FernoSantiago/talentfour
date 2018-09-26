package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ReportUtils {
	
	public static void logPrint(String strLog) {
		
		ExtentTest extentTest = TestRule.getExtentTest();
		try {
			executePrintScreen(strLog);
			extentTest.log(Status.INFO,strLog, MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png").build());
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	private static void executePrintScreen(String strLog) {
		File scrFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
