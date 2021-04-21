package Native.AmazonAppShop;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductDetailPage {
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='What are you looking for?']")
	private AndroidElement searchField;
	
	@AndroidFindBy(className = "android.widget.Image")
	private List<AndroidElement> product;
	
	@AndroidFindBy(id = "direct-ingress-wrapper")
	private AndroidElement listViewScreen;
	
	@AndroidFindBy(xpath ="//android.widget.TextView[@text='$']/following-sibling::android.widget.TextView")
	private AndroidElement priceTxt;
		
	@AndroidFindBy(xpath = "//android.widget.Button[starts-with(@text,'Add to Cart')]")
	private AndroidElement addToCartBtn;
	
	@AndroidFindBy(xpath = "//android.view.View[@text='Details']/following-sibling::android.view.View")
	private AndroidElement productInfoTxt;
	
	@AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_cart")
	private AndroidElement productAddedCart;
	
	@AndroidFindBy(xpath = "//android.view.View[starts-with(@text,'Subtotal ')]")
	private AndroidElement subtotalItems;
	
	
	public ProductDetailPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public AndroidElement searchField() {
		return searchField;
	}
	
	public AndroidElement product() {
		return product.get(1);
	}
	
	public AndroidElement listViewScreen() {
		return listViewScreen;
	}
	
	public AndroidElement priceTxt() {
		return priceTxt;
	}
	
	public AndroidElement addToCartBtn() {
		return addToCartBtn;
	}
	
	public AndroidElement productInfoTxt() {
		return productInfoTxt;
	}
	
	public AndroidElement productAddedCart() {
		return productAddedCart;
	}
	
	public AndroidElement subtotalItems() {
		return subtotalItems;
	}
	
}
