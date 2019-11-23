package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
create table bookings(
ticket_id varchar(100)  primary key,
no_of_passengers varchar(50),
time_of_journey varchar(50),
date_of_journey varchar(50),
bus_id varchar(100) references bus(bus_id),
p_id int references passenger(p_id)
)*/


@Entity
public class Bookings {
      
	@Id
	private int ticket_id;
	private String no_of_passengers;
	private String time_of_journey;
	private String date_of_journey;
	private String bus_id;
	private int p_id;
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getNo_of_passengers() {
		return no_of_passengers;
	}
	public void setNo_of_passengers(String no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}
	public String getTime_of_journey() {
		return time_of_journey;
	}
	public void setTime_of_journey(String time_of_journey) {
		this.time_of_journey = time_of_journey;
	}
	public String getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(String date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public String getBus_id() {
		return bus_id;
	}
	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public Bookings() {
		super();
	}
	
	
	
}
