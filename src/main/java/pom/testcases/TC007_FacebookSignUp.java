package pom.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import project.PageObjectModel.FacebookHomePage;

import wrappers.ProjectWrappers;


public  class TC007_FacebookSignUp extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		//we can use it for startTest(), but But test case name, descriptions are changes for every test case
				//So its good to declare it in class level
				//paste it in test case(class)
				//startTest(testName, description);
		
		testCaseName="FacebookSignUp";
		testCaseDescription="To verfiy whether the user is able to perform registarion with valid details";
		author="chitti";
		category="smoke";
		browserName="chrome";
		appName="facebook";
	}
	
	@Test
     
        public void facebookSignUp(){
		new FacebookHomePage(driver,test)
		.clickOnLanguage()
		.clickOnCreateAccountLink()
		.enterFirstNameForFB("Chitti")
		.enterSurNameForFB("vollu")
		.enterEmailIdForFB("test123456@gmail.com")
		.enterConfirmEmailIdForFB("test123456@gmail.com")
		.enterPasswordForFB("Chitti$123456")
		.selectDay("6")
		.selectMonth("5")
		.selectyear("1990")
		.clickOnMaleButton()
		.clickOnSignUpButton();
	
	}

}
