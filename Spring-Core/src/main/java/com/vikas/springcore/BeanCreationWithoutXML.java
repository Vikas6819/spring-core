package com.vikas.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vikas.springcore.bean.Student;
import com.vikas.springcore.bean.config.StudentConfig;

public class BeanCreationWithoutXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s1=(Student)appContext.getBean("student",Student.class);
		System.out.println("Student Details :: -> "+s1.getStudentDetails());

	}

}
