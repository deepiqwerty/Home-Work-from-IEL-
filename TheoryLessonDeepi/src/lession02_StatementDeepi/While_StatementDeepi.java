package lession02_StatementDeepi;

import java.util.Scanner;

public class While_StatementDeepi {
	
	public static void main(String[] args) {
		
		// while loop = repeat some code forever
		//				while some conditions remains true
		
		/*Scanner scanner = new Scanner (System.in);
		
		String name = ""
				+ "";
		
		while(name.isEmpty()) { // .isEmpty IS A METHOD WHICH CHECK IN STRING IF THERE IS ANYTHING INSIDE IT 
							// In this situation syso will be hello, but is not correct because it is not printing the name
							// before used " if" and later used "while" to see the difference 	
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		scanner.close();*/
		
		// INFINITE LOOP
		// With our while loop, if we have a condition that we cannot change from within the loop,
		//thats called an infinite loop 
		// For example 
		
		/*while (1==1) {
			System.out.println(" HELP! I AM STUCK IN A LOOP ");
		}
		int x =0;
		while (1==1) {
			System.out.println(x++);
		} // ------------THIS TWO EXAMPLES ARE JUST FRO FUN !!
		
		// Another example- Lets pretend we are playing a game
		 Scanner scanner = new Scanner(System.in);
		 
		 String response = "";
		 while(!response.equals("Q")) {
			 System.out.println("You are playing a game");
			 System.out.print("Press Q to quit:");
			 
			 response = scanner.next().toUpperCase();
			 
		 }
		 
		 System.out.println("You have quit the game ");
		 
		 scanner.close();
		
		
		// Another example- Lets ask user a age 
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 int age =0;
		 System.out.println("Enter your age :");
		 
		 age = scanner.nextInt();
		 
		 while (age < 0) { // From the beginning, if in type in something that's valid, we dont enter the while loop at all
			 			   // in this program we only enter the while loop, if we type in user input thats not valid.
			 			// There is a variation in while loop called - " do while loop"
			 System.out.println(" Your age cant be negative");
			 System.out.println("Enter your age :");
			 age = scanner.nextInt();
			 
		 } 
		 
		 System.out.println("You are " + age + "years old");
		
		 scanner.close(); */
		
		// DO WHILE LOOP
		   
		 Scanner scanner = new Scanner(System.in);
		 
		 int number = 0;
		 
		 do{
			 System.out.print(" Enter a number between 1 - 10 : ");
			 number = scanner.nextInt();
			 
		 } while (number < 1 || number > 10);
		 
		 System.out.println(" You picked " + number);
		 
		 scanner.close();
		
		
		
		
		
		
		
		
		
	}

}
