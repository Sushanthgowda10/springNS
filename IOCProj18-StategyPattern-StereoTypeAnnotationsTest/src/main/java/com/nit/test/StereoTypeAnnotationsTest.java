package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.comps.Flipkart;

public class StereoTypeAnnotationsTest {
	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/cnfgs/applicationContext.xml");
		
		//get Target Spring bean class object
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		
		//invoke b.method
		String msg=fpkt.shopping(new String[] {"shirt","jeans","tie"},new double[] {1000,500,200});
		System.out.println(msg);
		
		
	}// main
}// class
