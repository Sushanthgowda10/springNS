package com.nt.test;

import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.factory.PersonFactory;

public class FactoryPatternSolutionTest {
	public static void main(String[] args) throws Exception {
		// Use Factory to create Employee class object
		Person emp = PersonFactory.getPerson(Employee.class);
		System.out.println(emp);

		System.out.println("***************************************************");

		Person cust = PersonFactory.getPerson(Customer.class);
		System.out.println(cust);
	}
}