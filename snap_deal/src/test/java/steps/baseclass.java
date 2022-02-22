package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class baseclass
{
	//public static ChromeDriver driver;
		public static final ThreadLocal<RemoteWebDriver> remotewebdriver = new ThreadLocal<RemoteWebDriver>();
		public static ExtentTest test,node;
		
	
		
		
		public void setDriver()
		{
			remotewebdriver.set(new ChromeDriver());
		}
		public RemoteWebDriver getDriver()
		{
			return remotewebdriver.get();
		}
		
		
		public byte[] getByteScreenshot()
		{
			File screenshotAs = getDriver().getScreenshotAs(OutputType.FILE);
			byte[] readFileToByteArray = null;
			try
			{
				readFileToByteArray = FileUtils.readFileToByteArray(screenshotAs);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			return readFileToByteArray;
			
		}
}
