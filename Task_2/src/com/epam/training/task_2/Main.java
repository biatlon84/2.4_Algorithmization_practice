package com.epam.training.task_2;

//Write a method (s) for finding the greatest common divisor of four natural numbers.
public class Main {

	public static void main(String[] args) {
		int a = 45;
		int b = 9;
		int c = 81;
		int d = 84;

		int x = gFactor(a, b, c, d);

		System.out.println("The greatest common factor = " + x);
	}

	public static int gFactor(int a, int b, int c, int d) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if ((c != -1) && (d != -1))
			return gFactor(c, b + a, -1, d);
		if ((c == -1) && (d != -1))
			return gFactor(d, b + a, -1, -1);
		return a + b;
	}
}
