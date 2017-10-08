package runner;

public class Skovoroda extends Dishes{
	private float handLength;
	private Coating coating;
	
	public Skovoroda() {}
	public Skovoroda(String prod, Float price, DishesStyle style, float length, Coating coat) {
		super(prod, price, style);
		handLength = length;
		coating = coat;
	}
	
	public float getHandLength() { return handLength; }
	public Coating getCoating() { return coating; }	
	@Override public String getName() { return "Сковорода"; }
	@Override
	public String toString() {
		return super.toString() + "\n	Длина ручки: " + getHandLength() + "\n	Покрытие: " + getCoating();
	}
}