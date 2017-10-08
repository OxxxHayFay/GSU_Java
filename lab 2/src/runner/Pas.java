package runner;

public class Pas extends Dishes{
	private float volume;
	private boolean cover;
	
	public Pas() {}
	public Pas(String prod, Float price, DishesStyle style, float vol, boolean cov) {
		super(prod, price, style);
		volume = vol;
		cover = cov;
	}
	
	public float getVolume() { return volume; }
	public boolean getCover() { return cover; }
	@Override public String getName() { return "Кастрюля"; }
	@Override
	public String toString() {
		return super.toString() + "\n	Объем: " + getVolume() + "\n	Покрытие: " + getCover();
	}
}