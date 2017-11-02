package lab4;

import java.io.Serializable;

public class Cylinder implements Serializable {
	private double height;
	private double radius;
	
	private static double pi = 3.1415f;
	
	public Cylinder(double h, double r) {
		height = h;
		radius = r;
	}
	
	private double getArea() throws VegetableException {
		double result = 2 * pi * radius * (radius + height);
		if(result < 0) throw new VegetableException("Площадь не может быть отрицательной");
		return result;
	}
	
	@Override
	public String toString() {
		try {
			return "	Высота: " + height + "\n	Радиус: " + radius + "\n	Area: " + getArea();
		}
		catch (VegetableException e) {
			return e.toString();
		}
	}
}