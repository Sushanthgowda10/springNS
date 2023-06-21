package com.nit.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public final class Flipkart {//final class rule 3
	//HAS -A Property (rule1)
//	@Autowired
//	@Qualifier("dhl")
	private Courier courier;//interface type reference

	public Flipkart() {
		System.out.println("Flipkart- 0-Param Constructor");
	}

	@Autowired//good practice is placing at constructor level
	@Qualifier("dtdc")
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier(-)");
		this.courier = courier;
	}

	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		// calculate bill amount
		double billAmnt = 0.0;
		
		for (double p : prices) {
			billAmnt += p;
		}
		//generate Order Id
		int oid=new Random().nextInt(1000000);

		//use courier
		String msg=courier.deliver(oid);
		return Arrays.toString(items)+"are purchased having bill amount::"+ billAmnt+"--->> "+msg;
	}

}
