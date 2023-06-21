package com.nit.comps;

public final class JavaMaterial implements CourseMaterial {

	public JavaMaterial() {
		System.out.println("JavaMaterial:: 0-param constructor");
	}

	@Override
	public String year(int year) {
		return "Year of joining" + year;
	}

	@Override
	public String toString() {
		return "Java Material ";
	}
	
}