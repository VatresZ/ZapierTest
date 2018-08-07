package test;

import org.testng.annotations.Test;
import pages.AppsPage;

public class AppsTest extends InitTest {

	AppsPage appsPage;
	
	// Test 1
	@Test(priority = 7)
	public void toApps() {
		appsPage = new AppsPage(driver);
		appsPage.isApps();
		appsPage.isPremium();
		appsPage.isPostgre();
		appsPage.isExplore();
		appsPage.isRight();	

	}
}
