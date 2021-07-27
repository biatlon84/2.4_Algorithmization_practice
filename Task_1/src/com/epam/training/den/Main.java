package com.epam.training.den;

//Write a method (s) for finding the greatest common divisor and least common multiple of two
//natural numbers: LCM (A, B) = A * B / GCD (A, B);
public class Main {
	public static void main(String args[]) {
		long factor, multiple;
		Array arrayFractions = new Array(4);
		arrayFractions.generate(4); // Filling array of fractions
		arrayFractions.printAr();
		// ---------------
		factor = Evclid.getDen(arrayFractions);
		multiple = Multiplier.getM(arrayFractions);

		Editor.divideAll(arrayFractions, multiple / factor);

		System.out.println("Bring fractions to a common denominator");
		arrayFractions.printAr();
		QuickSort.sort(arrayFractions);
		System.out.println("Sort");
		arrayFractions.printAr();
		System.out.println("Least common multiple : " + multiple / factor + "\nGreatest common factor : " + factor);
		// System.out.println("Least common multiple : " + nok(arrayFractions) +
		// "\nGreatest common factor : " + factor);
	}
}