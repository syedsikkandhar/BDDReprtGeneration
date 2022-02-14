package runner;


import io.cucumber.testng.CucumberOptions;
import steps.baseclass;



@CucumberOptions(features= {"src/test/java/features/nykaa.feature"},
				 glue="steps",
				 monochrome=true,
						 plugin = {
			        		     "pretty",
			        		     "json:src/test/resources/Reports/cucumber.json",
			        		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			        		   }
				 )


public class TestRunner extends baseclass{

}
