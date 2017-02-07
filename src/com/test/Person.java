package com.test;


public class Person {
  private String firstname;
  private String lastname;
  public Person(String fname, String lname) {
	  this.firstname=fname;
	  this.lastname=lname;
	// TODO Auto-generated constructor stub
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public PhoneNumber getPhone() {
	return phone;
}
public void setPhone(PhoneNumber phone) {
	this.phone = phone;
}
public PhoneNumber getFax() {
	return fax;
}
public void setFax(PhoneNumber fax) {
	this.fax = fax;
}
private PhoneNumber phone;
  private PhoneNumber fax;
  // ... constructors and methods
}
