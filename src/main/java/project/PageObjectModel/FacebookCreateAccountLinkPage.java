package project.PageObjectModel;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookCreateAccountLinkPage extends GenericWrappers {
	
	
	public FacebookCreateAccountLinkPage(RemoteWebDriver driver,ExtentTest test){
		   this.driver =driver;
		   this.test=test;
		   
	   }
	
	
	public FacebookRegistrationPage clickOnCreateAccountLink(){
		clickByXpath(prop.getProperty("FacebookCreateAccountLinkPage.createAccountLink.Xpath"));
		return new FacebookRegistrationPage(driver, test);
	}
	
	 public FacebookCreateAccountLinkPage waitTimeFBCreateAccountLinkPage(long time ){
			waitProprtu(time);
			return this;
			}
	
}
