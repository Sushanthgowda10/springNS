package com.nit.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.MainController;
import com.nit.vo.CustomerVO;

public class RealtimeDITest 
{
    public static void main( String[] args )
    {
    	System.out.println("ClientApp.main()- method Starts");
    	
    	//read inputs from end user as String Values
    	Scanner sc=new Scanner(System.in);
    	String name=null,addrs=null,pamnt=null,rate=null,time=null;
    	if(sc!=null) {
    		System.out.println("Enter Customer name::");
    		name=sc.next();
    		System.out.println("Enter Customer Address::");
    		addrs=sc.next();
    		System.out.println("Enter Customer Principle Amount::");
    		pamnt=sc.next();
    		System.out.println("Enter Rate of interest::");
    		rate=sc.next();
    		System.out.println("Enter Time in months::");
    		time=sc.next();
    	}
    	//prepare VO class object having inputs
    	CustomerVO vo=new CustomerVO();
    	vo.setCname(name);
    	vo.setCadd(addrs);
    	vo.setPamnt(pamnt);
    	vo.setRate(rate);
    	vo.setTime(time);
    	
    	//Create IOC Container\
    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
    	
    	//get controller class object
    	MainController controller=factory.getBean("controller",MainController.class);
    	try{
    		//invoke the b.methods
    		String resultMsg=controller.processCustomer(vo);
    		System.out.println(resultMsg);
    	}
    	catch(Exception e) {
    		System.err.println("Problem in Customer registration:: "+e.getMessage());
    		e.printStackTrace();
    	}
    	
    }
}
