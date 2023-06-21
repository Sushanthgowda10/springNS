package com.nit.beans;

public class DependentClass {
	private String name;


	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name ;
	}
	
	
}
