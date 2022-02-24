package com.ust3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("NewBeans.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Employee e = (Employee)b.getBean("empbean");
		e.display_name();
	}

}
