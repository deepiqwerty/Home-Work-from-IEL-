package lession02_StatementDeepi;

import java.util.Scanner;

public class For_StatementDeepi {
	public static void main(String[] args) {
	
		// For Loops = execute  some codes a CERTAIN amount of times 
		
		
		// SYNTAX: initialization; condition;  update
		// It executes as long as the condition is TRUE
		for (int i = 1;    i < 10;     i++) {
			System.out.println("Pizza");
		}
		
		// Incrementing 
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		
		//We can increment by certain number for example 2 plus // Incrementing 
				for (int i = 1; i <= 10; i+=2) {
					System.out.println(i); // 1, 3, 5, 7, 9
				}
		
		//Decrementing
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//We can decrement by certain number for example 2 minus // Decrementing 
				for (int i = 10; i > 0; i-=2) {
					System.out.println(i); // 10, 8, 6, 4, 2
				}
		

		
		
		// Basic for loop
		        for (int i = 0; i < 3; i++) {
		            System.out.println("Hello " + i);
		        }
		        
		        System.out.println("For loop in reverse");
		
		// Counting Backwards
		        for (int i = 3; i > 0; i--) {
		            System.out.println("Hello " + i);
		        }
		
		// Two variables in one for loop
		        for (int i = 0, j = 10; j >= 0 && i <= 10; j--, i++) {
		        	System.out.println("Hello i=" + i + ";j=" + j);
		        }
		        
		// Combining if + continue and break  
		// ---break terminates the loop---     
		// For example -  loop from 0 to 9; when we reach 5, stop everything       
		        
		 for (int i = 0; i < 10; i++) {
			 // In this case we want to stop when i = 5
			if (i == 6) {
				System.out.println(" You are the iteration " + i);
				System.out.println("Stop here");
				break;
			}
		     
		 		System.out.println(" You are the iteration" + i);
	}    
		        
		 //  continue allows us to skip an iteration point    
		        System.out.println("For loop with CONTINUE");
		        
		  for (int i = 0; i < 10; i++) {
			  if (i ==3) {
				  continue;
			  }
			  System.out.println("You are at iteration " + i);
		  }      
		 
		  
		  // This is another type of for loop in Java. It's called an Enhanced for loop or For-each loop.
		  //"for-each" loop through elements in Array
		  //The for-each loop is simpler and more readable than a regular for loop,
		  //since you don't need a counter (like i < array.length).
		  
		  //Here is a similar example with numbers. 
		  //We create an array of integers and use a for-each loop to print each value:
		      
		  int [] numbers = {10, 20, 30, 40};
		  
		  for (int num : numbers) { // ":" You can read this as "in" or "from" >  "numbers" 
			  System.out.println(num);
		  }
		  
		  
		  //Difference between a normal for loop and for-each
		  // NORMAL for loop
		  for (int i = 0; i < numbers.length; i++) {
			    System.out.println(numbers[i]);
			}
		  
		  // FOR - each loop
		  for (int num : numbers) {
			    System.out.println(num);
			}
		  
		// Scanner Example 
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter how many times you want to loop");
			int max = scanner.nextInt();
			
			for(int i = 0; i <= max; i++) {
				System.out.println(i);
			scanner.close();
			}
		  
	}

}
