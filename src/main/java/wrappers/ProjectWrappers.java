package wrappers;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class ProjectWrappers extends GenericWrappers {
	
	public String browserName;
	public String appName;
	
	
	@BeforeSuite
	public void beforeSuite(){
		startReport();
		
	}
	
	@BeforeTest
	public void beforeTest(){
		
		//reserved
		
		loadObjects();
		
	}
	
	//@BeforeClass
		//public void beforeClass(){
		//we can use it for startTest(), but  test case name, descriptions are changes for every test case
			//So its good to declare it in class level
			//paste it in test case(class)
		//	startTest(testName, description);
			
		//}
	
	
	@BeforeMethod
	
      public void beforeMethod(){
		
		startTest(testCaseName, testCaseDescription);
		
		switch(appName){
		case "facebook":
			invokeApp(browserName, "http://www.facebook.com");
			break;
		case "irctc":
			invokeApp(browserName, "http://www.irctc.co.in");
			break;
		case "default":
			System.out.println("Please specify correct application");
			break;
		
		}
		
	}
	
	@AfterMethod
	
    public void afterMethod(){
		closeAllBrowsers();
		
	}
	
	@AfterClass
	
     public void afterClass(){
		endTest();
		
	}
	
	@AfterTest
	
   public void afterTest(){
		//reserved
		
	unloadObjects();
		
	}
	
	@AfterSuite
    public void afterSuite(){
		endReport();
		
	}
	

}
