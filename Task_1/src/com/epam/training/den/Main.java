package com.epam.training.den;

//Write a method (s) for finding the greatest common divisor and least common multiple of two
//natural numbers: LCM (A, B) = A * B / GCD (A, B);
public class Main {
	public static void main(String args[]) {
		long factor, multiple;
		long x = 9;
		long y = 96;

		// ---------------
		multiple = x * y;
		factor = Euclid.get(x, y);
		multiple /= factor;
		System.out.println("Least common multiple : " + multiple + "\nGreatest common factor : " + factor);
	}
}