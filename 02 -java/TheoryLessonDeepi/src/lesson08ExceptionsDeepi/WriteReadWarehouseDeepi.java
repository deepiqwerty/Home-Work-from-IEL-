package lesson08ExceptionsDeepi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteReadWarehouseDeepi {

	// Assigning the file path to a constant variable, usually declared with final
	private static final String FILE = "./warehouse.txt";

	public static void main(String[] args) {
		List<ProductsDeepi> productsToLoad = new ArrayList<>();
		productsToLoad.add(new ProductsDeepi("Blue Pen", 0.2, 500));
		productsToLoad.add(new ProductsDeepi("Squared Notebook", 0.75, 500));
		productsToLoad.add(new ProductsDeepi("HB Pencil", 0.1, 2000));
		productsToLoad.add(new ProductsDeepi("Eraser", 0.3, 250));
		

		save(productsToLoad);

		productsToLoad.add(new ProductsDeepi("Test", 0, 0));
		save(productsToLoad);
	}

	static void save(List<ProductsDeepi> products) {
		BufferedWriter writeMyText;

		try {
			writeMyText = new BufferedWriter(new FileWriter(FILE, false));
			writeMyText.write("name;price;amount"); // First row of the CSV
			writeMyText.newLine();

			// Best practice: use plural for the list (products) and singular for the item
			for (ProductsDeepi item : products) {
				writeMyText.write(item.toCSV()); // Converts the product into a CSV string
				writeMyText.newLine();
				System.out.println("Loading the following product: " + item.getName());
			}

			writeMyText.close(); // Flushes the buffer and actually saves the text to the file
			System.out.println("File saved in: " + FILE);

		} catch (IOException e) {
			System.out.println("The file was not saved: " + e.getMessage());
		}
	}

	// Converts the products into CSV format and appends/adds them to the file
	// (NOTE: use true in FileWriter to append to the end of the file)
	static boolean addProducts(List<ProductsDeepi> products) {
		File myFile = new File(FILE);

		if (!myFile.exists()) {
			System.out.println("You cannot add a product to a file that doesn't exist. !!");
			return false;
		}

		return true;
	}

	static List<ProductsDeepi> readProducts() {
		List<ProductsDeepi> loadedList = new ArrayList<>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(FILE));
			String line = reader.readLine(); // Read and skip the header ("name;price;amount")

			while ((line = reader.readLine()) != null) {
				if (!line.trim().isEmpty()) { // Ignore any blank lines at the end
					ProductsDeepi product = ProductsDeepi.fromCSV(line);
					loadedList.add(product);
				}
			}

			reader.close();

		} catch (IOException e) {
			System.out.println("Error while reading the file: " + e.getMessage());
		}

		return loadedList;
	}

}