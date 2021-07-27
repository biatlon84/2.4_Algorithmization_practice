package com.epam.training.den;

public class Fraction {

	public long den = 1;
	public long numerator = 1;

	public Fraction(int x, int y) {
		den = x;
		numerator = y;
	}

	@Override
	public String toString() {
		return String.format("%10d", numerator) + "/" + String.format("%10d", den);
	}
}
