package TestNg4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	
	@Test
	void test() {
		int a = 10;
		int b =15;
		
		
		
		Assert.assertEquals(a>b,true,"a is grther then the b");
		
		String s1 = "adsf";
		String s2 = "adsf1";
		Assert.assertNotEquals(s1, s2);
				
		
	}
}
