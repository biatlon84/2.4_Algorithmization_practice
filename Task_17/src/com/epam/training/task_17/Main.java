package com.epam.training.task_17;

//The sum of its digits was subtracted from the given number. 
//The sum of its digits was again subtracted from the result, etc.
//How many actions does it take to get 0? Use decomposition
public class Main {

	public static void main(String[] args) {

		long i = 365;
		System.out.print("There were " + subtracting(i) + " steps.");
	}

	private static long subtracting(long b) {
		long j = 0;
		while (b > 0) {
			b -= sum(b);
			j++;
		}
		return j;
	}

	public static int sum(long x) {
		int sum = 0;
		while (x != 0) {
			sum += (x % 10);
			x /= 10;
		}
		return sum;
	}
}
