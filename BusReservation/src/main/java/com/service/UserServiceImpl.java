package com.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDaoIntf;
import com.dao.UserDaoIntf;
import com.model.Bus;
import com.model.Users;

@Service("userservice")
public class UserServiceImpl implements UserServiceIntf {
	@Autowired
	private UserDaoIntf userdao;
	

	@Transactional
	public boolean registerPassenger(Users user) {
		boolean flag=userdao.registerPassenger(user);	
		return flag;
	}
;
	@Transactional
	public Users validateUser(Users user) {
		 return userdao.validateUser(user);
	}


	
	
	/*
	 * @Transactional public boolean deleteTicket(String ticket_id, String p_id) {
	 * boolean flag=userdao.deleteTicket(ticket_id, p_id); return flag; }
	 */
	  
	 	 @Transactional
		public List<Bus> busbooking(String source, String destination, Date dt_of_booking, int no_of_passengers) {
			List<Bus> list=userdao.busbooking(source,destination,dt_of_booking,no_of_passengers);
			return list;
			
		}
	
}
