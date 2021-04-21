package StepDef;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import Native.AmazonAppShop.CategoryResultCountPage;
import Native.AmazonAppShop.ProductDetailPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.ElementOption;
import resources.Base;

public class ProductDetail extends Base {
	AndroidDriver<AndroidElement> driver;
	ProductDetailPage productDetail;
	CategoryResultCountPage categoryCount;
	TouchAction action;

	public ProductDetail() throws MalformedURLException {
		driver = initializeCapabilities();
		productDetail = new ProductDetailPage(driver);
		categoryCount = new CategoryResultCountPage(driver);
	}

	@Given("^Tap on the Search bar and search for \"([^\"]*)\", Tap the picture of the product and swipe Left to Right$")
	public void tap_on_the_search_bar_and_search_for_something_tap_the_picture_of_the_product_and_swipe_left_to_right(
			String searchString) throws Throwable {

		try {
			categoryCount.skipSignInBtn().click();
			categoryCount.hamburgerMenu().click();
			categoryCount.settingsTab().click();
			categoryCount.selectCountryLang().click();
			categoryCount.selectCountryRegiondrpdwn().click();
			categoryCount.selectCountryUS().click();
			categoryCount.countryDoneBtn().click();
			productDetail.searchField().sendKeys(searchString);

			(driver).pressKey(new KeyEvent(AndroidKey.ENTER));

			productDetail.product().click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("^The price of the product is displayed, Verify payment options are displayed$")
	public void the_price_of_the_product_is_displayed_verify_payment_options_are_displayed() throws Throwable {

		try {
			String productPrice = productDetail.priceTxt().getText();
			System.out.println(productPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^Verify out of stock or in stock, information is showing on the page, Tap and verify add to cart feature$")
	public void verify_out_of_stock_or_in_stock_information_is_showing_on_the_page_tap_and_verify_add_to_cart_feature()
			throws Throwable {

		try {
			AndroidElement scrollToAddToCart = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Add to Cart\"));"));
			if (productDetail.addToCartBtn().isDisplayed()) {
				System.out.println("Product is in the stock");
				productDetail.addToCartBtn().click();
			}
			
			else {
				System.out.println("Product is not in the stock");
			}
			AndroidElement scrollToDetails = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
					"new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Details\"));"));

			String productInfo = productDetail.productInfoTxt().getText();
			System.out.println(productInfo);

			String productAddedToCart = productDetail.productAddedCart().getText();
			System.out.println(productAddedToCart);

			productDetail.productAddedCart().click();

			String totalItemsAddedToCart =  productDetail.subtotalItems().getText();
			System.out.println(totalItemsAddedToCart);
			Assert.assertTrue("Products are available in the cart", totalItemsAddedToCart.contains("Subtotal"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
