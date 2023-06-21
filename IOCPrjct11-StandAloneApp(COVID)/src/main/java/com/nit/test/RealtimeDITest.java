package com.nit.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.MainController;
import com.nit.vo.PatientVO;

public class RealtimeDITest 
{
    public static void main( String[] args )
    {
    	System.out.println("ClientApp.main()- method Starts");
    	
    	//read inputs from end user as String Values
    	Scanner sc=new Scanner(System.in);
    	String name=null,addrs=null,pdchrg=null,days=null;
    	//double tamt=0.0;
    	if(sc!=null) {
    		System.out.println("Enter Patient name::");
    		name=sc.next();
    		System.out.println("Enter Patient Address::");
    		addrs=sc.next();
    		System.out.println("Enter No of days::");
    		days=sc.next();
    		System.out.println("Enter Per day charge::");
    		pdchrg=sc.next();
    	}
    	//prepare VO class object having inputs
    	PatientVO vo=new PatientVO();
    	vo.setPname(name);
    	vo.setPadd(addrs);
    	vo.setPdchrg(pdchrg);
    	vo.setDays(days);
    	
    	//Create IOC Container\
    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
    	
    	//get controller class object
    	MainController controller=factory.getBean("controller",MainController.class);
    	try{
    		//invoke the b.methods
    		String resultMsg=controller.processPatient(vo);
    		System.out.println(resultMsg);
    	}
    	catch(Exception e) {
    		System.err.println("Problem in Patient registration:: "+e.getMessage());
    		e.printStackTrace();
    	}
    	
    }
}
