package com.raj;

public class Car {

	private String carname;
	private String model;
	private String make;
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	@Override
	public String toString() {
		return "Car [carname=" + carname + ", model=" + model + ", make="
				+ make + "]";
	}
	
	
	
}
