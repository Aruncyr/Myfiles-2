package com.test.spring;

//this is an example of ci dependent object using Address.java,Employee.java,applicationContext2.xml.
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestApp2 {
	public static void main(String[] args) {
		ClassPathResource r = new ClassPathResource("applicationContext2.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee s = (Employee) factory.getBean("e");
		s.show();
	}
}
