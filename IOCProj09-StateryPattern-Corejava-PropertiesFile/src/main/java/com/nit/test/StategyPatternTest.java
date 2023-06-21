package com.nit.test;

import com.nit.comps.Flipkart;
import com.nit.factory.FlipKartFactory;

public class StategyPatternTest {
	public static void main(String[] args) {
		// get Target class object (
		Flipkart fac;
		try {
			fac = FlipKartFactory.getInstance();

			String resultMsg = fac.shopping(new String[] { "candles", "flowers", "cake", "wine" },
					new double[] { 1000.0, 2000.0, 3000.0, 4000.0 });
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main
}// class
