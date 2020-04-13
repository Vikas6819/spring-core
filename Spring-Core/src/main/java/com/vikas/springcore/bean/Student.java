package com.vikas.springcore.bean;

import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	private int studRollNo;
	private String name;
	
	
	public int getStudRollNo() {
		return studRollNo;
	}
	public void setStudRollNo(int studRollNo) {
		this.studRollNo = studRollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStudentDetails() {
		return "Student [studRollNo=" + this.studRollNo + ", name=" + this.name + "]";
	}
	
	

}
