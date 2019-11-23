package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/*create table bus
(
bus_id varchar(100)not null primary key,
bus_name varchar(100),
bus_no varchar(100) ,
bus_type varchar(100),
no_of_seats int ,
fare int ,
departure_time varchar(100),
arrival_time varchar(100),
route_id varchar(20) references route(route_id)
)
)*/


@Entity
public class Bus {
	
	@Id
	private String bus_id;
	private String bus_name;
	private String bus_no;
	private String bus_type;
	private int no_of_seats;
	private int fare;
	private String departure_time;
	private String arrival_time;
	
	
	@ManyToOne
	@JoinColumn(name="route_id")
	private Route route;

	public String getBus_id() {
		return bus_id;
	}

	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public String getBus_no() {
		return bus_no;
	}

	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public String getDeparture_time() {
		return departure_time;
	}

	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	/*
	 * @Override public String toString() { return "Bus [bus_id=" + bus_id +
	 * ", bus_name=" + bus_name + ", bus_no=" + bus_no + ", bus_type=" + bus_type +
	 * ", no_of_seats=" + no_of_seats + ", fare=" + fare + ", departure_time=" +
	 * departure_time + ", arrival_time=" + arrival_time + ", route=" + route + "]";
	 * }
	 */
	

	

	
	
	
	
	

}
