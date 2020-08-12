package www.MobileDevelopment.testcases;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import www.MobileDevelopment.pageObjects.BaseClass;
import www.MobileDevelopment.pageObjects.Forms;
import www.MobileDevelopment.pageObjects.Swipe;
import www.MobileDevelopment.pageObjects.WebView;

public class Testcase extends BaseClass {

	Forms f;
	WebView web;
	Swipe s;

	@BeforeClass

	public void init() {

		f = new Forms();
		web = new WebView();
		s = new Swipe();
	}

	@Test
	public void formTest() {

		f.formTab.click();
		touch.scrollDown();
		f.textBox.sendKeys("suraj Kumar");
		f.switchBtn.click();
		f.dropDown.click();
		f.selectAppium.click();
		f.activeBtn.click();
		f.activeOkBtn.click();

	}

	@Test

	public void webViewTest() {
		web.webView.click();

		Set<String> context = driver.getContextHandles();

		for (String con : context) {
			if (con.contains("WEBVIEW")) {
				driver.context(con);
				break;
			}
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	@Test

	public void SwipeTest() {
		s.swipeTab.click();
		touch.swipe();
		MobileElement element = (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()"
						+ ".scrollIntoView(new UiSelector().text(\"WebdriverIO works in combination with most of the TDD and BDD test frameworks in the JavaScript world\"))"));

		System.out.println(element.isDisplayed());

	}
}
