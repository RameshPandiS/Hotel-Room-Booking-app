package in.ramesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddHotelManager {

	//true
	@Test
	public void test1() {
		Hotel hotel=new Hotel();
		
		hotel.userName="Ramesh";
		hotel.noOfRooms=1;
		hotel.hotelName="skyline";
		boolean isValidHotel=UserDetails.addHotel(hotel);
		assertTrue(isValidHotel);
		UserDetails.displayHotel();

	}
	
	//false
	@Test
	public void test2() {
		
		Hotel hotel=new Hotel();
		
		hotel.userName="rajesh";
		hotel.noOfRooms=1;
		hotel.hotelName="line";
		boolean isValidHotel=UserDetails.addHotel(hotel);
		assertTrue(isValidHotel);
		UserDetails.displayHotel();

	}

}
