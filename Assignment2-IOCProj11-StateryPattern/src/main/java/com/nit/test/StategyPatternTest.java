package com.nit.test;

import com.nit.comps.Student;
import com.nit.factory.StudentIntrest;

public class StategyPatternTest {
	public static void main(String[] args) {
		// get Target class object (
		Student std = StudentIntrest.getInstace("JavaMaterial");

		String resultMsg = std.details();
		System.out.println(resultMsg);

	}// main
}// class
