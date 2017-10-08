package runner;

import java.util.Random;

public class Dishes {
	private String producer;
	private float price;
	private DishesStyle style;
	private static Random rnd = new Random();
	
	public Dishes() {}
	public Dishes(String prod, float pri) {
		producer = prod;
		price = pri;
		style = DishesStyle.Classic;
	}
	public Dishes(String prod, float pri, DishesStyle st){
		producer = prod;
		price = pri;
		style = st;
	}	
	
	public String getProducer() { return producer; }
	public float getPrice() { return price; }	
	public DishesStyle getStyle() { return style; }	
	public String getName() { return "Посуда"; }
	@Override
	public String toString() {
		return "Производитель: " + getProducer() + "\n	Тип: " + getName() + "\n	Цена: " + getPrice() + "\n	Стиль: " + getStyle();
	}
}