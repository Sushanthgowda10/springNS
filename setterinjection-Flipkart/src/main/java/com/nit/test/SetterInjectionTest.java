package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Flipkart;

public class SetterInjectionTest {
	public static void main(String[] args) {
		FileSystemResource res = new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(res);

		Object object = factory.getBean("wmg");
   	
		Flipkart generator = (Flipkart) object;
		System.out.println("------------------------------------");

		String message = generator.testMethod();
		System.out.println( message);
		System.out.println("------------------------------------");

	}// main
}// class
