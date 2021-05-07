package in.ramesh;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserRegisterManager {

	//True test case
		@Test
		public void test1() {
			String name = "nethaji";
			String pass ="Pass@123";
			String phoneNumber="8220969139";
			UserRegisterManager.loginRegisterDetails(name, pass, phoneNumber);   
			boolean isValid = UserRegisterManager.checkLoginRegister(name,pass,phoneNumber);
			assertTrue(isValid);
			
		}
		
		
		//False test case
		@Test
		public void test2() {
			String name = "Helloeo";
			String pass ="asdfASDFFG";
			String phoneNumber="";
			UserRegisterManager.loginRegisterDetails(name, pass, phoneNumber);
			boolean isValid = UserRegisterManager.checkLoginRegister(name,pass,phoneNumber);
			assertFalse(isValid);
			
		}
		
		// True Test case
		
		@Test
		public void test3() {
			String name = "sureshh";
			String pass ="Java2011*";
			String phoneNumber="6220969139";
			UserRegisterManager.loginRegisterDetails(name, pass, phoneNumber);
			boolean isValid = UserRegisterManager.checkLoginRegister(name,pass, phoneNumber);
			assertTrue(isValid);
		}
		
		// False Test case
		
		@Test
		public void test4() {
			String name = "Sr";
			String pass ="Abcd@123";
			String phoneNumber="8656789098654";
			UserRegisterManager.loginRegisterDetails(name, pass,phoneNumber);
			boolean isValid = UserRegisterManager.checkLoginRegister(name,pass,phoneNumber);
			assertFalse(isValid);
			
		}
}
