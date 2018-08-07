package test;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends InitTest {
	HomePage homePage;

	// Test 1
	@Test(priority = 6)
	public void toHome() {
		homePage = new HomePage(driver);
		
		homePage.isDropdown();
		homePage.isDropdownSlect();
		homePage.toHeroSlect();
		// verifikacija
		homePage.isMsgHero();

		homePage.isClearAll();
	}
}
