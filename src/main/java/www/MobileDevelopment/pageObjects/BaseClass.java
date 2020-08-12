package www.MobileDevelopment.pageObjects;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import www.MobileDevelopment.Helper.TouchActions;
import www.MobileDevelopment.utilities.*;

public class BaseClass {

	public static AppiumDriver<AndroidElement> driver;
	public static TouchActions touch;
	// protected WebDriverWait wait;
	// Constructor
	/*
	 * public TestBase(AndroidDriver<AndroidElement> driver) { driver =
	 * TestBase.driver; mobileActions = new TouchActions(driver); //We are using
	 * MobileActions with this instance. Composition. // wait = new
	 * WebDriverWait(driver, 20); }
	 */

	@BeforeTest
	public void initialization() throws MalformedURLException {
		ReadConfig readconfig = new ReadConfig();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", readconfig.getPlatformName());
		capabilities.setCapability("platformVersion", readconfig.getPlatformVersion());
		capabilities.setCapability("deviceName", readconfig.getDeviceName());
		capabilities.setCapability("fullReset", true);
		capabilities.setCapability("app", System.getProperty("user.dir") + readconfig.getApp());
		capabilities.setCapability("chromedriverExecutable",
				System.getProperty("user.dir") + readconfig.getChromePath());
		capabilities.setCapability("autoWebviewTimeout", 5000);
		capabilities.setCapability("appPackage", readconfig.getAppPackage());
		capabilities.setCapability("appActivity", readconfig.getAppActivity());
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		touch = new TouchActions(driver);
	}

	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
