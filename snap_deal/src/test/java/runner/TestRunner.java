package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.baseclass;



@CucumberOptions(features= {"src/test/java/features/Login.feature"},
				 //glue={"stepDef","Hooks"},
				   glue={"steps","Hooks"},
				 		 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
				 )


public class TestRunner extends AbstractTestNGCucumberTests 
{

}
