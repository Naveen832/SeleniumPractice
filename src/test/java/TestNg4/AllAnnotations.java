package TestNg4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	void bs() {
		System.out.println("thsi is before suite.....");
	}
	@AfterSuite
	void as() {
		System.out.println("this is after suite....");
	}
	@BeforeTest
	void bt() {
		System.out.println("thsi is before Test.....");
	}
	@AfterTest
	void at() {
		System.out.println("this is after Test....");
	}
	@BeforeClass
	void bc() {
		System.out.println("thsi is before Class.....");
	}
	@AfterClass
	void ac() {
		System.out.println("this is after Class....");
	}
	@BeforeMethod
	void bM() {
		System.out.println("thsi is before Method.....");
	}
	@AfterMethod
	void aM() {
		System.out.println("this is after Method....");
	}
	
	@Test(priority=1)
	void test1() {
		System.out.println("this is test method 1");
	}
	
	@Test(priority=2)
	void test2() {
		System.out.println("this is test method 2");
	}

}
