package com.nt.test;

import com.nt.Comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) {
		// Use Factory to create Employee type object(Generic Missing)
		Person emp = PersonFactory.getPerson("emp");
		System.out.println(emp);

		System.out.println("***************************************************");

		Person stud = PersonFactory.getPerson("stud");
		System.out.println(stud);
	}
}