package testNg3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	void abc() {
		System.out.println("this is from class1 ........");
	}
	@BeforeTest
	void m()
	{
		System.out.println("this is from beforeTest");
	}
	@BeforeSuite
	void bs() {
		System.out.println("thsi is before suite.....");
	}
	@AfterSuite
	void as() {
		System.out.println("this is after suite....");
	}
}
