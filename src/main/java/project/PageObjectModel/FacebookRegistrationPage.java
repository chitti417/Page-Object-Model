package project.PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class FacebookRegistrationPage extends GenericWrappers {
	
	 public FacebookRegistrationPage(RemoteWebDriver driver,ExtentTest test){
		   this.driver =driver;
		   this.test=test;
		   
	   }
	
	 public FacebookRegistrationPage waitTimeFBRegistrationPage(long time ){
			waitProprtu(time);
			return this;
			}
	
	public FacebookRegistrationPage enterFirstNameForFB(String FirstNameForFB){
		enterByXpath(prop.getProperty("FacebookRegistrationPage.FirstName.Xpath"), FirstNameForFB);
		return this;
	}
	
	public FacebookRegistrationPage enterSurNameForFB(String SurNameForFB){
		enterByXpath(prop.getProperty("FacebookRegistrationPage.SurName.Xpath"), SurNameForFB);
		return this;
	}
	
	public FacebookRegistrationPage enterEmailIdForFB(String emqailIdForFB){
		enterByXpath(prop.getProperty("FacebookRegistrationPage.EmailId.Xpath"), emqailIdForFB);
		return this;
	}
	public FacebookRegistrationPage enterConfirmEmailIdForFB(String confirmemqailIdForFB){
		enterByXpath(prop.getProperty("FacebookRegistrationPage.ConfirmEmailId.Xpath"), confirmemqailIdForFB);
		return this;
	}
	public FacebookRegistrationPage enterPasswordForFB(String PasswordForFB){
		enterByXpath(prop.getProperty("FacebookRegistrationPage.Password.Xpath"), PasswordForFB);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return this;
	}
	//DOB
	//day
	public FacebookRegistrationPage selectDay(String day){
		selectByValueByXpath(prop.getProperty("FacebookRegistrationPage.DayForDOB.Xpath"), day);
		return this;
	}
	
	
	//Month
	public FacebookRegistrationPage selectMonth(String Month){
		selectByValueByXpath(prop.getProperty("FacebookRegistrationPage.MonthForDOB.Xpath"), Month);
		return this;
	}
	
	//Year
	public FacebookRegistrationPage selectyear(String year){
		selectByValueByXpath(prop.getProperty("FacebookRegistrationPage.YearForDOB.Xpath"), year);
		return this;
	}

	public FacebookRegistrationPage clickOnFemaleButton(){
		clickByXpath(prop.getProperty("FacebookRegistrationPage.FemaleButton.Xpath"));
		return this;
	}
	public FacebookRegistrationPage clickOnMaleButton(){
		clickByXpath(prop.getProperty("FacebookRegistrationPage.MaleButton.Xpath"));
		return this;
	}
	public FacebookRegistrationPage clickOnCustomButton(){
		clickByXpath(prop.getProperty("FacebookRegistrationPage.CustomButton.Xpath"));
		return this;
	}
	
	public FacebookRegistrationPage clickOnSignUpButton(){
		clickByXpath(prop.getProperty("FacebookRegistrationPage.SubmitButton.Xpath"));
		return this;
		
	}
	public FacebookRegistrationPage closingAllBrowsers(){
		
		closeAllBrowsers();
		return this;
		
	}
	
	
	
	
}
