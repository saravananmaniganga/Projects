package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectWrappers;

public class TC001_Login extends ProjectWrappers{
	
	@BeforeClass
	public void setValues(){
		testCaseName = "TC003_ClickBySFRAlink";
		testDescription = "Login and Logout to LeafTaps";
		authors = "Babu";
		category = "Smoke";
		browserName = "chrome";
		dataSheetName = "TC003";	
	}
	
	@Test(dataProvider="fetchData")
	public void loginLogOut(String uName, String pwd, String welcome){
		new LoginPage(driver, test)
		.typeUserName(uName)
		.typePassword(pwd)
		.clickLogin()
		.verifyWelcomeMsg(welcome)
		.ClickbysfraLink();
		
		
		
	}
}















