
package com.epam.training.task_15;

//Find all natural n-digit numbers whose digits
//form a strictly increasing
//sequence (e.g. 1234, 5789). To solve the problem,
//use decomposition.
public class Main {

	public static void main(String[] args) {

		int i = 5;
		System.out.print("All natural " + i + "-digit numbers whose digits\nform a strictly increasing sequence, ");
		Print.pw(howManyPr(i));
	}

	public static boolean chek(long x) {
		int last = 11;
		while (x != 0) {
			if (last <= (x % 10)) {
				return false;
			}
			last = (int) x % 10;
			x /= 10;
		}
		return true;
	}

	public static long[] increasing(int x, int h) {
		int t = 0;
		long i = 0;
		long[] a = new long[h];
		i = (long) Math.pow(10, x - 1);
		while (t < h) {
			if (chek(i)) {
				a[t] = i;
				t++;
			}
			i++;
		}
		return a;
	}

	public static long factorial(int x) {
		long m = 1;
		for (int i = 2; i <= x; i++)
			m *= i;
		return m;
	}

	public static long[] howManyPr(int x) {
		long q = 0;
		q = factorial(9) / (factorial(9 - x) * factorial(x));
		System.out.print("their number is " + q + " here they are:");
		return increasing(x, (int) q);
	}

}
