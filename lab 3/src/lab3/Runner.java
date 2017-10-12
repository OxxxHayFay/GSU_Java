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
			System.out.println("���� ������ ��� 3 ����� ���������");
			Scanner s = new Scanner(System.in);
			for(int i = 0; i < 3; i ++) {
				System.out.print("	���� ������� ��� " + (i + 1) + " ��������: ");
				double r = s.nextDouble();
				System.out.print("	���� ������ ��� " + (i + 1) + " ��������: ");
				double h = s.nextDouble();
				list.add(new Cylinder(h, r));
			}
		}
		System.out.println("����� ���� � ���������");
		for(int i = 0; i < list.size() ; i++){
			System.out.println("������� " + (i + 1) + "\n" + list.get(i));
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