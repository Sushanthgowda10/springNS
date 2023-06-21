package com.nit.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.WishMessageGenerator;

public class SetterInjectionTest 
{
    public static void main( String[] args )
    {
    	//To hold name and location of spring beans cfg file in resource object
    	FileSystemResource res=new FileSystemResource("src/main/java/com/nit/cfgs/applicationContext.xml");
    	
    	//Create BeanFactory spring Container(IOC Container)
    	XmlBeanFactory factory=new XmlBeanFactory(res);
    	
    	//Getting target Spring bean class object injected with dependent spring bean class object
    	Object object=factory.getBean("wmg");
//    	
//    	//typecasting or downcasting
    	WishMessageGenerator generator=(WishMessageGenerator)object;
    	System.out.println("------------------------------------");
//    	
//    	//invoke business methods
    	String message=generator.generateMessage(" Naveen");
    	System.out.println("Hiii - "+ message);
    	System.out.println("------------------------------------");
    	
    	//Using Generics*************************************************
//    	WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
//    	System.out.println("------------------------------------");
//    	
//    	//invoke business methods
//    	String message=generator.generateMessage(" Naveen");
//    	System.out.println("Hiii - "+ message);
//    	System.out.println("------------------------------------");
    	
    	//####################################################################
    	//CREATE IOC CONTAINER(BEAN FACTORY CONTAINER)
//    	DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//    	XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//    	reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");//
//    	WishMessageGenerator generator=factory.getBean("wmg",WishMessageGenerator.class);
//    	System.out.println("------------------------------------");
//    	
//    	//invoke business methods
//    	String message=generator.generateMessage(" Naveen");
//    	System.out.println("Hiii - "+ message);
//    	System.out.println("------------------------------------");
    }//main
}//class
