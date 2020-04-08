package com.vikas.springcore.bean;

public class Employee {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDetails() {
		return "Employee [id=" + this.id + ", name=" + this.name + "]";
	}
	
	

}
