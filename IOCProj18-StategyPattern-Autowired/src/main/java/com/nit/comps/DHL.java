package com.nit.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
		
		@Override
		public String deliver(int oid) {
			return oid+" order id order is assigned to DHL for delivery";
		}

}
