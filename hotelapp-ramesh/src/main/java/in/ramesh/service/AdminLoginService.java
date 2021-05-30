package in.ramesh.service;

public class AdminLoginService {

	public static boolean adminLogin(String userName, String password) {
		boolean isValid=false;
		if("admin".equals(userName)&&"pass@123".equals(password)) {
			isValid=true;
		}
		else {
			isValid=false;
		}
		return isValid;
	}
}
