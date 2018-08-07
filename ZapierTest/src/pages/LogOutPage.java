package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutPage extends PageObject {

	public LogOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "html/body/div[3]/div/div/div/div[3]/div[1]/div/div/div")
	WebElement avatar;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div[1]/div/div[4]/div[1]/div[2]/div/section[3]/div/ul/li[2]/a")
	WebElement developer;

	@FindBy(css = "#app > div > section.developer-winged-section > div > section.developer-hero > a.button.button--large.button--primary.button--bold.developer-hero__button.developer-hero__button--right")
	WebElement devCode;

	@FindBy(css = "#dashboard-container > div > div.developer-dashboard > div.info-block.info-block--unpadded.dashboard-cta > div > div.dashboard-cta__cli-button > a")
	WebElement startApps;

	@FindBy(css = "#app > div > div > div.step-content > footer > div > a")
	WebElement getStart;

	@FindBy(css = ".generic-heading.generic-heading--1-em-bottom.generic-heading--bold.step-title")
	WebElement versionMsg;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[3]/div[1]/div[2]/div/section[3]/div/ul/li[3]/a")
	WebElement logOut;

	@FindBy(xpath = "html/body/div[3]/div/div[1]/div/div[1]/a")
	WebElement zapier;
	
	
	public void isAAvatar() {
		avatar.click();
	}

	public void isDeveloper() {
		developer.click();
	}

	public void isDevCode() {
		devCode.click();
	}

	public void isStartApps() {
		startApps.click();
	}

	public void isGetStart() {
		getStart.click();
	}

	public boolean isMsgzapier() {
		wait.until(ExpectedConditions.visibilityOf(zapier));
		return zapier.isDisplayed();
	}

	public void isLogOut() {
		logOut.click();
	}

	// verifikacija LogOut-a
	public void webUrl() {
		String url = "https://zapier.com/";
		driver.get(url);

		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println("Logout is correct");
		} else {
			System.out.println("Logout is incorrect");
			System.out.println("Actual url is : " + actualUrl);
			System.out.println("Expected url is : " + url);
		}
	}
}
