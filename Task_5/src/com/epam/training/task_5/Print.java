package com.epam.training.task_5;

public class Print {
	public static void pw(int[] arra) {
		System.out.print("\n");
		for (int i = 0; i < arra.length; i++) {
			System.out.printf("%2d", arra[i]);
			System.out.print(" ");
		}
	}

	public static void doubl(double[] arra) {
		System.out.print("\n");
		for (int i = 0; i < arra.length; i++) {
			System.out.printf("%2.2f", arra[i]);
			System.out.print(" ");
		}
		System.out.print("\n");
	}
}