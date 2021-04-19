package StepDef;

import java.net.MalformedURLException;

import Native.AmazonAppShop.CategoryResultCountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Base;

public class CategoryResultCount extends Base{
	
	
	AndroidDriver<AndroidElement> driver;
	CategoryResultCountPage categoryCount;
	String getTotalResults;
	
	
	public CategoryResultCount() throws MalformedURLException {
		driver = initializeCapabilities();
		categoryCount = new CategoryResultCountPage(driver);

	}
	
	
	@Given("^Click on Shop by Department from burger menu$")
    public void click_on_shop_by_department_from_burger_menu() throws Throwable {

		try {
			categoryCount.skipSignInBtn().click();
			categoryCount.hamburgerMenu().click();
			categoryCount.settingsTab().click();
			categoryCount.selectCountryLang().click();
			categoryCount.selectCountrydrpdwn().click();
			categoryCount.selectCountryUS().click();
			categoryCount.countryDoneBtn().click();

			categoryCount.hamburgerMenu().click();
			categoryCount.shopByDepartment().click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("^Choose category Electronics, Choose subcategory category TV & VIDEO, Filter with Smart TV and click show results$")
    public void choose_category_electronics_choose_subcategory_category_tv_video_filter_with_smart_tv_and_click_show_results() throws Throwable {
    	try {
			categoryCount.chooseCatElectronics().click();
			categoryCount.choosesubCatTVandVideo().click();
			categoryCount.filterTAndV().click();
			categoryCount.filterSmartTV().click();
			categoryCount.filterTandVafterST().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }

    @Then("^Check the total number of results match the total displayed in filter$")
    public void check_the_total_number_of_results_match_the_total_displayed_in_filter() throws Throwable {

		String getResultCount = categoryCount.showResults().getText();
		getTotalResults = getResultCount.substring(5, getResultCount.length()-8);
		categoryCount.showResults().click();
		System.out.println("Total Smart TV search results- "+getTotalResults);

    }

}
