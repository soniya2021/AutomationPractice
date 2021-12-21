package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public PaymentPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement PayByCheck;

	public WebElement getPayByCheck() {
		return PayByCheck;
	}
	
	

}
