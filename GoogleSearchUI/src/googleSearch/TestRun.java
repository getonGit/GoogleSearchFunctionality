package googleSearch;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/feature",
		glue={"stepdef"},
		plugin= {"html:target/cucumber-html-report"}
				)

public class TestRun {

	
}
