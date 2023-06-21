package com.nit.comps;

public class DotNetMaterial implements CourseMaterial{
	public DotNetMaterial() {
		System.out.println("DotNetMaterial:: 0-param constructor");
	}

	@Override
	public String year(int year) {
		return "Year of joining" + year;
	}

	@Override
	public String toString() {
		return "DotNet Material";
	}
	
	

}
