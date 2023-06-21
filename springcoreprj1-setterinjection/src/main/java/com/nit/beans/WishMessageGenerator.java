package com.nit.beans;

import java.util.Date;

public class WishMessageGenerator {

	// HAS-A Property(supporting composition or injection)
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator - 0 parm constructor");
	}

	// setter method supporting setter injection
	public void setDate(Date date) {
		this.date = date;
	}

	// business methods
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		// get current hour of the day
		int hour = date.getHours();// gives 0-23
		// generate Wish message
		if (hour < 12)
			return "Good Morning" + user;
		else if (hour < 16)
			return "Good AfterNoon" + user;
		else if (hour < 20)
			return "Good Evening" + user;
		else
			return "Good Night" + user;
	}

}
