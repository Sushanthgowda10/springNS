package com.nit.comps;

import org.springframework.stereotype.Component;

@Component("bluedart")
public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid + " -order id order is assigned to BlueDart for delivery";
	}
	
	

}
