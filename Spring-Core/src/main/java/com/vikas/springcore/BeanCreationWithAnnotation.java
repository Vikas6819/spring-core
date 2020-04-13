package com.vikas.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vikas.springcore.bean.Student;

public class BeanCreationWithAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=(Student)appContext.getBean("student");
		System.out.println("Student Details :: -> "+s1);
		
	}

}
