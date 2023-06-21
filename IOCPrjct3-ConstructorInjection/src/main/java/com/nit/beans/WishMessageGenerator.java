package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {
//	Has A Property
	private Date date;

	// for constructor Injection
	public WishMessageGenerator(Date date) {
		this.date = date;
		System.out.println("WishMessageGenerator- 1 param Constructor");
	}

//business Method
	public String generateMessage(String user) {
		System.out.println(this.hashCode() + " " + date.hashCode());
		System.out.println("WishMessageGenerator.generateMessage()");

		// get current hour of the day
		int hour = date.getHours();// to get 0-23
		// generate Wish Message
		if (hour < 12)
			return "Good Morning " + user;
		else if (hour < 16)
			return "Good AfterNoon " + user;
		else if (hour < 20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}

//@Override
//public String toString() {
//	return "  "+date ;
//}

}
