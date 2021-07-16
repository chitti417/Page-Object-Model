package project.PageObjectModel;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{
	
	public FormCRegistrationPage clickOnSignUpRegistratio(){
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new FormCRegistrationPage();
	}

	
}
