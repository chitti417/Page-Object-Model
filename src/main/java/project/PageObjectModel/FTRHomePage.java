package project.PageObjectModel;

import wrappers.GenericWrappers;

public class FTRHomePage extends GenericWrappers {
	
	public FTRRegistrationPage clickOnNewUserOrSignup(){
		
		clickByXpath("//a[text()='New User? Signup']");
		
		return new FTRRegistrationPage();
		
	}
	 public FTRHomePage waitTime(long time){
	    	waitProprtu(time);
	    	return this;
	    }
	 public FTRHomePage switchingToLastWindow(){
	    	switchToLastWindow();
	    	return this;
	    }


}
