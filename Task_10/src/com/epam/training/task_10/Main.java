package com.epam.training.task_10;

//A natural number N is given. Write a method (methods) for forming 
//an array, whose elements are the digits of the number N.
public class Main {

	public static void main(String[] args) {

		long x = 123456;
		Scan s = new Scan();
		x = s.getLong();
		x = Math.abs(x);
		Print.pw(separate(x));
	}

	public static int[] separate(long x) {
		int i = (int) Math.log10(x);
		int[] ar = new int[i + 1];
		while (x > 0) {
			ar[i] = (int) x % 10;
			x /= 10;
			i--;
		}
		return ar;
	}

}
