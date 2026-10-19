package intro;

import java.util.Scanner;

public class LuxuryShopDeepi {
		
	public static void main(String[] args) {
		System.out.println("Welcome to our luxury shop!");
		System.out.println("Explore our Watches and Perfumes");
		
		
		//Comment: Display the price of a Rolex Watch 
		
		/**
		 * Rolex has more than 160 years of history. 
		 * 
		 */
		
		System.out.println("Rolex: $8500");
		
		// String is a type of variable 
		//String means I will give you a text to write for example if i say brand that means Rolex 
		// Int is a type of variable which contains full number without a coma 
		String brand = "Rolex";
		String category = "Watches";
		int quantity = 5;
		int price = 8500;
		
		// now we print the string as it is and for for spacing we use " " 
		System.out.println("The brand is " + "Rolex " + "watches " + "$8500");
		// now we print the string adding the variables 
		System.out.println("Before the item is " + brand + " " + category + " " + price );
		
		
		//now we reassign the variables with a new value 
		brand = "Cartier";
		category = "Jewellery";
		quantity = 3;
		price = 2500;
		
		System.out.println("After the item is " + brand + " " + category + " " + price );
				
		//Scanner is a type of variable used to get data from the user 
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		// next is only going to take the first word beacuse the space separtes the two words 
		String username = myScan.next();
		
		System.out.println("Hello" + " " + username + " " + "How old are you?");
		
		//reads an integer entered by the user only numbers not even with a coma or dot
	    int	age = myScan.nextInt();
	    
	    System.out.println("The customer is" + " " + age + " " + "years old");
	    
	    //new example 
	    
	    System.out.println("How many Rolex watches did you sell");
	    
	    int number = myScan.nextInt();
	    
	    System.out.println("You sold "  + number + " Rolex watches");
	    

		
		
	}
	
}
	


