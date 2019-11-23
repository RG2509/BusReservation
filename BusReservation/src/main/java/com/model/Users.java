package com.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;


/*create table Users(
fullname varchar(100) not null,
mobile varchar(100),
email varchar(100) not null primary key,
password varchar (100) not null
)*/


@Entity
@Table(name="Users")
public class Users {
	
	

    private String fullname;
    private String mobile;
    public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Id
    private String email;
    private String password;

	public Users() {
		super();
	}



	@Override
	public String toString() {
		return "Users [fullname=" + fullname + ", mobile=" + mobile + ", email=" + email + ", password=" + password
				+ "]";
	}

	
	
	
	
	
	
	
	
	
}
