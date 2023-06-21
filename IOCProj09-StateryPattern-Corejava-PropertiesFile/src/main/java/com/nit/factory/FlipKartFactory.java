package com.nit.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import javax.print.DocFlavor.INPUT_STREAM;

import com.nit.comps.BlueDart;
import com.nit.comps.Courier;
import com.nit.comps.DTDC;
import com.nit.comps.Flipkart;

public class FlipKartFactory {
	public static Properties props;
	static {
		System.out.println("FlipkartFactory.static block");
		
		try {
			//locate Properties file through stream
			InputStream is=new FileInputStream("src/main/java/com/nit/commons/info.properties");
			// Load properties file content to java.util.Properties class object
			props = new Properties();
			props.load(is);
			} catch (IOException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}// static block
	
	// static factory method
	public static Flipkart getInstance() throws Exception{
		System.out.println("FlipKartFactory.getInstance()");
		
		//get dependent class name
		String courierClassName=props.getProperty("courier.classname");
		
		//load the dependent class
		Class c=Class.forName(courierClassName);
		
		//create the object for loaded class
		Constructor<Courier>cons[]=c.getDeclaredConstructors();
		Courier courier=cons[0].newInstance();
		
		//create target class object
		Flipkart fpkt=new Flipkart();
		
		//assign dependent class object to target class object
		fpkt.setCourier(courier);
		return fpkt;
	}//method

}//class
	





//static factory method 
//public static Flipkart getInstace(String courierType) {
//	//create dependent class object
//	Courier courier=null;
//	if(courierType.equalsIgnoreCase("dtdc"))
//		courier=new DTDC();
//	else if(courierType.equalsIgnoreCase("BlueDart")) 
//		courier=new BlueDart();
//		else 
//			throw new IllegalArgumentException("Invalid Courier Type");
//
//	//create target class object
//	Flipkart fpkt=new Flipkart();
//	//assign dependent class object to target class
//	fpkt.setCourier(courier);
//	return fpkt;
//	
//	}
//}
//public int generateOrderId() {
//	Random random = new Random(); 
//	int orderID=random.nextInt(1000);
//	return orderID;
//}