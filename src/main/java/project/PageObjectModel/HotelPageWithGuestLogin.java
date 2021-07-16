package project.PageObjectModel;

import wrappers.GenericWrappers;

public class HotelPageWithGuestLogin extends GenericWrappers {
	
	public HotelListPage clickOnFindHotel(){
		clickByXpath("(//button[text()='Find Hotel'])");
		return new HotelListPage();
	}
	
	


}
