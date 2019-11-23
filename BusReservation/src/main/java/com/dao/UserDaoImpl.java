package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Admin;
import com.model.Bus;
import com.model.Users;


@Repository("userdao")
public class UserDaoImpl implements UserDaoIntf {
	
	@PersistenceContext
	EntityManager em;
	
	public Users validateUser(Users user) {

		System.out.println(user.getEmail() + "  " + user.getPassword());
		Users a = null;
		try {
			a = (Users) em.createQuery("SELECT a FROM Users a WHERE a.email=:email and a.password=:password")
					.setParameter("email", user.getEmail())
					.setParameter("password", user.getPassword())
					.getSingleResult();
		} catch (Exception e) {
		System.out.println(e);
		}
		// em.close();
				System.out.println(a);

		return a;
	}
		
		public boolean registerPassenger(Users user) {

			boolean flag = false;
			try {
				 System.out.println(user);
				 em.persist(user);
				
				 System.out.println("end");
				 flag = true; 
			} catch (Exception e) {
				System.out.println("Error:" + e);
			
			}

			return flag;
		}

		

		
		public List<Bus> getBus() {
			@SuppressWarnings("unchecked")
			List<Bus> buslist = em.createQuery("SELECT u FROM  Bus u").getResultList();

			return buslist;
		}
}
