package com.epam.training.task_15;

public class Print {
	public static void pw(long[] arra) {
		for (int i = 0; i < arra.length; i++) {
			if (i % 15 == 0) {
				System.out.print("\n");
			}
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