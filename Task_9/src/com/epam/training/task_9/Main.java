package com.epam.training.task_9;

//Given the numbers X, Y, Z, T - the lengths of the sides of 
//the quadrilateral.
//Write a method (methods) for calculating its area if 
//the angle between sides of length X and Y is a straight line
public class Main {
	public static void main(String[] args) {

		double x = 10;
		double y = 10;
		double z = 7.17;
		double t = 7;
		if (area(x, y, z, t, Type.convex) > 0) {
			System.out.println("Convex  : " + area(x, y, z, t, Type.convex));
			System.out.println("Concave : " + area(x, y, z, t, Type.concave));
		} else {
			System.out.println("This quadrilateral does not exist");
		}
	}

	public static double area(double x, double y, double z, double t, Type u) {

		double s1 = 0;
		double s2 = 0;
		double hypotenuse = 0;
		double p;
		s1 = x * y / 2;
		hypotenuse = Math.sqrt(x * x + y * y);

		p = hypotenuse + z + t;
		p /= 2;
		if (p < hypotenuse)
			return -1;
		s2 = p * (p - z) * (p - t) * (p - hypotenuse);
		s2 = Math.sqrt(s2);

		return u == Type.convex ? s2 + s1 : s1 - s2;

	}
}
