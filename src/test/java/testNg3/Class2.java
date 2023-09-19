package testNg3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	void xyz() {
		System.out.println("This is from class2");
	}
	@AfterTest
	void n() {
		System.out.println("this is from after Test ");
	}

}
