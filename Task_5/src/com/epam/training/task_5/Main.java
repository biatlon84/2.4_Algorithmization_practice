package com.epam.training.task_5;

//Write a program that finds the second largest number in
//the array A[N] (print a number,
//which is less than the maximum element of the array,
//but more than all other elements).
public class Main {
	private static double max = Double.MIN_VALUE;

	public static void main(String[] args) {
		double[] ar = new double[8];
		c(ar);
		Print.doubl(ar);
		System.out.println("Second element on value in array :" + maxS(ar));
		System.out.println("Maximum array element        :    " + max);

	}

	public static double maxS(double[] ar) {
		double s = Double.MIN_VALUE;
		max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (max < ar[i]) {
				s = max;
				max = ar[i];
			}
			if ((ar[i - 1] < max) && (s < ar[i - 1])) {
				s = ar[i - 1];
			}
		}
		if ((ar[ar.length - 1] < max) && (s < ar[ar.length - 1])) {
			s = ar[ar.length - 1];
		}
		return s;
	}

	public static void c(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (Math.random() * 26);
		}
	}

}
