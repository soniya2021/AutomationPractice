package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.GenericUtiles.WebDriverUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage {
	public  CreateAnAccountPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	WebDriverUtility wlib = new WebDriverUtility();
	
	
	
	
	@FindBy(id="customer_firstname")
	private WebElement FirstName;
	
	@FindBy(id="customer_lastname")
	private WebElement LastName;
	
	@FindBy(id="passwd")
	private WebElement Password;
	
	@FindBy(id="company")
	private WebElement Company;
	
	public WebElement getCompany(String company) {
		return Company;
	}
	@FindBy(id="address1")
	private WebElement Address;
	
	@FindBy(id="city")
	private WebElement City;
	
	@FindBy(id="postcode")
	private WebElement PostalCode;
	
	@FindBy(id="phone_mobile")
	private WebElement MobilePhone;
	
	@FindBy(id="alias")
	private WebElement AssignAnAddressAliasForFutureReference;
	
	@FindBy(id="submitAccount")
	private WebElement Register;

	
	
	
	
	
	public WebElement getFirstName(String firstname) {
		return FirstName;
	}

	public WebElement getLastName(String lastname) {
		return LastName;
	}

	public WebElement getPassword(String password) {
		return Password;
	}
	
	

	public WebElement getAddress(String address) {
		return Address;
	}

	public WebElement getCity(String city) {
		return City;
	}

	public WebElement getPostalCode(String postalCode) {
		return PostalCode;
	}

	public WebElement getMobilePhone(String mobilePhone) {
		return MobilePhone;
	}

	public WebElement getAssignAnAddressAliasForFutureReference(String alias) {
		return AssignAnAddressAliasForFutureReference;
	}

	public WebElement getRegister() {
		return Register;
	}
	@FindBy(id="id_state")
	private WebElement StateOptions;
	
	
	public WebElement getStateOptions() {
		return StateOptions;
	}

	public void state() {
		
		wlib.SelectOption(StateOptions, 2);
	}
		@FindBy(id="id_country")
		private WebElement CountryOptions;

		public WebElement getCountryOptions() {
			return CountryOptions;
		}
		
		public void country() {
			wlib.SelectOption(CountryOptions, 1);
		}
		
		
		
		
	}

