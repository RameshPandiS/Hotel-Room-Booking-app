package in.ramesh.validator;

public class UserLoginValidation {
	
	public static boolean checkLogin(String userName,String password) {

		
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
		 
		 if(((password.length()>=8) && (password.length()<=15)) && (password.matches(upperCaseChars )) && (password.matches(lowerCaseChars )) && (password.matches(numbers )) && (password.matches(specialChars )) && (password != null) && (password != "") && (userName.length()>=6) && (userName != null) && (userName != "")) 
		 {
			 System.out.println("Login sucessfull");
			return true;
		 }
		 System.out.println("Invalid details");
		return false;

}
}
