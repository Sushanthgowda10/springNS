package com.test;

public class Test implements Runnable {

	private String name = "shree";
	private int val;

	public Test(String name, int val) {
		this.name = name;
		this.val = val;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
