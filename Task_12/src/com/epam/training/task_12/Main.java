package com.epam.training.task_12;

//Natural numbers K and N are given. Write the method (methods) for forming the array A, the elements of which
//are numbers whose sum of digits is equal to K and which are not more than N.
public class Main {

	public static void main(String[] args) {

		int n = 113;
		int k = 12;
		int[] array;

		array = fill(n, k);
		if (array.length == 0) {
			System.out.print("There are no elements,\nthe sum of the digits of which\nis equal to " + k
					+ " and which are not more than " + n);
		} else {
			System.out.print("This elements have sums of the digits of which\nis equal to " + k
					+ " and which are not more than " + n + " :");
		}
		Print.pw(array);
	}

	public static int[] fill(int n, int k) {
		int y = -1;
		for (int i = 0; i < n; i++) {
			if (sum(i) == k) {
				y++;
			}
		}
		int[] array = new int[y + 1];
		int j = n;
		while (y >= 0) {
			if (sum(j) == k) {
				array[y] = j;
				y--;
			}
			j--;
		}
		return array;
	}

	public static int sum(int x) {
		int sum = 0;
		while (x != 0) {
			sum += (x % 10);
			x /= 10;
		}
		return sum;
	}
}
