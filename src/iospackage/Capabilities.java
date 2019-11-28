package iospackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capabilities {

	
	public static IOSDriver<IOSElement> practice() throws MalformedURLException {
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone Xr");
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
	caps.setCapability(MobileCapabilityType.APP, "//Users//apple//Desktop//UICatalog.app");
	IOSDriver<IOSElement> driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	return driver;
	
	}
	
}


