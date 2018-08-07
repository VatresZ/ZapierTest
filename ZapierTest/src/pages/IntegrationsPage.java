package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class IntegrationsPage extends PageObject {

	public IntegrationsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div[1]/div/div[3]/nav[1]/div[3]/a")
	WebElement integration;
 
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div[3]/div/div/div[1]")
	WebElement slack;
	
	@FindBy(xpath = "html/body/div[3]/div/div/div/div[4]/div[1]/div[1]/div/div")
	WebElement avatar;
	
	@FindBy(xpath = "html/body/div[3]/div/div/div/div[4]/div[1]/div[2]/div/section[3]/div/ul/li[1]/a")
	WebElement settings;	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/section/div[2]/form/div/div[1]/div/div/span[2]/fieldset/div[2]/span/input")
	WebElement firstName;	
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/section/div[2]/form/div/div[1]/div/div/span[2]/fieldset/div[3]/span/input")
	WebElement lastName;
	
	@FindBy(css = "#app > div > div.settings-app > section > div.settings-app__content > form > div > div.button-group.button-group--horizontal.button-group--justify-end > button")
	WebElement save;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/section/div[2]/form/div/div[1]/div/div/span[2]/fieldset/div[4]/span/div/div/div/div/div")
	List<WebElement> timeZone;
	
	@FindBy(xpath = "//*[text()[contains(.,'(GMT) Western Europe Time, London, Lisbon, Casablanca')]]")
	WebElement gmtEurope;
	
	
	
	public void isIntegration() {
		integration.click();
	}

	public void isSlack() {
		slack.click();
	}

	public void isAvatarAvatar() {
		avatar.click();
	}
	
	public void isSettings() {
		settings.click();
	}
	public void fillData(String fName, String lName) {
		firstName.clear();
		firstName.sendKeys(fName);

		lastName.clear();
		lastName.sendKeys(lName);
	}
	public void isSave() {
		save.click();
	}
	public void isTimeZone() {
		timeZone.get(0).click();
	}
	public void isGMTEurope() {
		gmtEurope.click();
	}
	
	public boolean isMsggmtEurope() {
		wait.until(ExpectedConditions.visibilityOf(gmtEurope));
		return gmtEurope.isDisplayed();
	}
	
}
