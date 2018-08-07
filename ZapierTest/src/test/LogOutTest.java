package test;

import org.testng.annotations.Test;
import pages.LogOutPage;

public class LogOutTest extends InitTest {

	LogOutPage logoutPage;
	
	// Test 1
	@Test(priority = 8)
	public void toLogOut() {
		logoutPage = new LogOutPage(driver);
		
		logoutPage.isAAvatar();
		logoutPage.isDeveloper();
		logoutPage.isDevCode();
		logoutPage.isStartApps();
		logoutPage.isGetStart();
		//verifikacija
		logoutPage.isMsgzapier();
		logoutPage.isAAvatar();
		logoutPage.isLogOut();
		//verifikacija
		logoutPage.webUrl();
	}
}
