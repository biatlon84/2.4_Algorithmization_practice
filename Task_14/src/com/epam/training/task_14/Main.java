package com.epam.training.task_14;

//A natural number with n digits is called Armstrong's number 
//if the sum of its digits is
//raised to the power n is equal to the number itself. 
//Find all Armstrong numbers from 1 to k. To solve the problem
//use decomposition.
public class Main {

	public static void main(String[] args) {
		long k = 2401;
		Scan s = new Scan();
		// k = s.getLong();
		k = Math.abs(k);
		Print.pw(arm(k));
	}

	public static int sum(long x) {
		int sum = 0;
		while (x != 0) {
			sum += (x % 10);
			x /= 10;
		}
		return sum;
	}

	public static long[] arm(long x) {
		long i = 0;
		long[] ar = new long[12];
		int jj = 0;
		i = 0;
		while (x >= i) {
			if (i == (Math.pow(sum(i), getAofN(i)))) {
				ar[jj] = i;
				jj++;
			}
			i++;
		}
		return ar;
	}

	public static int getAofN(long x) {
		return (int) Math.log10(x) + 1;
	}

}
