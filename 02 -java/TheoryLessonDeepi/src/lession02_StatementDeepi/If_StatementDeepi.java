
package lession02_StatementDeepi;

import java.util.Random;

public class If_StatementDeepi {

    public static void main(String[] args) {
    
							//-- CONDITIONS AND IF STATEMENTS--//
		//Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.		
        //Every if statement needs a condition that results in true or false.
		//This means if statements work hand-in-hand with boolean values:
		/*Most often, conditions are created using comparison operators, like the ones below:

    		Less than: a < b
    		Less than or equal to: a <= b
    		Greater than: a > b
    		Greater than or equal to: a >= b
    		Equal to: a == b
    		Not equal to: a != b
    	*/
    	
    	
    	
    	
    	//                               ----" if "----
         /* if (condition) Java checks the if as first condition. 
         * If the condition is true, Java executes the code inside if.
         * If it is false, Java moves to the next condition.
         */ 
    	
        //Example 
        if (20>18) {
        	System.out.println("20 is greater than 18");
        }
        
        // Compare Variables
        int x = 20; 
        int y = 18;
        if (x>y) {
        	System.out.println("x is greater than y");
        }
        // this will print "if' because 20 is greater than 18. 
        //to print "if" conditions must be true.  
        // Another example to compare variables 
        int a = 20;
        int b = 20;
        if (a == b) {
          System.out.println("a is equal to b");
        }
        
        
        //Another example 
        boolean isLightOn = true;

        if (isLightOn) {
        	  System.out.println("The light is on.");
        	}

        isLightOn = false;

        if (isLightOn) {
          System.out.println("The light is on.");  // This will not be printed
        }

        System.out.println("This line runs no matter what, because it is outside the if statement.");
        
        //Tip: Always using braces { } makes your code clearer, easier to read, and prevents subtle bugs.
        
        
        
        //								----"else"----
        /* if (condition) {
         block of code to be executed if the condition is true
        } else {
         block of code to be executed if the condition is false
        	}
        */	
        
        //The else statement lets you run a block of code when the condition in the if statement is false.
        
        boolean isRaining = false;

        if (isRaining) {
          System.out.println("Bring an umbrella!");
        } else {
          System.out.println("No rain today, no need for an umbrella!");
        }
        
        //Since isRaining is false, the condition inside the if statement is not met. 
        //That means the if block is skipped, and the else block runs instead, printing "No rain today, no need for an umbrella!".
        
        //Another Example 
        int time = 20;

        if (time < 18) {
          System.out.println("Good day.");
        } else {
          System.out.println("Good evening.");
        }
        // Outputs "Good evening."
        //In the example above, time (20) is greater than 18, so the condition is false.
        //Because of this, we move on to the else condition and print to the screen "Good evening". 
        //If the time was less than 18, the program would print "Good day".
        
        //else does not have a condition - it runs when the if condition is false.
        //Do not put a semicolon right after if (condition). 
        //That would end the statement early and make else behave unexpectedly.
        
        
        
       
        
        //								----"else if"---- 
        /* 
        If the first check fails, try another check
        if (condition1) {
		  // block of code to be executed if condition1 is true
		} else if (condition2) {
		  // block of code to be executed if condition1 is false and condition2 is true
		} else {
		  // block of code to be executed if both conditions are false
		}
        */
        
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

        if (weather == 1) {
          System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
          System.out.println("Wear sunglasses.");
        } else {
          System.out.println("Just go outside normally.");
        }
        // Outputs "Wear sunglasses."
        
        //Since weather is 2, the first condition (weather == 1) is not met, so the if block is skipped. 
        //The program then checks the else if condition (weather == 2), which is true. 
        //That means the else if block runs and prints "Wear sunglasses.".
        
        //Another Example 
        
        int hourOfTheDay =16;
        
        if (hourOfTheDay<12) {
        	System.out.println("Good Morning ");
        } else if (hourOfTheDay<18) {
        	System.out.println("Good Afternoon");
        } else {
        	System.out.println("Good Evening");
        }
        
        //The value of time is 16. The first condition (hourOfTheDay < 12) is false, but the second condition (hourOfTheDay < 18) is true.
        //Because of this, the else if block runs and prints "Good Afternoon.".
        //If the value of hourOfTheDay was 22, none of the conditions would be true, and the program would print "Good evening." instead:
          
     // 					---- IMPORTANT RULE ABOUT IF, ELSE IF AND ELSE ----

     // Java checks the conditions from top to bottom.
     // Once it finds the first condition that is true,
     // it executes that block and skips the remaining conditions.
     // It does not check the following else if or else blocks.
        
        
        
        
        
        
        //                        ---- and  && , or ||   OPERATOR ----                  
        // The user can participate in the course if their age is between 18 and 35.
        // // With the && (AND) operator, both conditions must be true
        // for the entire condition to be true.
        int userAge = 8;

        if (userAge >= 18 && userAge <= 35) {

            System.out.println("You are the right age to participate in the course");

        } else if (userAge < 18 && userAge >= 1) {

            System.out.println("You are too young to participate");

        } else if (userAge > 35 && userAge <= 120) {

            System.out.println("You are too old to participate");

        } else {

            System.out.println("Invalid age");

        }


     // With the || (OR) operator, at least one condition must be true
     // for the entire condition to be true.

        if (userAge < 1 || userAge > 120) {

            System.out.println("Invalid age");

        } else if (userAge < 18) {

            System.out.println("Sorry, you cannot participate in the course because you are under 18");

        } else if (userAge > 35) {

            System.out.println("You are too old to participate");

        } else {

            System.out.println("Welcome to our course");

        }


        // INTENTIONALLY INCORRECT EXAMPLE.
        // Once the first if condition is executed,
        //Java does not move to the following conditions.

        int myAge = 50;

        if (myAge >= 18) {

            System.out.println("You have just become an adult");

        } else if (myAge >= 25) {

            System.out.println("You are becoming an adult");

        } else if (myAge >= 45) {

            System.out.println("You are now older");

        }
	     // This example is intentionally incorrect.
	     // Since myAge is 50, the first condition (myAge >= 18) is already true.
	     // Java executes the first block and skips the remaining conditions.
	     // Therefore, the other two messages will never be printed.
        
        
        

    }

}

