package in.ramesh.service;
import in.ramesh.dao.HotelServiceDao;
import in.ramesh.service.DbConnection;
import in.ramesh.validator.AddProductValidation;
public class AddHotelService {
	private AddHotelService() {

	}

	private static HotelServiceDao service = new HotelServiceDao();
	DbConnection connection=new DbConnection();
	
	public static boolean addHotels(String newHotelName) {
		boolean isValid = false;
		System.out.println("Hotel name in service class" + newHotelName);

		if (AddProductValidation.stringValidation(newHotelName)) {
			isValid = service.addHotels(newHotelName);

		}
		return isValid;
	}

}
