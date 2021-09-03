package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\likia\\eclipse-workspace\\PHPTravels\\src\\main\\java\\Features",
		glue= {"StepDefinitions"},
		plugin= {"pretty","html:test-output","json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun=false,
		monochrome=true
		)
public class TestRunnerClass {

}
