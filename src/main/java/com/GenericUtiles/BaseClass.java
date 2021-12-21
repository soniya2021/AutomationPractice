package com.GenericUtiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;









public class BaseClass {

	public WebDriverUtility wlib= new WebDriverUtility();
	public FileUtility fLib = new FileUtility();
	public WebDriver driver;

	@BeforeSuite
	public void connectToDB() {

		System.out.println("===========DB Connection Sucessfull=============");
	}




	@BeforeClass
	public void launchBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		//read data from property file
		String BROWSER = fLib.getPropertyKeyValue("browser");
		String URL = fLib.getPropertyKeyValue("url");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid Browser Name");
		}

		System.out.println("===========Browser Launch Sucessfully===========");
driver.get(URL);
	}


	@BeforeMethod
	public void loginToApp() throws Throwable {
		//read data from property file
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		// login to app


		System.out.println("=============login sucessfull===========");
	}




	@AfterMethod
	public void logoutApp() {
		//sign out of home page


		System.out.println("==========sign out sucessfull==========");
	}






	@AfterClass
	public void closeBrowser() {

		driver.close();
		System.out.println("=====Browser close sucessfull============");
	}	




	@AfterSuite
	public void closeDB() {

		System.out.println("=============DB connection closed sucessfully======");	

	}
}