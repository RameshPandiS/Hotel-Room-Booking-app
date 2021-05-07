package in.ramesh;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCancelHotelManager {
	
	@Test
	public void testDeleteRoom1(){
			Hotel hotel=new Hotel();

			hotel.userName="Ramesh";
			hotel.noOfRooms=1;
			hotel.hotelName="skyline";
			boolean isValidHotel=UserDetails.addHotel(hotel);
			assertTrue(isValidHotel);
			UserDetails.displayHotel();
	}
	
	@Test
	public void testDeleteRoom2(){
			Hotel hotel=new Hotel();
			
			hotel.userName="rajesh";
			hotel.noOfRooms=1;
			hotel.hotelName="line";
			//UserDetails.addHotel(hotel);
			boolean isValidHotel1=UserDetails.addHotel(hotel);
			assertTrue(isValidHotel1);
		    UserDetails.displayHotel();
		    
	
	        boolean isDeleted =  UserDetails.removeHotel("line");
			assertTrue(isDeleted);
			System.out.println("removed");
			UserDetails.displayHotel();
		
	}
	

	
}
