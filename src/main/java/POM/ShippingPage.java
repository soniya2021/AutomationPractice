package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	public  ShippingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="cgv")
	private WebElement CheckBox;
	
	@FindBy(name="processCarrier")
	private WebElement ProceedToCheckout;

	public WebElement getCheckBox() {
		return CheckBox;
	}

	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}
	
	

}
