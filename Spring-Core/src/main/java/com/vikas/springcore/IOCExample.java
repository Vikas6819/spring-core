package com.vikas.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikas.springcore.bean.Employee;

public class IOCExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Test");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp.getDetails());
	}

}
