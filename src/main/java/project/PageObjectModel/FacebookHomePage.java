package project.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookHomePage extends GenericWrappers {
	
	public FacebookCreateAccountLinkPage clickOnLanguage(){
		clickByXpath(prop.getProperty("FacebookHomePage.ClickOnLanguage.Xpath"));
		return new FacebookCreateAccountLinkPage(driver, test);
	}
	public FacebookHomePage(RemoteWebDriver driver,ExtentTest test){
		   this.driver =driver;
		   this.test=test;
		   
	   }
	
	public FacebookHomePage waitTimeFBHomePage(long time ){
	waitProprtu(time);
	return this;
	}
	
	
}
