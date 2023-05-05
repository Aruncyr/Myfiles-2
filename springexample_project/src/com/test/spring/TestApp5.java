package com.test.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestApp5 {
	public static void main(String[] args) {

		ClassPathResource r = new ClassPathResource("applicationContext5.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Question3 q = (Question3) factory.getBean("q");
		q.displayInfo();

	}
}
