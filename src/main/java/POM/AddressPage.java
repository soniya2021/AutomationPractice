package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {

	public  AddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement ProceedToCheckOut;


	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}
	
	
}
