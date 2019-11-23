package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.model.Admin;
import com.model.Bus;
import com.model.Route;
import com.model.Users;

@Repository("admindao")
public class AdminDaoImpl implements AdminDaoIntf {

	/*
	 * @Autowired DataSource datasource;
	 * 
	 * @Autowired JdbcTemplate jdbcTemplate;
	 */
	@PersistenceContext
	EntityManager em;

	public Admin validateAdmin(Admin admin) {

		System.out.println(admin.getEmail_id() + "  " + admin.getPassword());
		Admin a = null;
		try {
			a = (Admin) em.createQuery("SELECT a FROM Admin a WHERE a.email_id=:email_id and a.password=:password")
					.setParameter("email_id", admin.getEmail_id()).setParameter("password", admin.getPassword())
					.getSingleResult();
		} catch (Exception e) {
			System.out.println(e);
		}
		// em.close();
		System.out.println(a);

		return a;
	}

	// add bus

	public boolean addBus(Bus bus) {
		boolean flag = false;
		try {
			System.out.println(bus);
			em.persist(bus);

			// em.close();
			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;

	}

	// view bus

	

	// add route
	public boolean addRoute(Route route) {
		boolean flag = false;
		try {

			em.persist(route);

			System.out.println("end");
			flag = true;
		} catch (Exception e) {
			System.out.println("Error:" + e);
		}
		return flag;

	}

	public List<Bus> getBus() {
		
		@SuppressWarnings("unchecked") 
		List<Bus> buslist =	  em.createQuery("SELECT u FROM  Bus u").getResultList();
				  
				return  buslist; 
				 
	}
	
	  public List<Bus> showBus(String src, String dest) 
	  {
		  
	  @SuppressWarnings("unchecked")
	List<Bus> list = em.createQuery("SELECT b from Bus b , Route r where r.source=:src and r.destination=:dest and b.route.route_id=r.route_id")
	   .setParameter("src", src)
	   .setParameter("dest", dest)
	  .getResultList();
	  
	 return list;
	  
	  }
	 
	
}

