package com.epam.training.den;

public class Multiplier {
	public static long getM(Array array) {
		long mx = 1;
		for (int i = 0; i < array.size(); i++) {
			mx *= array.getByIndex(i).den;
		}
		return mx;
	}
}
