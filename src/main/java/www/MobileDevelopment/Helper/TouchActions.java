package www.MobileDevelopment.Helper;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TouchActions {

	AppiumDriver<AndroidElement> driver;

	public TouchActions(AppiumDriver<AndroidElement> driver) {

		this.driver = driver;

	}

//
//	// Swipe by elements
//	public void swipeByElements(WebElement startElement, WebElement endElement) {
//		Point start = startElement.getLocation();
//		Point end = endElement.getLocation();
////		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
////		int startY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
//
////		int endX = startElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
////		int endY = startElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
//
//		new TouchAction(driver).press((PointOption.point(start)).moveTo(PointOption.point(end)).release().perform();
//		
//				
//	}
	public void scrollDown() {
		Dimension dimension = driver.manage().window().getSize();

		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int scrollStart = scrollHeightStart.intValue();

		Double scrollHeightEnd = dimension.getHeight() * 0.2;
		int scrollEnd = scrollHeightEnd.intValue();

		new TouchAction(driver).press(PointOption.point(0, scrollStart))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(0, scrollEnd))
				.release().perform();
	}

	public void swipe() {
		Dimension dimension = driver.manage().window().getSize();

		Double scrollHeightStart = dimension.getHeight() * 0.5;
		int y = scrollHeightStart.intValue();

		Double scrollWidgthStart = dimension.getWidth() * 0.5;
		int scrollStart = scrollHeightStart.intValue();

		Double scrollWidgthEnd = dimension.getWidth() * 0.2;
		int scrollEnd = scrollWidgthEnd.intValue();

		new TouchAction(driver).press(PointOption.point(scrollStart,y))
				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).moveTo(PointOption.point(scrollEnd,y ))
				.release().perform();
	}

	// Vertical Swipe by percentages
	public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.height * endPercentage);

		new TouchAction(driver).press(PointOption.point(anchor, startPoint)).moveTo(PointOption.point(anchor, endPoint))
				.release().perform();
	}

}
