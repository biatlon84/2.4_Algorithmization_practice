package com.epam.training.task_16;

//Write a program that determines the sum of n - digit numbers 
//containing only odd digits.
//Also determine how many even digits are in the found amount. 
//To solve the problem, use decomposition.
public class Main {
	public static void main(String[] args) {
		int n = 7;
		long s = sumOdd(n);
		System.out.println("The sum of " + n + " - digit numbers \n" + "containing only odd digits =\n" + s);
		System.out.println("The found sum has " + checkEven(s) + " even digits");
	}

	public static int checkEven(long x) {
		int even = 0;
		while (x != 0) {
			if (0 == (x % 2)) {
				even++;
			}
			x /= 10;
		}
		return even;
	}

	public static long sumOdd(int n) {
		long sum = 0;
		long i = (int) Math.pow(10, n - 1);
		while (Math.pow(10, n) > i) {
			if (checkEven(i) == 0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}
}
