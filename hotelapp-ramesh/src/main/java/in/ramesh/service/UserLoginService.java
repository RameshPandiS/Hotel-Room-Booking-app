package in.ramesh.service;

import in.ramesh.validator.UserLoginValidation;

public class UserLoginService {

	public static boolean loginUser(String userName,String password) {
		boolean isValid=false;
		
			if(UserLoginValidation.checkLogin(userName, password)) {
			isValid=true;
		}
		else {
			isValid=false;
		}
		return isValid;
	}
}
