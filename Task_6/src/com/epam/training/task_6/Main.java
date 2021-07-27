package com.epam.training.task_6;

//Write a method (s) that checks whether the given three numbers are coprime.
public class Main {
	public static void main(String[] args) {

		int a = 9;
		int b = 3;
		int c = 27;
		System.out.println("" + a + " " + b + " " + c);
		if (1 == gFactor(a, b, c, c)) {
			System.out.print("This numbers are coprime");
		} else {
			System.out.print("This numbers are not coprime. Factor = " + gFactor(a, b, c, c));
		}

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
