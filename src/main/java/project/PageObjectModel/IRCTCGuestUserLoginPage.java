package project.PageObjectModel;

import wrappers.GenericWrappers;

public class IRCTCGuestUserLoginPage extends GenericWrappers {
	
	public IRCTCGuestUserLoginPage clickOnGuestUser(){

		clickByXpath("//a[text()=' Guest User Login']");
		return this;
	}
	
	public HotelPageWithGuestLogin clickOnsignIn(){
		clickByXpath("(//button[@type='submit'])[2]");
		
		return new HotelPageWithGuestLogin();
	}
	
		

}
