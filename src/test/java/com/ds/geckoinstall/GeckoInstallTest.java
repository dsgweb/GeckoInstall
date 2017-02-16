

package com.ds.geckoinstall;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.ds.geckoinstall.GeckoInstall;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;


public class GeckoInstallTest {

	@Test
	public void testSeleniumGhostDriver() {

		File phantomjs = GeckoInstall.unpack();
		//DesiredCapabilities dcaps = new DesiredCapabilities();
		
		//System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");
		
		System.out.println(phantomjs);
		
		/*
		dcaps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, phantomjs.getAbsolutePath());
		PhantomJSDriver driver = new PhantomJSDriver(dcaps);
		try {
			driver.get("https://www.google.com");
			WebElement query = driver.findElement(By.name("q"));
			query.sendKeys("Phanbedder");
			query.submit();

			Assertions.assertThat(driver.getTitle()).contains("Phanbedder");
		} finally {
			driver.quit();
		}*/
	}

}
