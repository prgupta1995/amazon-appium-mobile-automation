package Native.AmazonAppShop;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CatoryResultCountPage {

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Continue in English']")
	private AndroidElement englishLanguageSelect;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	private AndroidElement skipSignInBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@id='chrome_action_bar_burger_icon']")
	private AndroidElement hamburger;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by Category']")
	private AndroidElement shopByCategory;
	

//	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@id='anp_drawer_item']")
//	private AndroidElement yourAccountTab;

	public CatoryResultCountPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public AndroidElement hamburgerMenu() {
		return hamburger;
	}

//	public AndroidElement yourAccountTab() {
//		return yourAccountTab;
//	}

	public AndroidElement skipSignInBtn() {
		return skipSignInBtn;
	}
	
	public AndroidElement englishLanguageSelect() {
		return englishLanguageSelect;
	}
	
	public AndroidElement shopByCategory() {
		return shopByCategory;
	}
	
	
	
}
