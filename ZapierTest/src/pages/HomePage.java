package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "html/body/div[2]/div/div[1]/div/div[3]/nav[1]/div[1]/a")
	WebElement home;
	
	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[2]")
	List<WebElement> dropdown;

	@FindBy(xpath = "//*[text()[contains(.,'Accounting')]]")
	WebElement dropdownSlect;

	@FindBy(css = ".service-icon__logo-wrap")
	WebElement heroSlect;

	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[1]")
	WebElement msgHero;

	@FindBy(xpath = "html/body/div[2]/div/div[1]/div/div[4]/div[1]/div/div/div")
	WebElement msgAvatar;

	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div[2]/div/div[1]/div/div[3]/div[5]")
	WebElement clearAll;

	public void isHome() {
		home.click();
	}

	public void isDropdown() {
		dropdown.get(0).click();
	}

	public void isDropdownSlect() {
		dropdownSlect.click();
	}

	public void isClearAll() {
		clearAll.click();
	}

	public void toHeroSlect() {
		wait.until(ExpectedConditions.elementToBeClickable(heroSlect));
		heroSlect.click();
	}

	public boolean isMsgHero() {
		wait.until(ExpectedConditions.visibilityOf(msgHero));
		return msgHero.isDisplayed();
	}

	// metoda verifikacije neispravan email or pass -Your email or password is incorrect.
	public boolean isMsgAvatar() {
		wait.until(ExpectedConditions.visibilityOf(msgAvatar));
		System.out.println(msgAvatar + "is prezent. Login successfully");
		return msgAvatar.isDisplayed();
	}
}
