package test;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import pages.LoginPage;
import pages.HomePage;


public class LoginTest extends InitTest{
	LoginPage logPage;
	HomePage homePage;
	
//	Test 1
	@Test(priority = 0)
	public void invEmailPass() {
		driver.get("https://zapier.com/app/login/");
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("", "");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
  }
//	Test 2
	@Test(priority = 1)
	public void invEmail() {
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("", "zapiertestiranje");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
  }
//	Test 3
	@Test(priority = 2)
	public void invPass() {
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("qazvtest@gmail.com", "");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
  }
//	Test 4
	@Test(priority = 3)
	public void inccorectEmail() {
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("qazvtest@gmail.co", "zapiertestiranje");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
  }
//	Test 5
	@Test(priority = 4)
	public void inccorectPass() {
		logPage = new LoginPage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("qazvtest@gmail.com", "zapiertestiranj");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
  }
	
//	Test 6
	@Test(priority = 5)
	public void correctLogIn() {
		logPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		assertTrue(logPage.isEmail());
		assertTrue(logPage.isPass());
		assertTrue(logPage.isLogin());
		logPage.fillData("qazvtest@gmail.com", "zapiertestiranje");
		logPage.logIn();
		// verifikacija
		assertTrue(logPage.isMsgPresent());	
//		verifikacija prelaska na novu HomePage
		assertTrue(homePage.isMsgAvatar());
		
  }
}
