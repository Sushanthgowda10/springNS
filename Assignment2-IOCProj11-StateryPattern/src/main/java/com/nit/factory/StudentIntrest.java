package com.nit.factory;

import com.nit.comps.CourseMaterial;
import com.nit.comps.DotNetMaterial;
import com.nit.comps.JavaMaterial;
import com.nit.comps.PythonMaterial;
import com.nit.comps.Student;

public class StudentIntrest {
	//static factory method 
	public static Student getInstace(String courseType) {
		//create dependent class object
		CourseMaterial courseMaterial=null;
		if(courseType.equalsIgnoreCase("JavaMaterial"))
			courseMaterial=new JavaMaterial();
		else if(courseType.equalsIgnoreCase("DotNetMaterial")) 
			courseMaterial=new DotNetMaterial();
		else if(courseType.equalsIgnoreCase("PythonMaterial")) 
			courseMaterial=new PythonMaterial();
			else 
				throw new IllegalArgumentException("Invalid Course Type");
	
		//create target class object
		Student std=new Student();
		//assign dependent class object to target class
		std.setCourseMaterial(courseMaterial);
		return std;
		
		}
	}


//public int generateOrderId() {
//	Random random = new Random(); 
//	int orderID=random.nextInt(1000);
//	return orderID;
//}