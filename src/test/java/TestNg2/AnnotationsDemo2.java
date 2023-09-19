package TestNg2;

import org.testng.annotations.*;

public class AnnotationsDemo2 {
	
	
	@BeforeMethod
	void login() {
		System.out.println("login....");
	}
	@Test(priority=1)
	void search() {
		System.out.println("seraching");
	}
	@Test(priority=2)
	void advancesearch() {
		System.out.println("Advance Searching");
		
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout...");
		
	}

}
