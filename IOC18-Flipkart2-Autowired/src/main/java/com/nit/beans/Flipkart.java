package com.nit.beans;

public class Flipkart {

	private int orderId;
	private Courier courier;

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public String testMethod()
	{
		System.out.println("Flipkart.testMethod()");
		return orderId+" Ready for delivery with "+ courier.toString();
	}
	

}
