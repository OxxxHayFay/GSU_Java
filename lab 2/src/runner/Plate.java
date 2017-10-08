package runner;

public class Plate extends Dishes{
	private float diametr;
	
	public Plate() {}
	public Plate(String prod, Float price, DishesStyle style, float diam) {
		super(prod, price, style);
		diametr = diam;
	}
	
	public float getDiametr() { return diametr; }
	@Override public String getName() { return "Тарелка"; }
	@Override
	public String toString() {
		return super.toString() + "\n	Диаметр: " + getDiametr();
	}
}