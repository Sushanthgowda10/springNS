package com.nit.test;

public class Test {
	private int a;
	private int b;

	public Test() {
		System.out.println("Test : 0 parameter Constructor");

	}

	// alt+shft+s,o
	public Test(int a, int b) {
		System.out.println("Test : 2 parameter Constructor");
		this.a = a;
		this.b = b;
	}

	// alt+shft+s,s
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

}
