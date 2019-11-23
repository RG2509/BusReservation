package com.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDaoIntf;
import com.model.Admin;
import com.model.Bus;
import com.model.Route;
import com.model.Users;



@Service("myservice")
public class AdminServiceImpl implements AdminServiceIntf {
          
	@Autowired
	private AdminDaoIntf admindao;
	
@Transactional
	public Admin validateAdmin(Admin admin) {
		return admindao.validateAdmin(admin);
		
	}
	@Transactional
	public boolean addBus(Bus bus) {
		
		return admindao.addBus(bus);
	}
	
	
@Transactional
	public List<Bus> getBus() {
		
		
			  List<Bus>  buslist = admindao.getBus();
			  return buslist;
		  
	}
	
@Transactional
	public boolean addRoute(Route route) {
		return admindao.addRoute(route);
		
	}
	

@Transactional
public List<Bus> showBus(String src, String dest){ 
		 List<Bus> list=admindao.showBus(src,dest);
		 return list;
	 }
	
	 
	
	 
}
