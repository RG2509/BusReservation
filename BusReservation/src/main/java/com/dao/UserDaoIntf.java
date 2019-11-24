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

		List<Bus>  busbooking(String source, String destination,Date dt_of_booking , int no_of_passengers);
}
