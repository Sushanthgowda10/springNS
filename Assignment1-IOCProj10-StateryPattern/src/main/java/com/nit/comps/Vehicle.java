package com.nit.comps;

public final class Vehicle {// final class rule 3
	// HAS -A Property (rule1)
	private Engine engine;// interface type reference

	public Vehicle() {
		System.out.println("Vehicle- 0-Param Constructor");
	}

	public void setEngine(Engine engine) {
		System.out.println("Vehicle.setEngine(-)");
		this.engine = engine;
	}


	public String specification(int capacity, double price) {
		System.out.println("Vehicle.specification()");
		if(capacity>1000)
			price=capacity*10;
			else
				price=price;
		return "The Engine type is -"+engine+" with the capacity of- "+capacity+"CC and the price is- RS"+price;
	}

}
