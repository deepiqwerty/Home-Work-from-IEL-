package lession04_JCF;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudioArrayListDeepi {
	
	private static char[] namePersone;

	public static void main(String[] args) {
		
		//Revising Array 
		
		String [] loveBirds = new String [2];
		loveBirds [0] = "Claudio";
		loveBirds [1] = "Deepika";
		
		System.out.println(loveBirds);
		
		// ----------------------------DATA STRUCTURES-------------------------------
		/* Data structures are ways to store and organize data so you can use it efficiently.
		 * Java includes many other data structures as well, in the java.util package. 
		 * Each is used to handle data in different ways.Some of the most common are:
		 * ArrayList
		 * HashSet
		 * HashMap
		 * */
		
		// We are in the JCF = Java Collections Framework
		
		// ----------------------------ARRAY LIST-------------------------------
		//An ArrayList is a resizable array that can grow as needed.
		//It allows you to store elements and access them by index.
		
		//Hierarchically, they are part of Lists, which in turn are part of Iterable objects.
		
		//Iterable -> List -> ArrayList
		// Iterable is the Parent of List -> List is the Parent of ArrayList -> ArrayList is the child of List
		
		// Import the Array List
		// .add is a method of ArrayList, inbuilt. 
		// why () because .add is a method and method is always with parenthesis.
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Audi");
		System.out.println(cars);
		
		//  Instead of ArrayList,  IF YOU WANT NO DUPLICATES - use "HashSet"
		// HashSet<String> cars = new HashSet<String>();
		
		/* 
			Think of it this way:
			- List = General category (box).
			- ArrayList = A specific type of box.
			- LinkedList = Another specific type of box.
		*/
		
		// 1st method – Declaring ArrayList directly
		// 
		ArrayList<String>words = new ArrayList<>();
		
		// 2nd method – Declaring using List
		// We can add elements. I can do this using a method.
		List<String> name = new ArrayList<>();
		name.add("Anna");
		name.add("Laura");
		name.add("Marco");
		name.add("Dario");
		System.out.println("There are " + name.size() + " elements in the ArrayList");
		System.out.println(name); // It does not print the memory address like arrays.
		System.out.println(name.reversed());
		System.out.println(name.isEmpty()); // is question to boolean 
		
		
		
		
		// Indexes still apply,
		// get() method
		System.out.println(name.getFirst());
		System.out.println(name.get(1));
		System.out.println(" For understanding " + name.get(name.size() - 1 ));
		
		// set() method to modify a value.
		name.set(1, "Lucia");
		System.out.println(name);
		
		// They belong to the Iterable family, so I can freely use for and foreach loops.
		for (int i = 0; i < name.size(); i++) {
			System.out.println(" Ciao " + name.get(i));
		}
		
		//for each item inside the iterable, do the following // EASY TO READ
		//Iterable means something you can go through, one element at a time.
		for (String inside: name) {
			System.out.println("Ciao " + inside);
		}
				
		//"Note: This forEach is typical of Iterable. It is inherited by all the subfamilies of Iterable."
		// see the below and forget about it, use the classic one 
		name.forEach(inside -> System.out.println(inside));
		
		
		
		
		// Convert an ArrayList into an array.
		String[] namePerson = new String[name.size()];
		for(int i = 0; i <name.size(); i++) {
			namePerson[i] = name.get(i); // this is the most important line , 
			//it copies each element from the array list into the new array. 
		}
		/*Remember this table
		Data structure	How to get its size
		ArrayList		.size()
		Array			.length
		String			.length()
		*/
		System.out.println(namePerson); // Java does NOT print all the names stored inside the array.
		
		
		
		
		// ----------------------------ARRAY LIST NUMBERS-------------------------------
		// ArrayList of numbers?
		// I cannot use a primitive type inside the diamond operator <>.
		// Therefore, I use the wrapper classes of primitive types:
		// the object version of primitive types.
		/**
		 * int -> Integer
		 * double -> Double
		 * boolean -> Boolean
		 * float -> Float
		 * byte -> Byte
		 */
		
		List<Integer> number = new ArrayList<>();
		number.add(4);
		number.add(23);
		number.add(1);
		number.add(9);
		
		// Remember this direction
		/* 							Interface ( Defines the operations available) 
		 * 										|
		 * 								Implemented by		
		 * 				|											|
		 * Array List (Class)								LinkedList (Class)
		 * */
		
		// If we  want to add multiple values at the same time,
		// instead of adding them one at a time using add().
		

		
		// Collections.addAll() method to add multiple elements.
		
		List<String> fruits = new ArrayList<>();
		fruits.addAll(Arrays.asList("Mango", "Banana", "Strawberry", "Peach"));
		// or 
		Collections.addAll(fruits, "Mango", "Banana", "Strawberry", "Peach");
		System.out.println(fruits);
		
		List<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Blue");
		// above to add one by one 
		
	
		// If create an immutable list. I cannot add or remove elements.
		List<String> cityImmutable= List.of("Torino", "Milano", "Roma", "Napoli");
		// Cannot do below 
		// If we use a "List.of" it will become an immutable list.
		//cityimmutable.add("Palermo");
		//cityimmutable.remove(0);
		
		// But we can always convert it into a modifiable list.
		List<String> cityModifiable = new ArrayList<>(cityImmutable);
		cityModifiable.add("Palermo");
		System.out.println(cityModifiable);
		
		// What can I pass inside the parentheses () of an ArrayList?
		// 1. Nothing -> creates an empty list.
		// 2. Number -> creates a list with a predetermined initial capacity.
		// 3. Collection -> I pass an existing collection.
		
		List <String> region = new ArrayList<>(List.of("Piemonte", "Lombardia", "Campania", "Lazio", "Sicilia"));
		List <String> country = new ArrayList<>(Arrays.asList("Italia", "India", "Mexico"));
		
		//“We can merge the two collections.”
		region.addAll(country);
		System.out.println(region);
	}

}
