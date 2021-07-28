package com.epam.training.task_11;

//Write a method (methods) that determines which of 
//the given two numbers has more digits.
public class Main {

	public static void main(String[] args) {
		long i = 7315439;
		long q = 6284545;
		System.out.println(i + "\n" + q);
		if (getAofN(q) > getAofN(i))
			System.out.println("The second number has more digits than the first");
		if (getAofN(q) < getAofN(i))
			System.out.println("The first number has more digits than the second");
		if (getAofN(q) == getAofN(i))
			System.out.println("These numbers have an equal number of digits");
	}

	public static int getAofN(long x) {
		return (int) Math.log10(x) + 1;
	}
}
