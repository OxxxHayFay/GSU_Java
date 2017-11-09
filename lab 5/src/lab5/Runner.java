package lab5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Runner {

	public static void main(String[] args) {
		List<Book> bookCollection = new ArrayList<Book>();
		try {
			PrintWriter writer = new PrintWriter(new FileWriter("Output.txt", false));
			Scanner scanner = new Scanner(new FileReader("Input.txt"));
			
			while(scanner.hasNext()) {
				bookCollection.add(new Book(
					scanner.next(),
					scanner.next(),
					scanner.nextInt(),
					scanner.next(),
					scanner.nextInt()
				));
			}
		
			java.util.Collections.sort(bookCollection);
		
			for(Book book : bookCollection) {
				writer.println(book);
			}
			writer.flush();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
