package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageObject{

	public LoginPage(WebDriver driver) {
		super(driver);
	}               
	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/div/div/div/div[3]/input[1]")
	WebElement email;
	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/div/div/div/div[3]/input[2]")
	WebElement password;
	@FindBy(xpath = "html/body/div[3]/div/div/div[2]/div/div/div/div/div[3]/div/div/div/div[5]/button")
	WebElement logIn;
	@FindBy(xpath = "html/body/div[3]/div/div[1]/div/div[1]/a")
	WebElement zapierMsgs;
	
	public void fillData(String user, String pass) {
		email.clear();
		email.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
	}	
	public void logIn() {
		logIn.click();
	}		
	public boolean isEmail() {
		wait.until(ExpectedConditions.visibilityOf(email));
		return email.isDisplayed();
	}
	public boolean isPass() {
		wait.until(ExpectedConditions.visibilityOf(password));
		return password.isDisplayed();
	}
	public boolean isLogin() {
		wait.until(ExpectedConditions.visibilityOf(logIn));
		return logIn.isDisplayed();
	}		
	// metoda verifikacije neispravan email or pass -Your email or password is incorrect.
	public boolean isMsgPresent() {
		wait.until(ExpectedConditions.visibilityOf(zapierMsgs));
//		System.out.println(invalidMsgs);
		return zapierMsgs.isDisplayed();
	}
}
