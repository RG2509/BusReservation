package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

/*create table passenger(
p_id int  primary key, 
p_name varchar(100),
p_mobileno varchar(15),
gender varchar(10));*/

@Entity

public class Passenger {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)     
	private int p_id;
          private String p_name;
          private String mobile_no;
          private String gender;
          @ManyToOne
          @JoinColumn(name="booking_id")
          private Bookings bookings;
          
          
	/*
	 * @OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	 * 
	 * @JoinColumn(name="p_id") private Bookings booking;
	 */
      	
		
		public int getP_id() {
			return p_id;
		}
		public void setP_id(int p_id) {
			this.p_id = p_id;
		}
		public String getP_name() {
			return p_name;
		}
		public void setP_name(String p_name) {
			this.p_name = p_name;
		}
		public String getMobile_no() {
			return mobile_no;
		}
		public void setMobile_no(String mobile_no) {
			this.mobile_no = mobile_no;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Passenger() {
			super();
		}
		public Bookings getBookings() {
			return bookings;
		}
		public void setBookings(Bookings bookings) {
			this.bookings = bookings;
		}
          
          
	
	
	
}
