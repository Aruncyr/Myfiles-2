package com.test.spring;

//this is an example of ci with collections using Questions2.java,applicationContext4.xml.
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestApp4 {

	public static void main(String[] args) {
		ClassPathResource r = new ClassPathResource("applicationContext4.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Questions2 q = (Questions2) factory.getBean("q");
		q.displayInfo();
	}

}
