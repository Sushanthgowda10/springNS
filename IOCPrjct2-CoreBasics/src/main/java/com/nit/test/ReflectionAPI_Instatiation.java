package com.nit.test;

import java.lang.reflect.Constructor;

public class ReflectionAPI_Instatiation {
	public static void main(String[] args) {

		try {
			//load the class at runtime
			Class c = Class.forName(args[0]);// return Class type of object

			// create object dynamically (option-1)
			Object object=c.newInstance();//uses 0-parameter constructor
			System.out.println("Obj1:: "+object.toString());
			
			System.out.println("-------------------------------------");
			
			// create object dynamically (option-2)
			Constructor[] constructors=c.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			
			System.out.println("-------------------------------------");
			
			Object obj2=constructors[0].newInstance();
			System.out.println("obj2::" +obj2.toString());
			
			Object obj3=constructors[1].newInstance(10,20);
			System.out.println("obj3::" +obj3.toString()); //sequence should be maintained
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
