package TestNG;

import org.testng.annotations.Test;

public class TestNGSample {
	@Test(priority=2)
	void Login()
	{ 
		System.out.println("Login method"); 	
	}
	
	@Test(priority=3)
	void Search() {
		System.out.println("Search method");
		} 
	@Test(priority=4)
		void Advancedsearch() {
		System.out.println("advancedsearch method");
		} 
	@Test(priority=1)
	void Logout() {
		System.out.println("Logout method");
		}

}
