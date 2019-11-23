package com.dao;

import java.util.Date;
import java.util.List;

import com.model.Admin;
import com.model.Bus;
import com.model.Users;

public interface UserDaoIntf {
            
	
	
	 boolean registerPassenger(Users user) ;
		 
	/* boolean deleteTicket(String ticket_id,String p_id); */
		 
		public Users validateUser(Users user);

		List<Bus> busBooking(String source, String destination, String date_of_journey,
				String no_of_passengers);
}
