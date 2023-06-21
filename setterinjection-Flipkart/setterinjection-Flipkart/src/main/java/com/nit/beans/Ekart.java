package com.nit.beans;

public class Ekart implements Courier {
	private String name1;

	public void setName1(String name1) {
		this.name1 = name1;
	}

	@Override
	public String toString() {
		return name1 ;
	}
	
	

}
