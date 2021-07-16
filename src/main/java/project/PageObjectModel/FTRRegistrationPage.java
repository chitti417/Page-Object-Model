package project.PageObjectModel;

import org.jsoup.nodes.Document.QuirksMode;

import wrappers.GenericWrappers;

public class FTRRegistrationPage extends GenericWrappers {
	
	public FTRRegistrationPage enterUserIdForFTR(String userId){
		enterByXpath("//input[@id='userId']", userId);
		return this;
	}
	public FTRRegistrationPage enterPasswordForFTR(String password){
		enterByXpath("//input[@id='password']", password);
		return this;
	}
	public FTRRegistrationPage enterConfirmPasswordForFTR(String confirmpassword){
		enterByXpath("//input[@id='cnfPassword']", confirmpassword);
		return this;
	}
	public  FTRRegistrationPage selectSecurityQuestionForFTRRegistration(String option){
		selectByValueByXpath("//select[@id='secQstn']", option);
		return this;
		
	}
	public FTRRegistrationPage enterSecurityAnswerForFTR(String secAnswer){
		enterByXpath("//input[@id='secAnswer']", secAnswer);
		return this;
	}
	public FTRRegistrationPage clickOnDOBFieldForFTRRegistration(){
		clickByXpath("//input[@id='dateOfBirth']");
		return this;
	}
	
	//Month
	
	public FTRRegistrationPage selectMonthFTR(String MonthValue){
		
		selectByValueByXpath("//select[@class='ui-datepicker-month']", MonthValue);
		return this;
		
	}
    public FTRRegistrationPage selectYearFTR(String yearvalue){
    	selectByValueByXpath("//select[@class='ui-datepicker-year']", yearvalue);
    	return this;
		
	}
    public FTRRegistrationPage selectDayFTR(String day){
    	clickByXpath("(//a[@class='ui-state-default'])["+day+"]");
    	return this;
	
   }
    
    public FTRRegistrationPage clickOnMaleButtonFTR(){
    	clickByXpath("//input[@value='M']");
    	return this;
    	
    }
    public FTRRegistrationPage clickOnFeMaleButtonFTR(){
    	clickByXpath("//input[@value='F']");
    	return this;
    }
    public FTRRegistrationPage clickOnTransgenderButtonFTR(){
    	clickByXpath("//input[@value='T']");
    	return this;
    }
    public FTRRegistrationPage clickOnInstitutionButtonFTR(){
    	clickByXpath("//input[@value='I']");
    	return this;
    }
    
    public FTRRegistrationPage clickOnMarriedButton(){
    	clickByXpath("//input[@value='Married']");
    	return this;
    }
    
    public FTRRegistrationPage clickOnUnMarriedButton(){
	  clickByXpath("//input[@value='UnMarried']");
	  return this;	
    }
    public FTRRegistrationPage enterEmailIdFTR(String emailidFTR){
    	enterByXpath("//input[@id='email']", emailidFTR);
    	return this;
    }

    public FTRRegistrationPage enterOccupationFTR(){
    	selectByValueByXpath("//select[@id='occupation']", "Public");
    	return this;
    }
    public FTRRegistrationPage enterFirstNameAsPANForFTR(String fname){
    	enterByXpath("enterByXpath(xpathValue, data);", fname);
    	return this;
    }
    public FTRRegistrationPage enterMiddleNameAsPANForFTR(String mname){
    	enterByXpath("//input[@id='mname']", mname);
    	return this;
    }
    public FTRRegistrationPage enterLastNameAsPANForFTR(String lname){
    	enterByXpath("//input[@id='lname']", lname);
    	return this;
   }
    public FTRRegistrationPage selectNationalityForFTR(){
    	selectByValueByXpath("//select[@id='natinality']", "94");
    	return this;
    }
    
    //Address
    
    public FTRRegistrationPage enterFlatNoForFTR(String flatNo){
    	enterByXpath("//input[@id='flatNo']", flatNo);
    	return this;
    }
    
    public FTRRegistrationPage enterStreetNameforFTR(String Street){
    	enterByXpath("//input[@id='street']", Street);
    	return this;
    }
    public FTRRegistrationPage enterAreaNameforFTR(String Area){
    	enterByXpath("//input[@id='area']", Area);
    	return this;
    }
    
    public FTRRegistrationPage selectCountryName(){
    	selectByValueByXpath("//select[@id='country']", "94");
    	return this;
    }
    
    public FTRRegistrationPage enterMobileNumberForFTR(String mobno){
    	enterByXpath("//input[@id='mobile']", mobno);
    	return this;
    }
    public FTRRegistrationPage enterPincodeForFTR(String pincode){
    	enterByXpath("//input[@id='pincode']", pincode);
    	return this;
    }
    
    public FTRRegistrationPage clickOnCityFTR(){
    	//needs to check on xpath
    	clickByXpath("//select[@id='city']");
    	return this;
    }
    
    public FTRRegistrationPage selectPostOfficeFTR(){
    	selectByValueByXpath("//select[@id='postOffice']", "Kallipalem B.O");
    	return this;
    }
    public FTRRegistrationPage clickOnCommercialAddressAsNo(){
    	clickByXpath("(//input[@name='sameAddresses'])[2]");
    	return this;
    }
    
    //Communication address
    public FTRRegistrationPage enterOfficeFlatNoForFTR(String offflatNo){
    	enterByXpath("//input[@name='flatNoOffice']", offflatNo);
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeStreetNameforFTR(String offStreet){
    	enterByXpath("//input[@id='streetOffice']", offStreet);
    	return this;
    }
    public FTRRegistrationPage enterOfficeAreaNameforFTR(String officeArea){
    	enterByXpath("//input[@id='areaOffice']", officeArea);
    	return this;
    }
    
    public FTRRegistrationPage selectOfficeCountryName(){
    	selectByValueByXpath("//select[@id='countryOffice']", "94");
    	return this;
    }
    
    public FTRRegistrationPage enterOfficeMobileNumberForFTR(String officemobno){
    	enterByXpath("//input[@id='mobileOffice']", officemobno);
    	return this;
    }
    public FTRRegistrationPage enterOfficePincodeForFTR(String officepincode){
    	enterByXpath("//input[@id='pincodeOffice']", officepincode);
    	return this;
    }
    
   
    
    public FTRRegistrationPage selectOfficePostOfficeFTR(){
    	selectByValueByXpath("//select[@id='postOfficeOffice']", "Kallipalem B.O");
    	return this;
    }
    public FTRRegistrationPage waitTime(long time){
    	waitProprtu(time);
    	return this;
    }
    public FTRRegistrationPage movePageDown(){
    	pageMoveDown();
    	return this;
    }
    
    public FTRRegistrationPage switchingToLastWindow(){
    	switchToLastWindow();
    	return this;
    }
    public FTRRegistrationPage switchingToFirstWindow(){
    	switchToParentWindow();
    	return this;
    }
    
    public void closingAllBrowsers(){
    	closeAllBrowsers();
    }
}
