package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement Dresses;

	public WebElement getDresses() {
		return Dresses;
	}

}
