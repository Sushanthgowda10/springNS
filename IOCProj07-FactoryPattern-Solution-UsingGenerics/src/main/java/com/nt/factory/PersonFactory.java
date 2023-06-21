package com.nt.factory;

import java.lang.reflect.Constructor;

import com.nt.comp.AadharDetails;
import com.nt.comp.Customer;
import com.nt.comp.Employee;
import com.nt.comp.Person;
import com.nt.comp.Student;

//Factory Pattern
public class PersonFactory {
	// static factory method (having generic/common return type)
	public static <T extends Person> T getPerson(Class<T> clazz) throws Exception {
		Constructor<?>[] cons = clazz.getDeclaredConstructors();
		Object obj = null;

		if (clazz == Employee.class) {//declared constructor from EmployeeClass
			AadharDetails details = new AadharDetails(12345L, 20, 9765476L);
			obj = cons[0].newInstance("Naveen", "Bangalore", details, "HCL", 98765.0);
		} else if (clazz == Customer.class) {
			AadharDetails details = new AadharDetails(12345L, 21, 9765476L);
			obj = new Customer("Shree", "Mysore", details, 1234, 98765.0);
		} else if (clazz == Student.class) {
			AadharDetails details = new AadharDetails(12345L, 20, 9765476L);
			obj = new Student("Gowrav", "Delhi", details, "java", 98765654);
		} else {
			throw new IllegalArgumentException("Invalid Person type");
		}
		return (T) obj;

	}
}
