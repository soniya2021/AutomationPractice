package com.PracticeHardCode;


import org.testng.annotations.Test;

import com.GenericUtiles.BaseClass;
import com.GenericUtiles.ExcelUtility;
import com.GenericUtiles.JavaUtility;
import com.GenericUtiles.WebDriverUtility;

import POM.AddressPage;
import POM.CreateAnAccountPage;
import POM.DressesPage;
import POM.HomePage;
import POM.OrderSummaryPage;
import POM.PaymentPage;
import POM.ShippingPage;
import POM.SignInPage;
import POM.SummaryPage;
import POM.TShirtPage;

public class TC_01 extends BaseClass{
	@Test
	public void tc_01() throws Throwable{
		
		
		WebDriverUtility wlib = new WebDriverUtility();
		wlib.maximiseWindow(driver);
		wlib.waitUntilPageLoad(driver);
		
		
		HomePage hp = new HomePage(driver);
		hp.getDresses().click();

		DressesPage dp = new  DressesPage(driver);
		
		dp.getDressesAddToCart();
		dp.getDressesAddToCart().click();//on dresspage it will click on 2nd product addtocart
		dp.getTShirts().click();//on dresspage it will click on tshirt link

		TShirtPage tsp = new TShirtPage(driver);

		tsp.getTShirtAddToCart().click();   //click on addtocart button on tshirtpage 

		tsp.getProceedToCheckout().click(); //click on proceed to checkout button 

		SummaryPage summary = new SummaryPage(driver);
		summary.getProceedToCheckout().click();

		SignInPage signIn = new SignInPage(driver);
		//*******************************************CreateAnAccountPage****************************

		ExcelUtility elib = new ExcelUtility();
		JavaUtility jlib = new JavaUtility();
		String	email =elib.getExcelData("Sheet1",1, 2)+jlib.getRandomData();
		signIn.getEmailAdressTextBox(email);

		signIn.getCreateAnAccount().click();
		
		CreateAnAccountPage creatAccount = new CreateAnAccountPage(driver);
		String firstname = elib.getExcelData("Sheet1", 1, 3);
		creatAccount.getFirstName(firstname);

		String lastname = elib.getExcelData("Sheet1", 1, 4);
		creatAccount.getLastName(lastname);

		String password = elib.getExcelData("Sheet1", 1, 5);
		creatAccount.getPassword(password);

		String company = elib.getExcelData("Sheet1", 1, 6);
		creatAccount.getCompany(company);

		String address = elib.getExcelData("Sheet1", 1, 7);
		creatAccount.getAddress(address);

		String city = elib.getExcelData("Sheet1", 1, 8);
		creatAccount.getCity(city);

		creatAccount.state();   //to select state 

		String postalCode = elib.getExcelData("Sheet1", 1, 9);
		creatAccount.getPostalCode(postalCode);

		creatAccount.country();


		String mobilePhone = elib.getExcelData("Sheet1", 1, 10);
		creatAccount.getMobilePhone(mobilePhone);

		String alias = elib.getExcelData("Sheet1", 1, 11);
		creatAccount.getAssignAnAddressAliasForFutureReference(alias).click();

		//**************************************Address Page************************************************************
		AddressPage addressPage = new AddressPage(driver);

		addressPage.getProceedToCheckOut().click();

		//*************************ShippingPage******************

		ShippingPage  shipping = new ShippingPage(driver);
		shipping.getCheckBox().click();
		shipping.getProceedToCheckout().click();

//***************************PaymentPage***********************
		PaymentPage payment = new PaymentPage(driver);
		payment.getPayByCheck().click();
		
		//*************************OrderSummaryPage******************
		OrderSummaryPage orderSummary = new OrderSummaryPage(driver);
		
		orderSummary.getIConfirmMyOrde().click();













	}
}
