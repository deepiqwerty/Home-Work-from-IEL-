package lession02_StatementDeepi;

import java.util.Random;

public class Maths_BooleansDeepi {
	public static void main(String[] args) {
		
//-- JAVA MATHS --//
    	
    	//  The The Math.max(x,y) method can be used to find the highest value of x and y:
    	 Math.max(5, 10); 
    	 System.out.println(Math.max(5, 10)); //10
    	 
    	// The Math.min(x,y) method can be used to find the lowest value of x and y:
    	 Math.min(5, 10);
    	 System.out.println(Math.min(5, 10)); //5
    	 
    	 //  The Math.sqrt(x) method returns the square root of x:
    	 Math.sqrt(64);
    	 System.out.println(Math.sqrt(64)); //8.0
    	 
    	 //  The Math.abs(x) method returns the absolute (positive) value of x:
    	 Math.abs(-4.7);
    	 System.out.println(Math.abs(-4.7)); // 4.7 // it will return the same value in positive , if it was positive nothing change 
    	 
    	 // The Math.pow(x, y) method returns the value of x raised to the power of y:
    	 //  Note: Math.pow(2, 8) means 2 multiplied by itself 8 times:
    	 Math.pow(2, 8); 
    	 System.out.println(Math.pow(2, 8)); // 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 = 256
    	 
    	//  Java has several methods for rounding numbers:

    	//Math.round(x) - rounds to the nearest integer
	    //Math.ceil(x) - rounds up (returns the smallest integer greater than or equal to x)
		//Math.floor(x) - rounds down (returns the largest integer less than or equal to x)
		
    	 Math.round(4.6);  // 5 // remember the ppd value from onboard 
    	 System.out.println(Math.round(4.6));
		 Math.ceil(4.1);   // 5.0 // ceiling the highest 
		 System.out.println(Math.ceil(4.1));
	     Math.floor(4.9);  // 4.0 // ceiling the lowest
	     System.out.println(Math.floor(4.9));
	     
		//Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
		Math.random();
		System.out.println(Math.random()); // 0.8761236327811145 
		System.out.println(Math.random()); // 0.8685962093069781 
		
    	//To get more control over the random number, for example,
		//if you only want a random number between 0 and 100, 
		//you can use the following formula:
		//We multiply by 101 because Math.random() only generates numbers between 0 and 1.
		//Multiplying by 101 expands that range so we can get numbers between 0 and 101 (but not including 101).
		int randomNum = (int)(Math.random() * 101);  // 0 to 100	
		System.out.println(randomNum);	// 64
		
		
		Random r = new Random(); // Claudio's preferences! //  import java.util.Random;
		int randomNumb = r.nextInt(500, 657);
		System.out.println("The random number is " + randomNumb);
		
		

        							//-- JAVA BOOLEANS --//
		//Very often in programming, you will need a data type that can only have one of two values, like:
		// YES / NO, ON / OFF, TRUE / FALSE
		//For this, Java has a boolean data type, which can store true or false values.
		//This is useful to build logic and make decisions in programs.		
				
		// We did Boolean topic in detail in lesson Operators Logic Deepi
		
		// Store the Result in a Boolean Variable
		int x = 10;
		int y = 9;
		boolean isGreater = x > y;
				System.out.println("To store the result in boolean variable " + isGreater); // Outputs true
		//Note: It is up to you whether you store the result of a comparison in a boolean variable or use the comparison directly.
		//Storing the result can make your code easier to read, especially if you want to reuse it.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
