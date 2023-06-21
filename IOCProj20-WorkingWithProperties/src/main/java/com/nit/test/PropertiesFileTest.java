package com.nit.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Employee;

public class PropertiesFileTest
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
    	
    	Employee emp=cxt.getBean("emp",Employee.class);
    	
    	System.out.println("emp data::" + emp);
    	
    	cxt.close();
    }
}
