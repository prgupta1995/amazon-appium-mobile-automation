# mobile-automation

appium-selenium-cucumber : Android App Automation Testing Using Java

#### Pre-requisites

```
Install the app in real device
Java
Maven
Eclipse
Eclipse Plugins
Natural (for Gherkin)
npm install -g appium
Install Android Studio
Download Appium server

```

#### Maven Dependencies:

```
java-client
Selenium-Java
cucumber-junit
cucumber-java
cucumber-core
junit

Setting up selenium-cucumber-java
Install Java and set path.
Install Maven and set path.
```

#### Writing a test
The cucumber features goes in the features library and should have the ".feature" extension.

You can start out by looking features/Scenarios.feature.

You can extend the feature or make your own features using the below format

```
@productPriceCurrency
Scenario:
Assert on selected currency displayed for Deals and Promotions products
	Given Go to Currency Settings, Select Country & Language
	When Change currency from USD to AED, Save changes
	Then Assert on selected currency displayed for Deals and Promotions products
```

The cucumber stepDefinition goes in the stepDef library and should have the ".java" extension.

You can start out by looking at stepDefinition/ProductPriceCurrency.java.

You can make your own stepDefinition using the below format

```
package my.package.name

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^Go to Currency Settings, Select Country & Language$")
    public void go_to_currency_settings_select_country_language() throws Throwable {

    }

    @When("^Change currency from USD to AED, Save changes$")
    public void change_currency_from_usd_to_aed_save_changes() throws Throwable {

    }

    @Then("^Assert on selected currency displayed for Deals and Promotions products$")
    public void assert_on_selected_currency_displayed_for_deals_and_promotions_products() throws Throwable {

    }

}
```


#### POM
Define all the selectors page wise

#### Running test
Check the adb devices
start the appium server
Run test using TestRunner.java file-> Run as JUnit Test

#### In your TestRunner class add a glue option:

```
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
tags = {"@productDetails"}
)

public class TestRunner{
	
}

```

#### Output
Report file will be available as target/Cucumber.html, target/cucumber.json and target/cucumber