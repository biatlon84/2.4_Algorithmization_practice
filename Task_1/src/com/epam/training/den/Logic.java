package com.epam.training.den;

public class Logic {
	private long x = 0;
	private long y = 0;

	public void start() {
		int a = 60;
		int c = 0;

		x = (long) (Math.random() * a + 1);
		y = (long) (Math.random() * a + 1);

		c = (int) Euclid.get(x, y);
		System.out.println(" X=" + x + "  Y=" + y);
		System.out.println("" + c + " Max divi");
		System.out.println("" + mult(c) + " Min mult");
	}

	public long mult(int C) {
		return (x * y) / C;
	}

}
