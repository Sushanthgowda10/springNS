package com.nit.beans;

public class DHL implements Courier {
	private String name3;
	
	public void setName3(String name3) {
		this.name3 = name3;
	}

	@Override
	public String toString() {
		return  name3;
	}
	
	
}
