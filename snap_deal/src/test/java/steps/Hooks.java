package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends baseclass{
	
	@AfterStep
	public void afterStep(Scenario scenario)
	{
		scenario.attach(getByteScreenshot(), "image/png", "");
	}

}
