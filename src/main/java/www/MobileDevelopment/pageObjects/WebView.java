package www.MobileDevelopment.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WebView extends BaseClass {

	public WebView() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@text='WebView']")

	public WebElement webView;
	
	
	
	
}
