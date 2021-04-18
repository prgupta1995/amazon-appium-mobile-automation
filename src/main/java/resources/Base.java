package resources;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Base {

	static AndroidDriver<AndroidElement> driver;
	
	public static AndroidDriver<AndroidElement> initializeCapabilities() throws MalformedURLException {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName", "SM-M215F/DS");
	cap.setCapability("udid", "RZ8N81Y36WD");
	cap.setCapability("platformName", "Android");
	cap.setCapability("platformVersion", "11");
	cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
	cap.setCapability("appActivity", "com.amazon.mShop.home.HomeActivity");
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	
	driver = new AndroidDriver<AndroidElement>(url, cap);
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	
	System.out.println("application started");
		
	
	return driver;
	
	}
}