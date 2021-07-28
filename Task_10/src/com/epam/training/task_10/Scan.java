package com.epam.training.task_10;

import java.util.Scanner;

public class Scan {

	public Scan() {
		super();
		this.sc = new Scanner(System.in);
	}

	Scanner sc;

	public double getD() {
		System.out.print("Please type value like 54.6\n>>");
		while (!sc.hasNextDouble()) {
			System.out.print("\"" + sc.next() + "\" is not Double \n");
			System.out.print(">>");
		}
		return sc.nextDouble();
	}

	public int getI() {
		int a;
		System.out.print("Please type value like 9 \n>>");
		while (!sc.hasNextInt()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type int\n>>");
		}
		a = sc.nextInt();
		return a;
	}

	public long getLong() {
		long a;
		System.out.print("Please type value like 1234 \n>>");
		while (!sc.hasNextLong()) {
			System.out.print(" \"" + sc.next() + "\"");
			System.out.print(" it is't type long\n>>");
		}
		a = sc.nextLong();
		return a;
	}

}
