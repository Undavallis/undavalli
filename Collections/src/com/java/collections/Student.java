package com.java.collections;

public class Student {
  private int rollnu;
  private String name;
  private double age;
public int getRollnu() {
	return rollnu;
}
public void setRollnu(int rollnu) {
	this.rollnu = rollnu;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [rollnu=" + rollnu + ", name=" + name + ", age=" + age
			+ "]";
}

 
 
}
