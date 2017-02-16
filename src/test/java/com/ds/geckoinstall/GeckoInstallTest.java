

package com.ds.geckoinstall;

import java.io.File;
import com.ds.geckoinstall.GeckoInstall;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class GeckoInstallTest {
	
	WebDriver driver;

	@Test
	public void testGeckoInstaller() {
		File geckoInstall = GeckoInstall.unpack();
		System.setProperty("webdriver.gecko.driver", geckoInstall.getAbsolutePath());	
		this.driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	
	}
}
