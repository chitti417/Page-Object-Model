package project.PageObjectModel;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage clickOnEnquiryForm(){
		clickByXpath("//a[text()='Enquiry Form']");
		return this;
	}

}
