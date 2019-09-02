package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MyHomePage extends ProjectWrappers {

	public MyHomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Home | opentaps CRM")){
			reportStep("This is not MyHome Page", "FAIL");
		}
	}	

	public LoginPage clickLogOut(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));	
		return new LoginPage(driver, test);
	}
	
	public MyHomePage verifyWelcomeMsg(String text){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), text);
		return this;
	}
	
	public LeadPage clickonLeadTab(){
		clickByLink(prop.getProperty("MyHome.Leads.Xpath"));
		return new LeadPage(driver, test);
	}
	
	
	





















}
