package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("emp")
@PropertySource("classpath:com/nit/comms/info.properties")
public class Employee {
	
	//@value ("101")-directly
	@Value("${emp.id}")
	private int empno;
	@Value("${emp.name}")
	private String empName;
	@Value("${emp.addrs}")
	private String empAddrs;
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empName=" + empName + ", empAddrs=" + empAddrs + "]";
	}
	

	
}
