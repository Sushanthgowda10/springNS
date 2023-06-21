package com.nit.comps;

public final class Student {// final class rule 3
	// HAS -A Property (rule1)
	private CourseMaterial courseMaterial;// interface type reference

	public Student() {
		System.out.println("Student- 0-Param Constructor");
	}

	public void setCourseMaterial(CourseMaterial courseMaterial) {
		System.out.println("Student.setCourseMaterial()");
		this.courseMaterial = courseMaterial;
	}


	public String details() {
		System.out.println("Student.details()");
		
		return "The Course type is -"+courseMaterial;
	}

}
