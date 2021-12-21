package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email_create")
	private WebElement EmailAdressTextBox;
	
	@FindBy(id="SubmitCreate")
	private WebElement CreateAnAccount;

	public WebElement getEmailAdressTextBox(String email) {
		return EmailAdressTextBox;
	}

	public WebElement getCreateAnAccount() {
		return CreateAnAccount;
	}
	
	

}
