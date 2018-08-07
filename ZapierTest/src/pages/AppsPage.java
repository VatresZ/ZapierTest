package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AppsPage extends PageObject {

	public AppsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "#header > div > div > div > div.header-block__links-container > nav.navigation-links-v2.navigation-links-v2--links.navigation-links-v2--logged-in > div:nth-child(2) > a")
	WebElement apps;
 
	@FindBy(css = "#appsListWrapper > div.app-filters > div:nth-child(1) > ul:nth-child(4) > li:nth-child(2) > a")
	WebElement premium;
	
	
	@FindBy(css = ".app-logo.PostgreSQLAPI64x64")
	WebElement postgre;
	
	
	@FindBy(css = ".huge.orange.button")
	WebElement explore;
	
	@FindBy(css = "#app > div > div:nth-child(2) > section > div > div.grid__column.grid__column--span-8 > div:nth-child(3) > div.simple-pagination > span.simple-pagination__icon-after")
	WebElement right;
		
	
	public void isApps() {
		apps.click();
	}

	public void isPremium() {
		premium.click();
	}

	public void isPostgre() {
		postgre.click();
	}
	
	public void isExplore() {
		explore.click();
	}	
	
	public void isRight() {
		right.click();
	}	
	
}
