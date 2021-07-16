package project.PageObjectModel;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class RegistrationPersonalDetailsPage extends GenericWrappers {
	
	public RegistrationPersonalDetailsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	
    //User personal details
    
    public RegistrationPersonalDetailsPage enterFirstName(String data){
    	enterByXpath("//input[@id='firstName']", data);
    	return this;
    }
    
    public RegistrationPersonalDetailsPage enterMiddleName(String data){
    	enterByXpath("//input[@id='middleName']", data);
    	return this;
    }
    
    public RegistrationPersonalDetailsPage enterLastName(String data){
    	enterByXpath("//input[@id='lastname']", data);
    	return this;
    }
    
    public RegistrationPersonalDetailsPage clickOnOccupationDropDown(){
    	clickByXpath("//span[text()='Select Occupation']");
    	return this;
    }
    
    public RegistrationPersonalDetailsPage chooseOccupation(String occupation){
    	clickByXpath("//span[text()='"+occupation+"']");
    	return this;
    }
    
    public RegistrationPersonalDetailsPage clickOnDOBDropDown(){
    	clickByXpath("//input[@placeholder='Date Of Birth']");
    	return this;
    }
    
    public RegistrationPersonalDetailsPage selectMonth(String Month){
    	selectByValueByXpath("//select[@class='ui-datepicker-month ng-tns-c59-17 ng-star-inserted']", Month);
    	return this;
    }
    public RegistrationPersonalDetailsPage selectYear(String Year){
    	selectByValueByXpath("//select[@class='ui-datepicker-year ng-tns-c59-17 ng-star-inserted']", Year);
    	return this;
    	
    }
    public RegistrationPersonalDetailsPage selectDay(String Day){
    	//clickByXpath("(//a[@class='ui-state-default ng-tns-c59-29 ng-star-inserted'])["+Day+"]");
    	
    	//clickByXpath("//a[@class='ui-state-default ng-tns-c59-17 ng-star-inserted'])["+Day+"]");
    	
    	clickByXpath("//a[text()='"+Day+"']");
    	
    			return this;
    }
    
    public RegistrationPersonalDetailsPage clickOnMarriedStatus(){
    	clickByXpath("//label[text()='Married']");
    	return this;
    }
    
    public RegistrationPersonalDetailsPage clickOnUnMaritalStatus(){
    	clickByXpath("//label[text()='Unmarried']");
    	return this;
    }
    public RegistrationPersonalDetailsPage selectCountry(String countryvalue){
    	selectByValueByXpath("//select[@formcontrolname='resCountry']", countryvalue);
    	
    	return this;
    }
    
    public RegistrationPersonalDetailsPage clickOnMaleOption(){
    	clickByXpath("//span[text()='Male']");
    	return this;
    }
    
  
    public RegistrationPersonalDetailsPage clickOnFeMaleOption(){
    	clickByXpath("//span[text()='Female']");
    	return this;
    }
    public RegistrationPersonalDetailsPage clickOnTransgenderOption(){
    	clickByXpath("//span[text()='Transgender']");
    	return this;
    }
    
    
    
    public RegistrationPersonalDetailsPage enterEmailId(String mailid){
    	
    	enterByXpath("//input[@id='email']", mailid);
    	
    	return this;
    }
    
    public RegistrationPersonalDetailsPage enterMobilNumber(String mobno){
    	enterByXpath("//input[@id='mobile']", mobno);
    	return this;
    }
    
    //Needs to check about Xpath
    public RegistrationPersonalDetailsPage selectNattionality(String Countryvalue){
    	selectByValueByXpath("//select[@formcontrolname='nationality']", Countryvalue);
    	
    	//select[@formcontrolname='nationality'] 
    	return this;
    }
    
    public RegistrationAddressDetailsPage clickOnContinueButton(){
    	clickByXpath("//button[@label='Continue']");
    	return new RegistrationAddressDetailsPage(driver, test);
    }
    
    public RegistrationPersonalDetailsPage waitTime(long time){
    	waitProprtu(time);
    	return this;
    }

}
