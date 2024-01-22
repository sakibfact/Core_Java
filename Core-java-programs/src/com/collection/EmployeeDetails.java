package com.collection;

import java.io.Serializable;

public class EmployeeDetails implements Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String id;
 private String username;
 private String city;
 private String country;
 public EmployeeDetails(String id, String username, String city, String country, String mobNumber) {
	super();
	this.id = id;
	this.username = username;
	this.city = city;
	this.country = country;
	this.mobNumber = mobNumber;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
private String mobNumber;
public EmployeeDetails(String id, String username, String city, String mobNumber) {
	super();
	this.id = id;
	this.username = username;
	this.city = city;
	this.mobNumber = mobNumber;
}
public String getMobNumber() {
	return mobNumber;
}
public void setMobNumber(String mobNumber) {
	this.mobNumber = mobNumber;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public EmployeeDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmployeeDetails [id=" + id + ", username=" + username + ", city=" + city + ", country=" + country
			+ ", mobNumber=" + mobNumber + "]";
}

}
