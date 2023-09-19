package TestNg4;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1,groups = {"sanity","regression"})
	void loginemail() {
		System.out.println("this is login email");
	}
	@Test(priority=2,groups = {"sanity"})
	void loginfacebook() {
		System.out.println("this is login facebook");
	}
	@Test(priority=3,groups = {"sanity"})
	void logintwitter() {
		System.out.println("this is login twitter");
	}
	@Test(priority=4,groups = {"sanity","regression"})
	void signbyemail() {
		System.out.println("this is sign email");
	}
	@Test(priority=5,groups = {"regression"})
	void signbyfacebook() {
		System.out.println("this is sign facebook");
	}
	@Test(priority=6,groups = {"regression"})
	void signbytwitter() {
		System.out.println("this is sign twitter");
	}
	@Test(priority=7,groups = {"sanity","regression"})
	void paymentbydoller() {
		System.out.println("this is payment by doller");
	}
	@Test(priority=8,groups = {"sanity"})
	void paymentbyrupee() {
		System.out.println("this is payment by rupeee");
	}
	@Test(priority=9,groups = {"regression"})
	void paymentbyreturn() {
		System.out.println("this is payment by return bank");
	}
	

}
