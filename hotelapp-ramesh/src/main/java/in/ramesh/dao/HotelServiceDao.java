package in.ramesh.dao;

import java.util.ArrayList;
import java.util.List;

public class HotelServiceDao {

	public static List<String> hotelList = new ArrayList<>();
	static {
		hotelList.add("Sky Lite");
		hotelList.add("Raddison Blu");
		hotelList.add("Blue ice");
		hotelList.add("Orbis");
		hotelList.add("Vijay Elanza");

	}

	public List<String> getHotels() {
		return hotelList;
	}

	public HotelServiceDao() {

	}

	/**
	 * // String validation is performed // insertion of numbers is recidency type
	 * is checked
	 * 
	 * @param newRecidencyName
	 * @return
	 */
	public boolean addHotels(String hotelName) {
		boolean isValid = false;
		if (hotelList.contains(hotelName)) {
			isValid = false;
		} else {
			hotelList.add(hotelName);
		}
		return isValid;
	}

	public void deleteHotel(String hotelName) {
		int index = 0;
		for (String name : hotelList) {
			if (name == hotelName) {
				index = hotelName.indexOf(name);
				break;
			}
		}
		hotelList.remove(index);
	}

}
