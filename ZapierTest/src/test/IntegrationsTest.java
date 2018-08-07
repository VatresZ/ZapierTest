package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import pages.IntegrationsPage;

public class IntegrationsTest extends InitTest {

	IntegrationsPage intePage;
	
	// Test 1
	@Test(priority = 8)
	public void toIntegrations() {
		intePage = new IntegrationsPage(driver);
		
		intePage.isIntegration();
		intePage.isSlack();
		intePage.isAvatarAvatar();
		intePage.isSettings();
		intePage.fillData("Vatres", "Zoran");
		intePage.isTimeZone();
		intePage.isGMTEurope();
		intePage.isSave();
		// verifikacija
		assertTrue(intePage.isMsggmtEurope());
		
	}
}
