package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/*create table route(
create table route(
route_id varchar(20) not null primary key,
source varchar(100) ,
destination varchar(100) ,
distance varchar(100) )
*/

@Entity
public class Route {
	
	@Id
	private String route_id;
	private String source;
	private String destination;
	private String distance;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="route_id")
	private List<Bus> bus=new ArrayList<Bus>();
	
	
	
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}
	
	
	public String getRoute_id() {
		return route_id;
	}
	public void setRoute_id(String route_id) {
		this.route_id = route_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public Route() {
		super();
	}
	/*
	 * @Override public String toString() { return "Route [route_id=" + route_id +
	 * ", source=" + source + ", destination=" + destination + ", distance=" +
	 * distance + ", bus=" + bus + "]"; }
	 */


	
}
