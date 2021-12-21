package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="(//a[@title=\"Proceed to checkout\"])[2]")
	private WebElement ProceedToCheckout;
	
	
	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}
 
}
