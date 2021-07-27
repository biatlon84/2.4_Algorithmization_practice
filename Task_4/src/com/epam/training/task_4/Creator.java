package com.epam.training.task_4;

public class Creator {
	public static Dot[] array_ran(int x, float f) {
		Dot[] ar = new Dot[x];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = new Dot((Math.random() * x * f - x * f / 2), (Math.random() * x * f - x * f / 2));
		}
		return ar;
	}

}
