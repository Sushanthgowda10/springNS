package com.nt.test;

import com.nt.Comp.AadharDetails;
import com.nt.Comp.Employee;
import com.nt.Comp.Student;

public class FactoryPatternProblem {
	public static void main(String[] args) {
		AadharDetails obj = new AadharDetails(965908986, 20, 987654787);//dependent class object
		//System.out.println(obj);
		Employee emp = new Employee("shree", "mysore", obj, "softtek", 87875);
		System.out.println(emp);
		
		System.out.println("***************************************************");

		
		AadharDetails obj1 = new AadharDetails(965902365, 22, 9999999L);//dependent class object
		Student st = new Student("shree", "mysore", obj1, "java", 111);
		System.out.println(st);
	}
}
