package Lession01_IntroDeepi;

public class OperatorsDeepi {
	public static void main(String[] args) {
		
		//-- Operators
		//Operators are used to perform operations on variables and values.
		//In the example below, we use the + operator to add together two values:
		int a = 100 + 50;
		
		// Although the + operator is often used to add together two values, like in the example above,
		// it can also be used to add together a variable and a value, or a variable and another variable:
		
		int sum1 = 100 + 50; // 150 (150 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 ( 400 + 400)
		
		//java divides the operates into following groups 
		
		// **1.ARITHEMETIC OPERATORS**
		
		// For example 
        /* 
		Operator	Name	         Description	                           Example	
		+	        Addition	     Adds together two values	               x + y	
		-	        Subtraction	     Subtracts one value from another	       x - y	
		*	        Multiplication	 Multiplies two values	                   x * y	
		/	        Division	     Divides one value by another	           x / y	
		%	        Modulus	         Returns the division remainder	           x % y	
		++	        Increment	     Increases the value of a variable by 1	   ++x	
		--	        Decrement	     Decreases the value of a variable by 1	   --x	
		*/
		
		// see below examples for all: 
		
		int b = 10;
		int c = 3;
		
		System.out.println(b + c);
		System.out.println(b - c);
		System.out.println(b * c);
		System.out.println(b / c);
		System.out.println(b % c);
		
		// Note: When dividing two integers in Java, the result will also be an integer. 
				//For example, 10 / 3 gives 3. If you want a decimal result, use double values, like 10.0 / 3.
				
				int d = 10;
				int e = 3;
				System.out.println(d/e);// But if you need decimal result use DOUBLE 
				
				double f = 10.0d;
				double g = 3.0d;
				System.out.println(f/g);
		
		// Incrementing and Decrementing
		//Incrementing and decrementing are very common in programming,
	    //especially when working with counters, loops, and arrays which we will learn later.
		//The ++ operator increases a value by 1, while the -- operator decreases a value by 1
		
		int h = 5;
		++h; // 5 + 1 = 6
		System.out.println(h);
		--h; // 6- 1 = 5    //Sometimes, you might both increment and decrement the same variable. 
		                   //Remember that if you increase a value and later decrease it, it will go up by one and then back down by one - ending up where it started:
		System.out.println(h);
			
		    // Another example of Incrementing and Decrementing 
		int peopleInroom = 0;
		// 3 people entered  the room 
		peopleInroom++;
		peopleInroom++;
		peopleInroom++;
		System.out.println(peopleInroom); // 3
		
		//1 person leaves the room 
		peopleInroom--;
		System.out.println(peopleInroom); // 2
		
		
		
		// **2.ASSIGNMENT OPERATORS**
		//Assignment operators are used to assign values to variables.
		// In the example below, we use the assignment operator (=) to assign the value 10 to a variable called i :
		int i = 10;
	
		// There is also an another one called 
		//The addition assignment operator (+=) adds a value to a variable
		
		
		i += 5;  //BASICALLY A SHORTCUT// so what happens here when we input += 
		         //this means whatever is inside the variable i add 5, it doesnt replace the value 10 just adds plus 5.
				// if we just write i = 5, it will replace the value from 10 to 5. 
				// List of other assignment operators 
		/*
		 *           Operator	Example	     Same As	 
                     =	        x = 5	     x = 5	
                    +=	        x +=3	     x = x + 3	
					-=	        x -= 3	     x = x - 3	
					*=			x *= 3		 x = x * 3	
					/=          x /= 3		 x = x / 3
		 */
		
		//Most assignment operators are just shorter ways of writing code. 
		//For example, x += 5 is the same as x = x + 5, but shorter and often easier to read
		
		// another example for assignment operators 
		int savings = 100;
		savings += 50;
			System.out.println("Total savings is " + savings);
			
			
			
		// **3.COMPARISON OPERATORS**
		/*Comparison operators are used to compare two values (or variables). 
		  This is important in programming, because it helps us to find answers and make decisions.
		  The return value of a comparison is either true or false. 
		  These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.
		*/
		//In the below example, we use the greater than operator (>) to find out if 5 is greater than 3:
		
		int j = 5;
		int k = 3;
		System.out.println(j > k);// returns true, because 5 is higher than 3
		
		// List of other comparison operators 
		//      Operator   Name	                     Example	
		/*      ==	       Equal to	                 j == k	
				!=	       Not equal	             j != k	
				>	       Greater than	             j > k
				<	       Less than	             j < k	
				>=	       Greater than or equal to	 j >= k	
				<=	       Less than or equal to	 j <= k
		*/	
		
		System.out.println("Is j equal to k ?" + (j == k));
		System.out.println("Is j not equal to k ?" + (j != k));
		System.out.println("Is j Greater than k ?" + (j > k));
		System.out.println("Is j Less than k ?" + ( j < k));
		System.out.println("Is j Greater than or equal to	k ?" + (j >= k	));
		System.out.println("Is j Less than or equal to k ?" + (j <= k));
		
		// another example for comparison operators 
		//Comparison operators are often used in real-world conditions, such as checking if a person is old enough to vote:
		int age = 17;
		int votingAge = 18;
		
		System.out.println("Old enough to vote "  + (age >= votingAge));
		System.out.println("Old enough to vote "  + (votingAge < age));
		
		// I CAN STORE THE RESULT OF THE COMPARISON INSIDE A VARIABLE CALLED boolean to use it later.
		
		boolean votingAgeResult = (votingAge < age);
		System.out.println("Old enough to vote" + votingAgeResult); 
		
		// another example just with boolean creation
		System.out.println("Claudio has 5 Euros, can he buy a coffee of 4 Euros? ");
		
		int claudioMoney = 5;
		int coffeePrice = 4;
		
		boolean canBuycoffee = (claudioMoney > coffeePrice);
		System.out.println(canBuycoffee);
		
		
	}

}

