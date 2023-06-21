package com.nit.test;

import com.nit.comps.Vehicle;
import com.nit.factory.VehicleFactory;

public class StategyPatternTest {
	public static void main(String[] args) {
		//get Target class object (
		Vehicle fac=VehicleFactory.getInstace("PEngine");
		
		String resultMsg=fac.specification(2000,10000.00);
	System.out.println(resultMsg);

	}// main
}// class
