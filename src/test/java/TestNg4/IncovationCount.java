package TestNg4;

import org.testng.annotations.Test;

public class IncovationCount {

	
	
	@Test(invocationCount = 4)
	void run() {
		System.out.println("thisi= isnijnf");
	}
}
