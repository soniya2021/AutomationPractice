package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class TShirtPage {
	public TShirtPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement TShirtAddToCart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement ProceedToCheckout;

	public WebElement getTShirtAddToCart() {
		return TShirtAddToCart;
	}

	public WebElement getProceedToCheckout() {
		return ProceedToCheckout;
	}

	
	
}
