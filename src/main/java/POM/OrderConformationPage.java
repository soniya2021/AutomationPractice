package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class OrderConformationPage {
	
	public OrderConformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement ConformationMessage;


	public WebElement getConformationMessage() {
		return ConformationMessage;
	}
	
	
}
