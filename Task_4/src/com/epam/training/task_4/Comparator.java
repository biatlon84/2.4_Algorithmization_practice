package com.epam.training.task_4;

public class Comparator {
	public static int dotI = 0;
	public static int dotQ = 0;

	private static double comp(Dot dot1, Dot dot2) {
		double xD = dot1.getX() - dot2.getX();
		double yD = dot1.getY() - dot2.getY();
		return (xD * xD + yD * yD);
	}

	public static double compArray(Dot[] array) {
		double dis = 0;
		double maxDis = 0;
		for (int i = 0; i < array.length; i++) {
			int ii = i + 1;
			while (ii < array.length) {
				dis = comp(array[i], array[ii]);
				if (maxDis < dis) {
					maxDis = dis;
					dotI = i;
					dotQ = ii;
				}
				ii++;
			}
		}
		return Math.sqrt(maxDis);
	}
}
