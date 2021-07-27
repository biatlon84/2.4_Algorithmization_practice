package com.epam.training.task_7;

//Write a method (s) for calculating the sum of the factorials of all odd numbers from 1 to 9.
public class Main {

	public static void main(String[] args) {
		long sum = 0;
		int x = 9;
		// Scan inp = new Scan();
		// x = inp.getI();
		sum = fun(x);
		System.out.printf("The sum of the factorials of all odd numbers from 1 to 9\n %d", sum);
	}

	public static long f(int y) {
		long x = 1;
		for (int i = 1; i <= y; i++) {
			x *= i;
		}
		return x;
	}

	public static long fun(int y) {
		long sum = 0;
		for (int i = 1; i <= y; i++) {
			if ((i % 2) == 1)
				sum += f(i);
		}
		return sum;
	}
}
