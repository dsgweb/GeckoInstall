

package com.ds.geckoinstall;

import java.io.File;
import com.ds.geckoinstall.GeckoInstall;
import org.junit.Test;



public class GeckoInstallTest {

	@Test
	public void testSeleniumGhostDriver() {
		File geckoInstall = GeckoInstall.unpack();
		//DesiredCapabilities dcaps = new DesiredCapabilities();
		//System.setProperty("webdriver.gecko.driver", "/Applications/geckodriver");	
		System.out.println(geckoInstall.getAbsolutePath());
	}
}
