
package com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Admin;
import com.model.Bookings;
import com.model.Bus;
import com.model.Passenger;
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
					.setParameter("email", user.getEmail()).setParameter("password", user.getPassword())
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

	public List<Bus> busbooking(String source, String destination, Date dt_of_booking, int no_of_passengers) {
		System.out.println(source + "\n" + destination + "\n" + dt_of_booking + "\n" + no_of_passengers);
		String sql = "select b FROM Bus b, Route r where r.source=:source and r.destination=:destination and b.route.route_id=r.route_id";
		//changes
		String sql1 = "select sum(k.no_of_passengers) FROM Bus b, Bookings k where b.bus_id=k.bus.bus_id and b.bus_id=:bid and k.dt_of_booking=:dt_of_booking and k.status='confirmed'";
		List<Bus> finallist = new ArrayList<Bus>();

		@SuppressWarnings("unchecked")
		List<Bus> allflist = em.createQuery(sql).setParameter("source", source).setParameter("destination", destination)
				.getResultList();
		for (Bus b : allflist) {
			long totalseat = b.getNo_of_seats();
			long totlreservedseat = 0;

			@SuppressWarnings("unchecked")
			List<Object> objs = em.createQuery(sql1).setParameter("bid", b.getBus_id())
					.setParameter("dt_of_booking", dt_of_booking).getResultList();
			System.out.println("objs:" + objs);
			if (objs != null) {
				try {
					totlreservedseat = (Long) objs.get(0);
				} catch (Exception e) {
				}
			}
			
			System.out.println("totalseat12:" + totalseat + " \ntotlreservedseat:" + totlreservedseat
					+ "\nno_of_passengers:" + no_of_passengers + "\n-------\n");
			if ((totalseat - totlreservedseat) >= no_of_passengers)

				finallist.add(b);

		}

		return finallist;
	}

	

	public int addbook(Bookings bookings){
		

	    
    	System.out.println(bookings);
    	System.out.println("ID:"+bookings.getBus().getBus_id());

	em.persist(bookings);
	
	System.out.println("end");


   
    return 0;
	
}

	public boolean cancelBooking(String booking_id, String email) {
		boolean flag=false;
	
		Query query = em.createNativeQuery("update bookings set status='cancel'"
				+"where booking_id=:booking_id and email=:email and dt_of_booking>:curdate");//
		query.setParameter("booking_id", booking_id);
		query.setParameter("email", email);
		query.setParameter("curdate",new Date());//
		int res=query.executeUpdate();
		
		System.out.println(res);
		if(res>0){
			flag=true;
		}
		
		return flag;
	}

	public Bookings makePayment(Bookings bookings) {
		Bookings nbooking =null;
	    try {
	    String bid = bookings.getBooking_id();
	    
	    System.out.println(bookings);
		
		em.persist(bookings);
		nbooking = em.find(Bookings.class, bid);
		
		System.out.println("end");

	    }
	    catch(Exception e) { System.out.println("Error:"+e);  }
	    return nbooking;
	}
	
	}

	


