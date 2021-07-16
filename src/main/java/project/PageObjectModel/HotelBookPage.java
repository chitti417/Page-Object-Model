package project.PageObjectModel;

import wrappers.GenericWrappers;

public class HotelBookPage extends GenericWrappers {
	
	public HotelPaymentPage clickOnGo(){
		clickByXpath("//button[text()='Go']");
		return new HotelPaymentPage();
	}
	public HotelOTPVerificationPage clickOnMakePayment(){
		clickByXpath("//button[text()='Make Payment']");
		return new HotelOTPVerificationPage();
	}

}
