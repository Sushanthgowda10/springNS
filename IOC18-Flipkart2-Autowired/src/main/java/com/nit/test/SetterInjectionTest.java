package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
			//create IOC Container
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cnfgs/applicationContext.xml");
			
			//get Target Spring bean class object
			Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
			
			//invoke b.method
			String msg=fpkt.shopping(new String[] {"shirt","jeans","tie"},new double[] {1000,500,200});
			System.out.println(msg);

	}// main
}// class
