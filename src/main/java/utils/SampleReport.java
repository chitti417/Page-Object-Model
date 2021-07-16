package utils;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	@Test
	public void generateReport(){
		
	
	//Start report
	//by default its true, if we give false it will give previous results
	ExtentReports report=new ExtentReports("./reports/Result.html",false);
	//Start test
	ExtentTest test= report.startTest("TC001", "To verify IRCTC registration");
	
	test.assignAuthor("Chitti");
	test.assignCategory("Somketest");
	
	//log report
	test.log(LogStatus.PASS, "The application is launched successfully");
	test.log(LogStatus.PASS, "The application is launched successfully");
	test.log(LogStatus.FAIL, "The application is not launched successfully");
	test.log(LogStatus.PASS, "The application is launched successfully");
	//End test
	report.endTest(test);
	//End report
	report.flush();
	
	
	
	
	 
	}
}
