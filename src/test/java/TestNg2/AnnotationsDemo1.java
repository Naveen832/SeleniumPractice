package TestNg2;

import org.testng.annotations.*;

public class AnnotationsDemo1 {
	
	
	@BeforeClass
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
	@AfterClass
	void logout() {
		System.out.println("Logout...");
		
	}

}
