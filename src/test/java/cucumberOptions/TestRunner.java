package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/Features"}, 
glue = {"StepDef"},
plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber.xml"},
monochrome=true,
strict=true,
tags = {"@categoryResultCount"}
)

public class TestRunner{
	
}
