package com.epam.training.task_4;

//On the plane, n points are given by their coordinates. Write a method (methods) that determine between which of the pairs of points
//the longest distance. Indication. Enter the coordinates of the points into the array.
public class Main {

	public static void main(String[] args) {
		double dist = 0;
		Dot[] ar = Creator.array_ran(40, 7);
		System.out.print("There are dots ");
		for (Dot d : ar) {
			System.out.print("\nX = " + d.getX() + " Y = " + d.getY());
		}
		dist = Comparator.compArray(ar);
		System.out.print("\nMaximum distance is:\n" + dist);
	}

}
