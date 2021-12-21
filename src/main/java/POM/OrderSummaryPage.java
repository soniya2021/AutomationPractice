package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	public  OrderSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement IConfirmMyOrde;
	
	
	public WebElement getIConfirmMyOrde() {
		return IConfirmMyOrde;
	}
	

}
