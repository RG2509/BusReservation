package com.service;

import java.util.Date;
import java.util.List;

import com.model.Bookings;
import com.model.Bus;
import com.model.Passenger;
import com.model.Users;

public interface UserServiceIntf {
            
	
public boolean registerPassenger(Users user) ;

	
	public Users validateUser(Users user);

	public List<Bus> busbooking(String source, String destination,Date dt_of_booking , int no_of_passengers);
	
	


	//public List<Bookings> result(String email);


	public int addBook(Bookings bookings);
	
	
	public boolean cancelBooking(String booking_id, String email);

}
