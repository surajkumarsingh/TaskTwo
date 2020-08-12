package www.MobileDevelopment.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Forms extends BaseClass {

	public Forms() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView")
	public WebElement formTab;

	@FindBy(xpath = "//android.widget.EditText[@content-desc='text-input']")
	public WebElement textBox;

	@FindBy(xpath = "//android.widget.Switch[@content-desc='switch']")
	public WebElement switchBtn;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='select-Dropdown']")
	public WebElement dropDown;

	@FindBy(xpath = "//android.widget.CheckedTextView[@text='Appium is awesome']")
	public WebElement selectAppium;

	@FindBy(xpath = "//android.widget.TextView[@text='Active']")
	public WebElement activeBtn;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public WebElement activeOkBtn;

}
