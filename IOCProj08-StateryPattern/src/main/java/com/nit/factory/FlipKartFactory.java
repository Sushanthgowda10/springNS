package com.nit.factory;

import com.nit.comps.BlueDart;
import com.nit.comps.Courier;
import com.nit.comps.DTDC;
import com.nit.comps.Flipkart;

public class FlipKartFactory {
	//static factory method 
	public static Flipkart getInstace(String courierType) {
		//create dependent class object
		Courier courier=null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier=new DTDC();
		else if(courierType.equalsIgnoreCase("BlueDart")) 
			courier=new BlueDart();
			else 
				throw new IllegalArgumentException("Invalid Courier Type");
	
		//create target class object
		Flipkart fpkt=new Flipkart();
		//assign dependent class object to target class
		fpkt.setCourier(courier);
		return fpkt;
		
		}
	}


//public int generateOrderId() {
//	Random random = new Random(); 
//	int orderID=random.nextInt(1000);
//	return orderID;
//}