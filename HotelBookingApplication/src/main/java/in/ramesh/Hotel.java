package in.ramesh;

import java.time.LocalDateTime;

public class Hotel {
	
	public String userName;
	
	public Long phoneNo;
	
	public Integer noOfRooms;
	
	public LocalDateTime dateOfBooking;
	
	public String hotelName;
	

	@Override
	public String toString() {
		return "Hotel [userName=" + userName + ", phoneNo=" + phoneNo + ", noOfRooms=" + noOfRooms + ", dateOfBooking="
				+ dateOfBooking + ", hotelName=" + hotelName + "]";
	}
	
	
}
