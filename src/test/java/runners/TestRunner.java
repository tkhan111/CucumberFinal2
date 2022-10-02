package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features\\FeatureFile.feature",
		glue = "steps",
	//	tags = "@Scenario2",
		monochrome = true,
		dryRun= false,
		plugin = {
				"pretty",
				"html:traget/cucumber",
				"json:target/cucumber.json",
		}
		
		)
public class TestRunner {

}
