package com.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//this is an example of ci with collections using Question.java,applicationContext3.xml.
public class TestApp3 {
	public static void main(String[] args) {
		ClassPathResource r = new ClassPathResource("applicationContext3.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question q = (Question) factory.getBean("q");
		q.displayInfo();

	}
}
