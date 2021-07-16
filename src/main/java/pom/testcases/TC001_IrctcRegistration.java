package pom.testcases;

import org.testng.annotations.*;
import org.testng.annotations.*;
import project.PageObjectModel.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001_IrctcRegistration extends ProjectWrappers {
	

	@BeforeClass
	
	public void beforeClass() {
		//we can use it for startTest(), but But test case name, descriptions are changes for every test case
				//So its good to declare it in class level
				//paste it in test case(class)
				//startTest(testName, description);
		
		testCaseName="TC001_IrctcRegistration";
		testCaseDescription="To verfiy whether the user is able to perform registarion with valid details for IRCTC";
		author="chitti";
		category="smoke";
		browserName="chrome";
		appName="irctc";
	}
	@Test
	public void irctcRegistration(){
		
		new CovidAlertPage(driver,test).
		clickOnOk().
		waitTimeHomePage(5000).
		clickOnRegister().
		waitTimeRegistrationPage(5000).
		enterUserName("chitti").
		enterPassword("Chitti@123").
		enterConfirmPassword("Chitti@123").
		clickOnpreferredLanguageDropDown().
		selectreferredLanguage().
		clickOnSecurityQuestionDropDown().
		selectSecurityQuestion("'What is your pet name?'").
		enterSecurityAnswer("Ramu").
		clickOnContinue().
		
		enterFirstName("Chitti").
		enterMiddleName("Babu").
		enterLastName("Vollu").
		clickOnOccupationDropDown().
		chooseOccupation("PRIVATE").
		
		clickOnDOBDropDown().
		selectMonth("5").
		selectYear("1995").
		selectDay("25").
		clickOnUnMaritalStatus().
		selectCountry("94").clickOnMaleOption().
		enterEmailId("test123@gmail.com").
		enterMobilNumber("9876543210").
		selectNattionality("94").
		clickOnContinueButton().
		
		enterFlatNo("4-38").
		enterStreetAddress("kONAPHALAM").
		enterAreaDetails("konaphalam").
		enterPincode("522262").
		clickOnStateField().
		selectCity().
		selectPostOffice("Kallipalem B.O").
		enterPhoneNumber("9999999999").
		
		clickOnCopyAddresAsNo().
		
		enterOfficeFlatNo("4-37").
		enterOfficeStreetAddress("Jai nagar").
		enterOfficeAreaDetails("Ramanagar").
		clickOnCountryDropDown().
		clickOnCountry().
		enterOfficePincode("5222662").
		enterOfficeState("andhrapradesh").
		enterOfficeCity("Repalle").
		enterOfficePostOffice("Kallipalem b.o").
		enterOfficePhoneNumber("9874561230").
		pageMoveDownRegistrationAddressDetailsPage().
		waitTimeRegistrationAddressDetailsPage(5000);
		//clickOnTermsandConditions();
		
		
		

	}

}
