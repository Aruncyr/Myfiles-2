package com.test.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		//ClassPathResource resource = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  

		@SuppressWarnings("unused")
		Student student = (Student) context.getBean("studentbean");
		Employee emp = (Employee) context.getBean("empBean");
		//student.displayInfo();
		emp.show();
	}

}
