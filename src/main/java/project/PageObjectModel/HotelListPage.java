package project.PageObjectModel;

import wrappers.GenericWrappers;

public class HotelListPage extends GenericWrappers {
	
	public HotelSelectPage clickOnBook(){
		clickByXpath("(//button[text()='Book'])[1]");
		return new HotelSelectPage();
	}
	
	
	
	

}
