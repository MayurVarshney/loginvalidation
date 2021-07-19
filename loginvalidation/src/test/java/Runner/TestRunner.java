package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Mayur\\eclipse-workspace\\loginvalidation\\src\\test\\resources\\Login\\Login.feature"},

glue = {"StepDefinition"},
monochrome = true,
dryRun= false,
strict = true,
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)



public class TestRunner 
{	


}
