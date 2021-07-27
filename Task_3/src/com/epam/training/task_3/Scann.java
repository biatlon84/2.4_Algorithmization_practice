package com.epam.training.task_3;

import java.util.Scanner;

public class Scann {

	public double s(double maxValue, int u) {

		double a = 0;
		boolean w = true;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (w) {
			w = false;
			while (!sc.hasNextDouble()) {

				System.out.print(sc.next() + "is't Double\n");
			}
			a = sc.nextDouble();
			if ((a >= maxValue || a < 0) || (a == u)) {
				System.out.print("wrong volue\n");
				if (a == u)
					System.out.print("equal\n");
				w = true;
			}

		}
		return a;
	}

}