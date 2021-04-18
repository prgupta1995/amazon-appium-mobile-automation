package StepDef;

import java.net.MalformedURLException;

import Native.AmazonAppShop.CatoryResultCountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Base;

public class CategoryResultCount extends Base{
	
	AndroidDriver<AndroidElement> driver;
	CatoryResultCountPage categoryCount;
	
	public CategoryResultCount() throws MalformedURLException {
		driver = initializeCapabilities();
		categoryCount = new CatoryResultCountPage(driver);
	}
	
	
	@Given("^Click on Shop by Department from burger menu$")
    public void click_on_shop_by_department_from_burger_menu() throws Throwable {

		categoryCount.englishLanguageSelect().click();
		categoryCount.skipSignInBtn().click();
		categoryCount.hamburgerMenu().click();
		categoryCount.shopByCategory().click();

	}

    @When("^Choose category Electronics$")
    public void choose_category_electronics() throws Throwable {


    }

    @Then("^Check the total number of results match the total displayed in filter$")
    public void check_the_total_number_of_results_match_the_total_displayed_in_filter() throws Throwable {


    }

    @And("^Choose subcategory category TV & VIDEO$")
    public void choose_subcategory_category_tv_video() throws Throwable {


    }

    @And("^Filter with Smart TV and click show results$")
    public void filter_with_smart_tv_and_click_show_results() throws Throwable {


    }

}
