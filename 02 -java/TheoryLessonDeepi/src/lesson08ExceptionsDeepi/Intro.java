package lesson08ExceptionsDeepi;

public class Intro {

	
	
	// ---------------------------- TYPES OF ERRORS IN JAVA ------------------------------
	/*	Error Type				Description
		Compile-Time Error		Detected by the compiler. Prevents code from running.
		Runtime Error			Occurs while the program is running. Often causes crashes.
		Logical Error			Code runs but gives incorrect results. Hardest to find.
	 */
	
	// Common Compile-Time Errors
	/*	Compile-time errors occur when the program cannot compile due to syntax or type issues.
		Here are some examples:
		
		1) Missing Semicolon
		int x = 5
		System.out.println(x);
		Tip: Java requires a semicolon at the end of every statement (int x = 5;).
		
		2) Undeclared Variables
		System.out.println(myVar);
		Tip: You must declare a variable before using it (int myVar = 50;).
		
		3) Mismatched Types
		int x = "Hello";
		Tip: Make sure the value matches the variable type (String x = "Hello";).
 */

	// Common Runtime Errors
	/*	Runtime errors occur when the program compiles but crashes or behaves unexpectedly.
		Here are some examples:
			
		1) Division by Zero
		int x = 10;
		int y = 0;
		int result = x / y;
		System.out.println(result);
		RESULT - Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
		2) Array Index Out of Bounds
		int[] numbers = {1, 2, 3};
		System.out.println(numbers[8]);
		RESULT -Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 3
	 */
	
	// Logical Errors
	/*	Logical errors happen when the code runs, but the result is not what you thought:
		Here are some examples:
			
		int x = 10;
		int y = 2;
		int sum = x - y;
		System.out.println("x + y = " + sum);
		RESULT - 12				
		
		Tip: Test your program with different inputs to catch logic flaws (try using x + y instead). 
			 This is part of debugging, which you will learn more about in the next chapter.
	*/
	
	// GOOD HABITS TO AVOID ERRORS
	//Use meaningful variable names
	//Read the error message carefully. What line does it mention?
	//Check for missing semicolons or braces
	//Look for typos in variable or method names
	
	// ---------------------------- JAVA  DEBUGGING ------------------------------
	
	// What is Debugging?
	/*Debugging is the process of identifying and fixing errors or bugs in your code.
	 * It often involves:
	 * Reading error messages
	 * Tracing variable values step by step
	 * Testing small pieces of code independently
	 * */
	
	// Print Statements for Debugging
	/*The most basic (and often most effective) way to debug Java code is to use System.out.println() to print values and check the flow of the program.
	 * In this example, 
	 * the first line "Before division" will print,
	 * but the second line is never reached because the program crashes due to division by zero:
	 	int x = 10;
		int y = 0;
		
		System.out.println("Before division");  // Debug output
		
		int result = x / y;  // Crashes
		
		System.out.println("Result: " + result);  // Never runs
	 * RESULT 
	 * Before division
		Exception in thread "main" java.lang.ArithmeticException: / by zero
	 */ 
	
	 /*Check Variable Values
	 * If something unexpected happens, print out the values of your variables:
	 * 
	 * int age = 17;
		System.out.println("Age: " + age);
		
		if (age >= 18) {
		  System.out.println("Access granted");
		} else {
		  System.out.println("Access denied");
		}
	 * 
	 * Tip: This is a good way to test whether a condition is working correctly -
	 *  try changing age to 18 or 19 and observe the output!
	 * 
	 * 
	 * Debugging Checklist
	 *	Read the full error message, it often tells you exactly what's wrong
	 *Check if all variables are initialized before use
	 *Print variable values to trace the problem
	 *Watch for off-by-one errors in loops and arrays
	 *Comment out sections of code to find bugs
	 */
}
