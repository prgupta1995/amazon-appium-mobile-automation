package Native.AmazonAppShop;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPriceCurrencyPage {

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Continue in English']")
	private AndroidElement englishLanguageSelect;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private AndroidElement settingsTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Country & Language']")
	private AndroidElement selectCountryLang;
	
	@AndroidFindBy(className = "android.widget.Button")
	private List<AndroidElement> selectCountryRegiondrpdwn;
	
	@AndroidFindBy(className = "android.widget.Button")
	private List<AndroidElement> selectCurrencyDrpdwn;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text='AED - Arab Emirates Dirham']")
	private AndroidElement selectCurrencyAED;
	
	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='United States Amazon.com']")
	private AndroidElement selectCountryUS;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	private AndroidElement countryDoneBtn;
		
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	private AndroidElement skipSignInBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")
	private AndroidElement hamburger;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Deals']")
	private AndroidElement selectDeals;
	
	@AndroidFindBy(xpath = "//android.view.View[starts-with(@text, 'Deal Price $')]")
	private AndroidElement tapDealsAndPromotionDollar;
	
	@AndroidFindBy(xpath = "//android.view.View[starts-with(@text, 'priceList:  AED ')]")
	private AndroidElement tapDealsAndPromotionAED;
	
	public ProductPriceCurrencyPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public AndroidElement hamburgerMenu() {
		return hamburger;
	}

	public AndroidElement skipSignInBtn() {
		return skipSignInBtn;
	}
	
	public AndroidElement englishLanguageSelect() {
		return englishLanguageSelect;
	}
	
	public AndroidElement settingsTab() {
		return settingsTab;
	}
	
	public AndroidElement selectCountryLang() {
		return selectCountryLang;
	}
	
	public AndroidElement selectCountryRegiondrpdwn() {
		return selectCountryRegiondrpdwn.get(0);
	}
	
	public AndroidElement selectCurrencyDrpdwn() {
		return selectCurrencyDrpdwn.get(2);
	}
	
	public AndroidElement selectCurrencyAED() {
		return selectCurrencyAED;
	}
	
	public AndroidElement selectCountryUS() {
		return selectCountryUS;
	}
	
	public AndroidElement countryDoneBtn() {
		return countryDoneBtn;
	}
	
	public AndroidElement selectDeals() {
		return selectDeals;
	}
	
	public AndroidElement tapDealsAndPromotionDollar() {
		return tapDealsAndPromotionDollar;
	}
	
	public AndroidElement tapDealsAndPromotionAED() {
		return tapDealsAndPromotionAED;
	}
	
}
