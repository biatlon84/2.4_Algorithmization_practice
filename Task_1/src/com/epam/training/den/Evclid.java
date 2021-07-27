package com.epam.training.den;

public class Evclid {
	public static long get(long a, long b) {
		long bu = 0;
		long x = a < b ? a : b;
		long y = a < b ? b : a;
		boolean w = true;
		try {
			while (w) {
				bu = y % x;
				if (bu != 0) {
					y = x;
					x = bu;
				} else {
					w = false;
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("zero");
		}
		return x;
	}

	public static long getDen(Array ar) {
		if (ar.size() < 2)
			return 0;
		long a = ar.getByIndex(1).den;
		long b = 1;
		for (int i = 0; i < ar.size(); i++) {
			b = ar.getByIndex(i).den;
			while ((a != 0) && (b != 0)) {
				if (a > b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}
			a = a + b;
		}
		return a;
	}
}
