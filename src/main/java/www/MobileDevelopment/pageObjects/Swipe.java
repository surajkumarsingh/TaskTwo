package www.MobileDevelopment.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Swipe extends BaseClass {

	public Swipe() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@FindBy(xpath = "// android.widget.TextView[@text='Swipe']")

	public WebElement swipeTab;

	
}
