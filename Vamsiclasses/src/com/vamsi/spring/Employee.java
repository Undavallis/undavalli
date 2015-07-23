package com.vamsi.spring;

public class Employee {
private String firstname;
private String lastname;
private String title;
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
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
@Override
public String toString() {
	return "Employee [firstname=" + firstname + ", lastname=" + lastname
			+ ", title=" + title + "]";
}

	
}
