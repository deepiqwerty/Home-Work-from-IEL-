package lesson08ExceptionsDeepi;

import java.util.Scanner;

public class ProductsDeepi {
	
	private String name;
	private double price;
	private int amount;
	
	public ProductsDeepi(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	// we didnot do the "set" the method beacsue  To make the object Immutable (Read-Only)
	// Keeping only the constructor and the three get methods makes the class cleaner and safer.
	public String getName() {return name;}
	
	public double getPrice() {return price;}
	
	public int getAmount() {return amount;}
	
	// Convert the product into a CSV row.
	public String toCSV() {
		return name + ";" + price + ";" + amount;
	}

	// Reads a single line from the file and converts it back into a ProductsDeepi object
	
	public static ProductsDeepi fromCSV(String line) {
		Scanner sc = new Scanner(line);
	    sc.useDelimiter(";"); // .useDelimeter - stop reading when you find a semicolon
	    String name = sc.next();
	    double price = sc.nextDouble();
	    int amount = sc.nextInt();
	    sc.close();
	    return new ProductsDeepi(name, price, amount);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", amount=" + amount + "]";
	}
	
}
