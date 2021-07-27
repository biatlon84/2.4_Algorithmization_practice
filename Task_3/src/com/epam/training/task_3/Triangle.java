package com.epam.training.task_3;

public class Triangle extends Fig {
	public double a = 1;

	public Triangle(double a) {
		this.a = a;
	}

	public double getArea() {
		return sq(3) * a * a / 4;
	}

	// I'm just practicing, normally
	// I would write a pre-calculated value.
	// Like Math.sqrt(3);.
	double sq(double y) {
		double d = 0.000000001;
		double x = y / 3, last, diff;
		// if (square <= 0)
		// return 0;
		do {
			last = x;
			x = (x + y / x) / 2;
			diff = x - last;
		} while (diff > d || diff < -d);
		return x;
	}

}
