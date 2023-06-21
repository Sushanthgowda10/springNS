package com.nit.factory;

import com.nit.comps.DEngine;
import com.nit.comps.EEngine;
import com.nit.comps.Engine;
import com.nit.comps.PEngine;
import com.nit.comps.Vehicle;

public class VehicleFactory {
	//static factory method 
	public static Vehicle getInstace(String engineType) {
		//create dependent class object
		Engine engine=null;
		if(engineType.equalsIgnoreCase("DEngine"))
			engine=new DEngine();
		else if(engineType.equalsIgnoreCase("PEngine")) 
			engine=new PEngine();
		else if(engineType.equalsIgnoreCase("EEngine")) 
			engine=new EEngine();
			else 
				throw new IllegalArgumentException("Invalid Engine Type");
	
		//create target class object
		Vehicle fpkt=new Vehicle();
		//assign dependent class object to target class
		fpkt.setEngine(engine);
		return fpkt;
		
		}
	}


//public int generateOrderId() {
//	Random random = new Random(); 
//	int orderID=random.nextInt(1000);
//	return orderID;
//}