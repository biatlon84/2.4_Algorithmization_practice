package com.epam.training.task_8;

//Array D. is given. Determine the following sums: D [l] + D [2] + D [3]; D [3] + D [4] + D [5]; D [4] + D [5] + D [6].
//Explanation. Create a method (s) to calculate the sum of three consecutive elements
//array with numbers from k to m.
public class Main {

	public static void main(String[] args) {
		int n = 3;
		int[] array = new int[16];
		c(array);
		Print.pw(array);
		System.out.println("\nThe sums of " + n + " consecutive elements from array:");
		sumAll(array, n);
	}

	public static int[] c(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 0x16);
		}
		return a;

	}

	public static void sumAll(int[] a, int f) {
		if (f > 0) {
			for (int i = 0; i <= a.length - f; i++) {
				System.out.printf(" %2d\n", sum(a, i, i + f));
			}
		}
	}

	public static int sum(int[] a, int first, int last) {
		int x = 0;
		if (last <= a.length) {
			for (int i = first; i < last; i++) {
				x += a[i];
				System.out.printf("%2d ", a[i]);
			}
			System.out.print(" sum = ");
		}
		return x;
	}
}
