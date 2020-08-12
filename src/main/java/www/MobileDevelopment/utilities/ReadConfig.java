package www.MobileDevelopment.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File src = new File("./src/test/Resources/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getPlatformName() {
		String platformName = pro.getProperty("platformName");
		return platformName;
	}

	public String getPlatformVersion() {
		String platformVersion = pro.getProperty("platformVersion");
		return platformVersion;
	}
	public String getDeviceName() {
		String deviceName = pro.getProperty("deviceName");
		return deviceName;
	}
	public String getApp() {
		String app = pro.getProperty("app");
		return app;
	}
	public String getAppPackage() {
		String appPackage = pro.getProperty("appPackage");
		return appPackage;
	}

	public String getAppActivity() {
		String appActivity = pro.getProperty("appActivity");
		return appActivity;
	}
	public String getChromePath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	

	public static void main(String[] args) {

		ReadConfig rd = new ReadConfig();

		System.out.println(rd.getChromePath());
	}
}
