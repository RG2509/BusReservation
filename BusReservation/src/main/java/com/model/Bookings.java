package com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
create table bookings(
booking_id varchar(100) not null primary key,
bus_id varchar(100) references bus(bus_id) ,
email varchar(100) references Users(email),
dt_of_booking date,
no_of_passengers int ,
total_fare int,
pick_loc  varchar(100),
drop_loc varchar(100)
);*/


@Entity
@Table(name="bookings")
public class Bookings {
      
	@Id
	private String booking_id ;
	
	@ManyToOne
	@JoinColumn(name="bus_id")
	private Bus bus;
	
	@ManyToOne
	@JoinColumn(name="email")
	private Users user;
	
	
	@Temporal(TemporalType.DATE)
	private Date  dt_of_booking;
	
	private int no_of_passengers;
	private int total_fare;
	private String pick_loc;
	private String drop_loc;
	
	
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	@OneToMany
	@JoinColumn(name="booking_id")
	private List<Passenger> passengers;
	
	public String getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Date getDt_of_booking() {
		return dt_of_booking;
	}
	public void setDt_of_booking(Date dt_of_booking) {
		this.dt_of_booking = dt_of_booking;
	}
	public int getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	public int getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(int total_fare) {
		this.total_fare = total_fare;
	}
	public String getPick_loc() {
		return pick_loc;
	}
	public void setPick_loc(String pick_loc) {
		this.pick_loc = pick_loc;
	}
	public String getDrop_loc() {
		return drop_loc;
	}
	public void setDrop_loc(String drop_loc) {
		this.drop_loc = drop_loc;
	}
	public Bookings() {
		super();
	}
	@Override
	public String toString() {
		return "Bookings [booking_id=" + booking_id + ", bus=" + bus + ", user=" + user + ", dt_of_booking="
				+ dt_of_booking + ", no_of_passengers=" + no_of_passengers + ", total_fare=" + total_fare
				+ ", pick_loc=" + pick_loc + ", drop_loc=" + drop_loc + "]";
	}
	
}
