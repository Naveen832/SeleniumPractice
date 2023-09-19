package TestNg4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardandSoftAssertions {

	
	@Test
	
	void hardAsserstion() {
		
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		System.out.println("kdjvsdhfhfiufh fssifhfui");System.out.println("kdjvsdhfhfiufh fssifhfui");
		
		Assert.assertEquals(1, 2);
		System.out.println();
		
	}
	
	@Test
	void softassertions() {
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		SoftAssert as = new SoftAssert();
		
		as.assertEquals(1, 2);
		
		
		System.out.println("kdjvsdhfhfiufh fssifhfui");
		as.assertAll();
		
	}
}
