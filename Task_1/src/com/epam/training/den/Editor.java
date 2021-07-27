package com.epam.training.den;

public class Editor {
	public static void divideAll(Array arrayFractions, long minC) {
		long x;
		Fraction f;
		for (int i = 0; i < arrayFractions.size(); i++) {
			f = arrayFractions.getByIndex(i);
			x = minC / f.den;
			f.numerator = f.numerator * x;
			f.den = minC;
			arrayFractions.setDr(f, i);
		}
		/*
		 * public static void comDenominator(int[] arr, int[] arr2, int nok) { for (int
		 * i = 0; i < arr.length; i++) { arr[i] = (nok / arr2[i]) * arr[i]; arr2[i] =
		 * nok; } }
		 */

	}
}
