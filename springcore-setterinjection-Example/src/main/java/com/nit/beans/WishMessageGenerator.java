package com.nit.beans;

public class WishMessageGenerator {

	// HAS-A Property(supporting composition or injection)
	private String name1;
	private DependentClass dc;

	// setter method supporting setter injection
	public void setName1(String name1) {
		this.name1 = name1;
	}

	public void setDc(DependentClass dc) {
		this.dc = dc;
	}

	// business methods
	public String generateName() {
		System.out.println("WishMessageGenerator.generateName()");
		return name1 + "." + dc.toString();
	}

}
