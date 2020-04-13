package com.vikas.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vikas.springcore.bean.Employee;

public class BeanFactoryIocExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory beanfactory=new XmlBeanFactory(resource);
		  
		  Employee emp2=(Employee)beanfactory.getBean("emp");
		  System.out.println("Emp2 Details:: -> "+emp2.getDetails());
		

	}

}
