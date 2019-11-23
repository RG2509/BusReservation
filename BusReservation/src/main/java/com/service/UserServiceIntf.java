package com.service;

import java.util.Date;
import java.util.List;

import com.model.Bookings;
import com.model.Bus;
import com.model.Users;

public interface UserServiceIntf {
            
	
public boolean registerPassenger(Users user) ;

	/* public boolean deleteTicket(String ticket_id,String p_id); */

	public Users validateUser(Users user);

	public List<Bus> busBooking(String source, String destination,String date_of_journey, String no_of_passengers);

}
