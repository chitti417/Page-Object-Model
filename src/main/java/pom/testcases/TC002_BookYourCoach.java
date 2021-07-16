package pom.testcases;

import org.testng.annotations.Test;
import project.PageObjectModel.CovidAlertPage;
import org.testng.annotations.*;
import wrappers.GenericWrappers;

public class TC002_BookYourCoach extends GenericWrappers {
	@Test
	public void bookYourCoach(){
		
		new CovidAlertPage(driver,test).clickOnOk().
		mouseHoverOnHolidays().waitTime(2000).mouseHoverOnStays().waitTime(2000).clickOnLounge().waitTime(4000).switchingToLastWindow().waitTime(4000).
		clickOnMenu().clickOnBookYourCoachOrTrain().switchingToLastWindow(). waitTime(5000).clickOnNewUserOrSignup().
		enterUserIdForFTR("chitti123").enterPasswordForFTR("Chitti@123").enterConfirmPasswordForFTR("Chitti@123").
		selectSecurityQuestionForFTRRegistration("What is your pet name?").enterSecurityAnswerForFTR("Chitti").clickOnDOBFieldForFTRRegistration().
		selectMonthFTR("May").selectYearFTR("1995").selectDayFTR("09").clickOnMaleButtonFTR().clickOnUnMarriedButton().enterEmailIdFTR("chitti123@gmail.com").
		enterOccupationFTR().enterFirstNameAsPANForFTR("chitti").enterMiddleNameAsPANForFTR("test").enterLastNameAsPANForFTR("vollu").selectNationalityForFTR().
		enterFlatNoForFTR("4-38").enterStreetNameforFTR("JaiNagar").enterAreaNameforFTR("Rananagar").selectCountryName().enterMobileNumberForFTR("9999999999").
		enterPincodeForFTR("522262").waitTime(4000).movePageDown().clickOnCityFTR().waitTime(4000).movePageDown().selectPostOfficeFTR().clickOnCommercialAddressAsNo().enterOfficeFlatNoForFTR("4-20").
		enterOfficeStreetNameforFTR("rao nagar").enterAreaNameforFTR("nagaram").selectOfficeCountryName().enterOfficeMobileNumberForFTR("1234567890").
		enterOfficePincodeForFTR("522262").selectOfficePostOfficeFTR().closingAllBrowsers();
	}
}