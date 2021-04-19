package Native.AmazonAppShop;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoryResultCountPage {

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Continue in English']")
	private AndroidElement englishLanguageSelect;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Settings']")
	private AndroidElement settingsTab;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Country & Language']")
	private AndroidElement selectCountryLang;
	
	@AndroidFindBy(className = "android.widget.Button")
	private List<AndroidElement> selectCountrydrpdwn;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='United States Amazon.com']")
	private AndroidElement selectCountryUS;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
	private AndroidElement countryDoneBtn;
		
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Skip sign in']")
	private AndroidElement skipSignInBtn;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Navigation panel, button, double tap to open side panel']")
	private AndroidElement hamburger;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by Department']")
	private AndroidElement shopByDepartment;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Electronics']")
	private AndroidElement chooseCatElectronics;
	
	@AndroidFindBy(xpath = "//android.widget.Image[@text='TV & Video']")
	private AndroidElement choosesubCatTVandVideo;
	
	@AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='Television & Video']")
	private AndroidElement filterTAndV;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Smart TV']")
	private AndroidElement filterSmartTV;
	
	@AndroidFindBy(xpath = "//android.widget.ToggleButton[@text='Television & Video (1)']")
	private AndroidElement filterTandVafterST;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Show 10,000+ results']")
	private AndroidElement filterBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[starts-with(@text, 'Show ')]")
	private AndroidElement showResults;
	
	@AndroidFindBy(className = "android.widget.Image") //android.widget.Image
	private List<AndroidElement> resultList;
	
	@AndroidFindBy(xpath = "//android.view.View[starts-with(@content-desc, 'Next']")
	private AndroidElement nextBtn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Next'][@clickable='false']")
	private AndroidElement nextBtnDisable;
	
	
	
	public CategoryResultCountPage(AndroidDriver<AndroidElement> driver) {
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
	
	public AndroidElement shopByDepartment() {
		return shopByDepartment;
	}
	
	public AndroidElement chooseCatElectronics() {
		return chooseCatElectronics;
	}
	
	public AndroidElement choosesubCatTVandVideo() {
		return choosesubCatTVandVideo;
	}
	
	public AndroidElement settingsTab() {
		return settingsTab;
	}
	
	public AndroidElement selectCountryLang() {
		return selectCountryLang;
	}
	
	public AndroidElement selectCountrydrpdwn() {
		return selectCountrydrpdwn.get(0);
	}
	
	public AndroidElement selectCountryUS() {
		return selectCountryUS;
	}
	
	public AndroidElement countryDoneBtn() {
		return countryDoneBtn;
	}
	
	public AndroidElement filterTAndV() {
		return filterTAndV;
	}
	
	public AndroidElement filterTandVafterST() {
		return filterTandVafterST;
	}
	
	public AndroidElement filterSmartTV() {
		return filterSmartTV;
	}
	
	public AndroidElement filterBtn() {
		return filterBtn;
	}
	
	public AndroidElement showResults() {
		return showResults;
	}
	
	public List<AndroidElement> resultList() {
		return resultList;
	}
	
	public AndroidElement nextBtn() {
		return nextBtn;
	}
	
	public AndroidElement nextBtnDisable() {
		return nextBtnDisable;
	}
	
	
}
