package com.dao;

import java.util.List;

import com.model.Admin;
import com.model.Bus;
import com.model.Route;
import com.model.Users;


public interface AdminDaoIntf {

	Admin validateAdmin(Admin admin);
	
	boolean addBus(Bus bus);

	
	boolean addRoute(Route route);

	List<Bus> getBus();
	
	public List<Bus> showBus (String src, String dest); 
}
