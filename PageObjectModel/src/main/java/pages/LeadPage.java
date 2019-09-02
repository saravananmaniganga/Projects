package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class LeadPage extends ProjectWrappers {

	public LeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("My Leads | opentaps CRM")){
			reportStep("This is not Myleads Page", "FAIL");
		}
	}	

	public LoginPage clickLogOut(){
		clickByClassName(prop.getProperty("Home.Logout.Class"));	
		return new LoginPage(driver, test);
	}
	
	public LeadPage verifyWelcomeMsg(String text){
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), text);
		return this;
	}
	
	public MyHomePage ClickbysfraLink(){
		clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new MyHomePage(driver, test);
	}
	
	
	





















}
