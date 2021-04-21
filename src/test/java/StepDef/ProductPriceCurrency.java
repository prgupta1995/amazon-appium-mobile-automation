package StepDef;

import java.net.MalformedURLException;

import org.junit.Assert;

import Native.AmazonAppShop.CategoryResultCountPage;
import Native.AmazonAppShop.ProductPriceCurrencyPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import resources.Base;

public class ProductPriceCurrency extends Base {

	AndroidDriver<AndroidElement> driver;
	CategoryResultCountPage categoryCount;
	ProductPriceCurrencyPage productCurrency;

	public ProductPriceCurrency() throws MalformedURLException {
		driver = initializeCapabilities();
		categoryCount = new CategoryResultCountPage(driver);
		productCurrency = new ProductPriceCurrencyPage(driver);
	}

	@Given("^Go to Currency Settings, Select Country & Language$")
	public void go_to_currency_settings_select_country_language() throws Throwable {

		try {
			categoryCount.skipSignInBtn().click();
			categoryCount.hamburgerMenu().click();
			categoryCount.settingsTab().click();
			categoryCount.selectCountryLang().click();
			categoryCount.selectCountryRegiondrpdwn().click();
			categoryCount.selectCountryUS().click();
			categoryCount.countryDoneBtn().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("^Change currency from USD to AED, Save changes$")
	public void change_currency_from_usd_to_aed_save_changes() throws Throwable {
		try {
			categoryCount.hamburgerMenu().click();
			categoryCount.settingsTab().click();
			categoryCount.selectCountryLang().click();
			productCurrency.selectCurrencyDrpdwn().click();
			productCurrency.selectCurrencyAED().click();
			Thread.sleep(2000);
			categoryCount.countryDoneBtn().click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("^Assert on selected currency displayed for Deals and Promotions products$")
	public void assert_on_selected_currency_displayed_for_deals_and_promotions_products() throws Throwable {
		try {
			categoryCount.hamburgerMenu().click();
			categoryCount.shopByDepartment().click();

			// Scroll till the Element
			AndroidElement scrollToDeals = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Deals\"));"));

			scrollToDeals.click();
			String getCurrencyDollar  = productCurrency.tapDealsAndPromotionDollar().getText();
			System.out.println(productCurrency.tapDealsAndPromotionDollar().getText());
			Assert.assertTrue("Selected Currency AED is not displayed on Deals and Promotion page.", getCurrencyDollar.contains("$"));
			productCurrency.tapDealsAndPromotionDollar().click();
			
			String getCurrencyAED = productCurrency.tapDealsAndPromotionAED().getText();
			
			Assert.assertTrue("Selected Currency is displayed as AED inside the PLP listing page.",getCurrencyAED.contains("AED"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
