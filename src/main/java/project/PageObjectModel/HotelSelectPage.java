package project.PageObjectModel;

import wrappers.GenericWrappers;

public class HotelSelectPage extends GenericWrappers {
	
	public HotelBookPage clickOnContinueToBook(){
		clickByXpath("(//button[text()='Continue to book '])[1]");
		return new HotelBookPage();
	}

}
