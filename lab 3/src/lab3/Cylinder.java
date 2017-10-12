package lab3;

import java.io.Serializable;

public class Cylinder implements Serializable {
	private double height;
	private double radius;
	
	private static double pi = 3.1415f;
	
	public Cylinder(double h, double r) {
		height = h;
		radius = r;
	}
	
	private double getArea() {
		return 2 * pi * radius * (radius + height);
	}
	
	@Override
	public String toString() {
		return "	Высота: " + height + "\n	Радиус: " + radius + "\n	Area: " + getArea();
	}
}
