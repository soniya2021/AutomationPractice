package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtiles.BaseClass;
import com.GenericUtiles.WebDriverUtility;

import org.openqa.selenium.support.FindBy;

public class DressesPage extends BaseClass{

	
	
	public DressesPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="(//span[text()='Add to cart'])[2]")
	private WebElement DressesAddToCart;
	
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement TShirts;


	public WebElement getDressesAddToCart() {
		return DressesAddToCart;
	}


	public WebElement getTShirts() {
		return TShirts;
	}
	
	public void dressCartWaitMethod() {
		wlib.waitForElementVisibility(driver, DressesAddToCart);
	}
	

}
