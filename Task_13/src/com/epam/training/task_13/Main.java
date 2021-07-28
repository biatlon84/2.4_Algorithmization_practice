package com.epam.training.task_13;

//Two primes are called "twins" if they differ 
//from each other by 2 (for example, 41 and 43).
//Find and print all pairs of "twins" from 
//the segment [n, 2n], where n is a given natural number greater than 2.
//To solve the problem, use decomposition.
public class Main {

	public static void main(String[] args) {
		int n = 9;
		System.out.println("Number-twins :");
		twins(n, 2);
	}

	public static void twins(int f, int gap) {
		if (f > 2) {
			for (int i = f; i <= f * 2 - gap; i++) {
				prinTwins(i, gap);
				System.out.print("\n");
			}
		}
	}

	public static void prinTwins(int first, int gap) {
		System.out.printf("%2d %2d", first, first + gap);
	}
}
