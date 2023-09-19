package TestListenors;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListenors implements ITestListener {
	
	
	
 public void onTestStart(ITestResult result) {
	 System.out.println("on test is stared");
	 
 }
public void onTestSuccess(ITestResult result) {
	System.out.println("on test is success");
 }
public void onTestFailure(ITestResult result) {
	System.out.println("on test is failure");
}
public void onTestSkipped(ITestResult result) {
	System.out.println("on test is skipped");
}
public void onTestfinish(ITestContext context) {
	System.out.println("on test is finidh");
}
}
