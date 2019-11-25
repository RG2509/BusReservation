package com.dao;

import java.util.Date;
import java.util.List;

import com.model.Admin;
import com.model.Bookings;
import com.model.Bus;
import com.model.Passenger;
import com.model.Users;

public interface UserDaoIntf {
            
	
	
	 boolean registerPassenger(Users user) ;
		 

		 
		public Users validateUser(Users user);

		List<Bus>  busbooking(String source, String destination,Date dt_of_booking , int no_of_passengers);


	
		public boolean cancelBooking(String booking_id, String email);



		



		//List<Bookings> result(String email);



		int addbook(Bookings bookings);
}
