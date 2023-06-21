package com.nt.factory;

import com.nt.Comp.AadharDetails;
import com.nt.Comp.Customer;
import com.nt.Comp.Employee;
import com.nt.Comp.Person;
import com.nt.Comp.Student;

//Factory Pattern
public class PersonFactory {
	// static factory method (having generic/common return type)
	public static Person getPerson(String type) {
		Person per = null;
		AadharDetails details = null;

		if (type.equalsIgnoreCase("emp")) {
			details = new AadharDetails(12345L, 20, 9765476L);
			per = new Employee("Naveen", "Bangalore", details, "HCL", 98765.0);
		} else if (type.equalsIgnoreCase("cust")) {
			details = new AadharDetails(12345L, 21, 9765476L);
			per = new Customer("Shree", "Mysore", details, 1234, 98765.0);
		} else if (type.equalsIgnoreCase("stud")) {
			details = new AadharDetails(12345L, 20, 9765476L);
			per = new Student("Gowrav", "Delhi", details, "java", 98765654);
		} else {
			throw new IllegalArgumentException("Invalid Person type");
		}
		return per;

	}
}
