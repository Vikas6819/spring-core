package com.vikas.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vikas.springcore.bean.Employee;

public class ApplicationContextIOCExample {

	public static void main(String[] args) {

		// FileSystemXmlApplicationContext Beans loaded through the full path.

		// ClassPathXmlApplicationContext Beans loaded through the CLASSPATH

		// XMLWebApplicationContext and AnnotationConfigWebApplicationContext beans
		// loaded through the web application context

		// AnnotationConfigApplicationContext Loading Spring beans from Annotation based configuration.

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp1 = (Employee) context.getBean("emp");
		System.out.println("Emp1 Details:: -> " + emp1.getDetails());

		// Differences between ApplicationContext And BeanFactory
		// 1) BeanFactory is parent for ApplicationContext (Both Are Interfaces)
		// 2) In case of Singletone Scope (Bean Initialization for Application context
		// is eager whereas for BeanFactory its lazy)

	}

}
