package com.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*create table admin(
email_id varchar(100) not null,
password varchar(100)not null
)*/


@Entity
@Table(name="admin")
public class Admin {

	@Id
	private String email_id;
	private String password;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin() {
		super();
	}
	@Override
	public String toString() {
		return "AdminLogin [email_id=" + email_id + ", password=" + password + "]";
	}
	
	
	
	
}
