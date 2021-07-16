package project.PageObjectModel;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationAddressDetailsPage extends GenericWrappers {
	
	public RegistrationAddressDetailsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	
//Address details(needs to check same page or different page)
    
    public RegistrationAddressDetailsPage enterFlatNo(String flatno){
    	enterByXpath("//input[@id='resAddress1']", flatno);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterStreetAddress(String StreetAddress){
    	enterByXpath("//input[@id='resAddress2']", StreetAddress);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterAreaDetails(String Area){
    	enterByXpath("//input[@id='resAddress3']", Area);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterPincode(String pincode){
    	enterByXpath("(//input[@name='resPinCode'])[1]", pincode);
    	return this;
    }
    
    public RegistrationAddressDetailsPage clickOnStateField(){
    	clickByXpath("//input[@id='resState']");
    	return this;
    }
    
    public RegistrationAddressDetailsPage selectCity(){
    	
    	selectByValueByXpath("//select[@formcontrolname='resCity']", "Guntur");
    	return this;
    	
    }
    public RegistrationAddressDetailsPage selectPostOffice(String POName){
    	
    	selectByValueByXpath("//select[@formcontrolname='resPostOff']", POName);
    	return this;
    	
     }
    
    public RegistrationAddressDetailsPage enterPhoneNumber(String PhoneNumber){
    	enterByXpath("//input[@id='resPhone']", PhoneNumber);
    	return this;
    }
    
    
    public RegistrationAddressDetailsPage clickOnCopyAddresAsNo(){
    	clickByXpath("//label[text()='No']");
    	return this;
    }
    
    
    public RegistrationAddressDetailsPage enterOfficeFlatNo(String officeflatno){
    	enterByXpath("//input[@id='offAddress1']", officeflatno);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterOfficeStreetAddress(String OfficeStreetAddress){
    	enterByXpath("//input[@id='offAddress2']", OfficeStreetAddress);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterOfficeAreaDetails(String OfficeArea){
    	enterByXpath("//input[@id='offAddress3']", OfficeArea);
    	return this;
    }
    
    public RegistrationAddressDetailsPage clickOnCountryDropDown(){
    	clickByXpath("//span[text()='Select a Country']");
    	return this;
    }
    
    public RegistrationAddressDetailsPage clickOnCountry(){
    	clickByXpath("//span[text()='India']");
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterOfficePincode(String officepincode){
    	enterByXpath("//input[@id='offPinCode']", officepincode);
    	return this;
    }
    public RegistrationAddressDetailsPage enterOfficeState(String officestate){
    	enterByXpath("//input[@id='offState']", officestate);
    	return this;
    }
    public RegistrationAddressDetailsPage enterOfficeCity(String officecity){
    	enterByXpath("//input[@id='offCity']", officecity);
    	return this;
    }
    public RegistrationAddressDetailsPage enterOfficePostOffice(String officepostoffice){
    	enterByXpath("//input[@id='offPostOff']", officepostoffice);
    	return this;
    }
    
    public RegistrationAddressDetailsPage enterOfficePhoneNumber(String officephonenumber){
    	enterByXpath("//input[@id='offPhone']", officephonenumber);
    	return this;
    }
    
    public RegistrationAddressDetailsPage clickOnTermsandConditions(){
    	clickByXpath("//input[@formcontrolname='termCondition']");
    	
  
    	return this;
    }
    
    public RegistrationAddressDetailsPage pageMoveDownRegistrationAddressDetailsPage(){
    	pageMoveDown();
    	
    	return this;
    	
    }
    
    public RegistrationAddressDetailsPage waitTimeRegistrationAddressDetailsPage(long time){
    	waitProprtu(time);
    	return this;
    }


}
