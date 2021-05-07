package in.ramesh;

import java.util.ArrayList;

public class UserDetails {
	
	static ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	
	
	/**
	 * 
	 * @param hotel
	 * @return
	 */
	public static boolean addHotel(Hotel hotel) {
		
		boolean isValid=false;

		if(hotel.userName != null && hotel.userName != "" && hotel.noOfRooms != 0 && hotel.noOfRooms<=1 && hotel.hotelName != null && hotel.hotelName != "") {
			isValid=true;
			hotelList.add(hotel);
		}
		return isValid;
	}
	
	
	public static void displayHotel(){
		
		for (Hotel hotel : hotelList) {
			System.out.println("user name : " + hotel.userName +  "     Date of Booking : "  + hotel.dateOfBooking  +  "	No of Rooms : " + hotel.noOfRooms +  "		Name of the hotel : " + hotel.hotelName ) ;
			
		}

	}


	

	public static boolean removeHotel(String hotelName){
		boolean matched = false;
		int index = 0;
		for (Hotel hotel : hotelList) {
			if(hotel.hotelName.equalsIgnoreCase(hotelName)) {
				matched = true;
				break;
			}
			index++;
		}
				
		if(matched) {
			hotelList.remove(index);
		}
		return matched;
			
	}
	
	
}
