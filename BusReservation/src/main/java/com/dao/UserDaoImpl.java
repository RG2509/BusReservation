package com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;import javax.persistence.OneToMany;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.model.Admin;
import com.model.Bookings;
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

	
		
		

		public List<Bus> busBooking(String source, String destination, String date_of_journey,
				String no_of_passengers) {
			System.out.println(source+"\n"+destination+"\n"+date_of_journey+"\n"+no_of_passengers);
			String sql="select b FROM Bus b, Route r where r.source=:source and r.destination=:destination and b.route.route_id=r.route_id";
			String sql1="select sum(b.no_of_passenger) FROM Bus b, Bookings b1 where b.bus_id=b1.bus.bus_id and b.bus_id=:bid";
			List<Bus> finallist = new ArrayList<Bus>();
					
					
					
			@SuppressWarnings("unchecked")
			List<Bus> allblist = em.createQuery(sql)
			                     .setParameter("source", source)
			                     .setParameter("destination", destination)
			                     .getResultList();
			for(Bus b:allblist){
				long totalseat= b.getNo_of_seats();
				long totlreservedseat=0;
				
				List<Object> objs =em.createQuery(sql1).setParameter("bid", b.getBus_id()).getResultList();
				System.out.println("objs:"+objs);
				if(objs!=null){
					try{
						totlreservedseat=(Long)objs.get(0);
					}
					catch(Exception e){}
				}
				
				System.out.println("totalseat:"+totalseat+" \ntotlreservedseat:"+totlreservedseat);
				if ((totalseat-totlreservedseat)>=no_of_passengers)
					finallist.add(b);
					
			}
			
			return finallist;
		}
		}

		


			
			

	//cancelticket

/*
 * public boolean deleteTicket(String ticket_id, String p_id) { Bookings b =
 * null; try {
 * 
 * b = (Bookings) em.
 * createQuery("DELETE b.ticket_id,p.p_id FROM Bookings b,Passenger p WHERE b.ticket_id=:ticket_id and p.p_id=:p_id and b.p_id=p.p_id"
 * ) .setParameter("ticket_id",) .getSingleResult(); } catch (Exception e) {
 * System.out.println(e); } // em.close(); System.out.println(b);
 * 
 * return true; }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 */