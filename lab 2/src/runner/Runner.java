package runner;

import java.util.Random;

public class Runner {
	
	private static Dishes[] dishes = new Dishes[10];

	public static void main(String[] args) {
		int count = 0;
		Random rnd = new Random();
		for(int i = 0; i < dishes.length; i++) {
			switch (count) {
			case 0:
				dishes[i] = new Dishes(getName(), rnd.nextInt(200) * rnd.nextFloat(), DishesStyle.Modern); break;
			case 1:
				dishes[i] = new Pas(getName(), rnd.nextInt(200) * rnd.nextFloat(), DishesStyle.Arabian, rnd.nextFloat(), true); break;
			case 2:
				dishes[i] = new Skovoroda(getName(), rnd.nextInt(200) * rnd.nextFloat(), DishesStyle.Arabian, rnd.nextInt(25) * rnd.nextFloat(), Coating.Emaling); break;
			case 3: 
				dishes[i] = new Plate(getName(), rnd.nextInt(200) * rnd.nextFloat(), DishesStyle.Arabian, rnd.nextInt(12) * rnd.nextFloat()); break;
			}
			count = count > 2 ? 0 : count + 1;
		}
		for(int i = 0; i < dishes.length; i++) {
			System.out.println(dishes[i]);
		}
	}
	
	private static String[] consonants = new String[] { "â", "ï", "÷", "ê", "ð", "ì", "í", "ë", "ã", "ä", "ñ"};
	private static String[] vowels = new String[] { "à", "å", "è", "î", "ó", "ý"};
	
	private static String getName() {
		Random rnd = new Random();
		String result = consonants[rnd.nextInt(consonants.length)].toUpperCase();
		for(int i = 0; i < 3; i++) {
			result = result + vowels[rnd.nextInt(vowels.length)];
			result = result + consonants[rnd.nextInt(consonants.length)];
		}
		return result;
	}
}