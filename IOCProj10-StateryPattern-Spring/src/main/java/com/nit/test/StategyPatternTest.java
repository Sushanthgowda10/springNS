package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.comps.Flipkart;

public class StategyPatternTest {
	public static void main(String[] args) {
		// Create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/configs/applicationContext.xml");

		// get target Spring bean class object
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		// invoke methods
		String msg=fpkt.shopping(new String[] { "flowers", "cake", "lights", "sweets" },
				new Double[] { 500.00, 1000.00, 200.00, 800.00 });
		
		System.out.println(msg);

	}// main
}// class
