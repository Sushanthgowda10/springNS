package com.nt.comp;

public class Student extends Person {
	private String course;
	private int rollNo;

	public Student(String name, String addrs, AadharDetails aadhar, String course, int rollNo) {
		super(name, addrs, aadhar);
		System.out.println("Student :: 5-param Constructor");
		this.course = course;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return super.toString() + "Student [course=" + course + ", rollNo=" + rollNo + "]";
	}

}
