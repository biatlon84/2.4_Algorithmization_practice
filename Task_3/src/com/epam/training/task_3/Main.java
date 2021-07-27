package com.epam.training.task_3;

//Calculate the area of a regular hexagon with side a using the area calculation method
//triangle. 
public class Main {

	public static void main(String[] args) {
		double a = 5;
		Scann s = new Scann();
		System.out.print("Type length of side \"A\"");
		a = s.s(Double.MAX_VALUE, 0);
		Hexagon h = new Hexagon(a);
		System.out.print("The area of a regular hexagon is :\n" + h.getArea());
	}
}
