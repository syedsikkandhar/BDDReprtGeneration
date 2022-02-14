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

public class baseclass extends AbstractTestNGCucumberTests
{
	//public static ChromeDriver driver;
		public static final ThreadLocal<RemoteWebDriver> remotewebdriver = new ThreadLocal<RemoteWebDriver>();
		public static ExtentTest test,node;
		
		public static ExtentReporter reporter;
		public static ExtentReports extent;
		public String testName,testDesc,author,category;
		
		
		public void setDriver()
		{
			remotewebdriver.set(new ChromeDriver());
		}
		public RemoteWebDriver getDriver()
		{
			return remotewebdriver.get();
		}
		
		
		public long takesnap() throws IOException
		{
			long number = (long)Math.floor(((Math.random()*90000000L)+10000000L));
			File source = getDriver().getScreenshotAs(OutputType.FILE);
			File dest = new File(".src/test/resources/Reports/screenshot/img" + number+ ".png");
			FileUtils.copyFile(source, dest);
			return number;
			
		}
		
		public void reportstep(String msg,String status) throws IOException 
		{
			if(status.equalsIgnoreCase("pass"))
			{
				node.pass(msg,MediaEntityBuilder.createScreenCaptureFromPath("src/test/resources/Reports/screenshot/img"+takesnap()+"png").build());
				
			}
			else if (status.equalsIgnoreCase("fail"))
			{
				node.fail(msg,MediaEntityBuilder.createScreenCaptureFromPath("src/test/resources/Reports/screenshot/img"+takesnap()+"png").build());
			}
		}

}
