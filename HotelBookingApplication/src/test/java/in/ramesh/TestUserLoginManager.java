package in.ramesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUserLoginManager {

	//True test case
	@Test
	public void test1() {
		String name = "nethaji";
		String pass ="Pass@123";
		UserLoginManager.loginDetails(name, pass);   
		boolean isValid = UserLoginManager.checkLogin(name,pass);
		assertTrue(isValid);
		
	}
	
	
	//False test case
	@Test
	public void test2() {
		String name = "Helloeo";
		String pass ="asdfASDFFG";
		UserLoginManager.loginDetails(name, pass);
		boolean isValid = UserLoginManager.checkLogin(name,pass);
		assertFalse(isValid);
		
	}
	
	// True Test case
	
	@Test
	public void test3() {
		String name = "sureshh";
		String pass ="Java2011*";
		UserLoginManager.loginDetails(name, pass);
		boolean isValid = UserLoginManager.checkLogin(name,pass);
		assertTrue(isValid);
	}
	
	// False Test case
	
	@Test
	public void test4() {
		String name = "Sr";
		String pass ="Abcd@123";
		UserLoginManager.loginDetails(name, pass);
		boolean isValid = UserLoginManager.checkLogin(name,pass);
		assertFalse(isValid);
		
	}
	
}
