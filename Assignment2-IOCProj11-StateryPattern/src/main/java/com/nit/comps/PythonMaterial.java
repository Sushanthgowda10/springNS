package com.nit.comps;

public final class PythonMaterial implements CourseMaterial {

	public PythonMaterial() {
		System.out.println("PythonMaterial:: 0-param constructor");
	}

	
	@Override
	public String year(int year) {
		return "Year of joining" + year;
	}
	@Override
	public String toString() {
		return "Python Material";
	}

}
