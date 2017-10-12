package lab3;

import java.io.*;
import java.util.*;

public class Runner {

	public static void main(String[] args) {
		List<Cylinder> list;
		try {
			FileInputStream inStream = new FileInputStream("File.txt");
			ObjectInputStream ois = new ObjectInputStream(inStream);
			list = (List<Cylinder>)ois.readObject();
		}
		catch (Exception e) {
			list = new ArrayList<Cylinder>();
			System.out.println("Ввод данных для 3 новых цилиндров");
			Scanner s = new Scanner(System.in);
			for(int i = 0; i < 3; i ++) {
				System.out.print("	Ввод радиуса для " + (i + 1) + " цилиндра: ");
				double r = s.nextDouble();
				System.out.print("	Ввод высоты для " + (i + 1) + " цилиндра: ");
				double h = s.nextDouble();
				list.add(new Cylinder(h, r));
			}
		}
		System.out.println("Вывод инфо о цилиндрах");
		for(int i = 0; i < list.size() ; i++){
			System.out.println("Цилиндр " + (i + 1) + "\n" + list.get(i));
		}
		try {
			FileOutputStream os = new FileOutputStream("File.txt");
			ObjectOutputStream ous = new ObjectOutputStream(os);
			ous.writeObject(list);
			ous.close();
		}
		catch (Exception e) { }
	}
}