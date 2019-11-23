package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDaoIntf;
import com.dao.UserDaoIntf;
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

	@Transactional
	public Users validateUser(Users user) {
		 return userdao.validateUser(user);
	}
		
}
