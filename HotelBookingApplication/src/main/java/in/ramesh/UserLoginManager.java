package in.ramesh;

import java.util.ArrayList;

public class UserLoginManager {

	static ArrayList<String> username = new ArrayList<String>();
	static ArrayList<String> password = new ArrayList<String>();
	
	/**
	 * This method is used to register login details
	 * 
	 * @param user
	 * @param pass
	 * @return
	 */

	public static boolean loginDetails(String name,String pass) {
		
		username.add(name);
		password.add(pass);
		return true;
		
	}
	
	/**
	 * This method is used to check login
	 * 
	 * @param name
	 * @param pass
	 * @return
	 */
	
	public static boolean checkLogin(String name,String pass) {

		
		 String upperCaseChars = "(.*[A-Z].*)";
		 String lowerCaseChars = "(.*[a-z].*)";
		 String numbers = "(.*[0-9].*)";
		 String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
		 
		 
		/**
		 *  Whether password has uppercase
		 *  Whether password has Lowercase
		 *  Whether password has special character
		 *  Whether password has number 0-9
		 *  Whether password should not contain null character
		 *  Whether password should not contain only space
		 *  Whether username has greater than or equal to 6 character
		 *  Whether username should not contain only null character
		 *  Whether username should not contain only space
		 */
		
		 if(((pass.length()>=8) && (pass.length()<=15)) && (pass.matches(upperCaseChars )) && (pass.matches(lowerCaseChars )) && (pass.matches(numbers )) && (pass.matches(specialChars )) && (pass != null) && (pass != "") && (name.length()>=6) && (name != null) && (name != "")) 
		 {
			 System.out.println("Login sucessfull");
			return true;
		 }
		 System.out.println("Invalid details");
		return false;
		

	}
}