package com.epam.training.task_3;

public class Hexagon extends Fig {
	public double a = 1;
	public final Fig he;

	public Hexagon(double a) {
		this.he = new Triangle(a);
		this.a = a;
	}

	@Override
	public double getArea() {
		return he.getArea() * 6;
	}

}
