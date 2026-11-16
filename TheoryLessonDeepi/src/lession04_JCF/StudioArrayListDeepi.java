package lession04_JCF;

import java.util.ArrayList;
import java.util.List;

public class StudioArrayListDeepi {
	
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
		ArrayList<String> words = new ArrayList<>();
		
		// 2nd method – Declaring using List
		// We can add elements. I can do this using a method.
		List<String> name = new ArrayList<>();
		words.add("Anna");
		words.add("Laura");
		words.add("Marco");
		words.add("Dario");

		System.out.println("There are " + words.size() + " elements in the ArrayList");
		
		System.out.println(words); // It does not print the memory address like arrays.
		System.out.println(words.reversed());
		System.out.println(words.isEmpty()); // is question to boolean 
		
		// Indexes still apply,

		// get() method
		System.out.println(words.getFirst());
		System.out.println(words.get(1));
		System.out.println(" For understanding " + words.get(words.size() - 1 ));
		
		// set() method to modify a value.
		words.set(1, "Lucia");
		System.out.println(words);
		
		
		// They belong to the Iterable family, so I can freely use for and foreach loops.
		for (int i = 0; i < words.size(); i++) {
			System.out.println(" Ciao " + words.get(i));
		}
		
		//for each item inside the iterable, do the following // EASY TO READ
		//Iterable means something you can go through, one element at a time.
		for (String inside: words) {
			System.out.println("Ciao " + inside);
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
