package in.ramesh.validator;

public class AddProductValidation {

	private AddProductValidation() {

	}

	/**
	 * // String validation is performed // insertion of numbers is recidency type
	 * is checked
	 * 
	 * @param newRecidencyName
	 * @return
	 */
	public static boolean stringValidation(String newHotelName) {

		boolean isValidService = true;

		if (newHotelName.length() == 0 || newHotelName.trim().equals("")) {
			isValidService = false;
		}

		for (int index = 0; index < newHotelName.length(); index++) {
			if (newHotelName.charAt(index) >= '0' && newHotelName.charAt(index) <= '9') {
				isValidService = false;

			}
		}
		return isValidService;
	}

	
}
