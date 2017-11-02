package lab4;

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
		catch (FileNotFoundException e) {
			list = SetList();
		}
		catch (SecurityException e) {
			list = SetList();
		}
		catch (ClassNotFoundException e) {
			list = SetList();
		}
		catch (IOException e) {
			list = SetList();
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
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (SecurityException e) {
			System.out.println("Security error");
		}
		catch (IOException e) {
			System.out.println("IO error");
		}
	}
	
	static List<Cylinder> SetList() {
		List<Cylinder> list = new ArrayList<Cylinder>();
		System.out.println("���� ������ ��� 3 ����� ���������");
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 3; i ++) {
			System.out.print("	���� ������� ��� " + (i + 1) + " ��������: ");
			double r = s.nextDouble();
			System.out.print("	���� ������ ��� " + (i + 1) + " ��������: ");
			double h = s.nextDouble();
			list.add(new Cylinder(h, r));
		}
		return list;
	}
}