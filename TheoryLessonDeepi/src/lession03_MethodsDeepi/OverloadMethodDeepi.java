package lession03_MethodsDeepi;

public class OverloadMethodDeepi {
	
	public static void main(String[] args) {
		
		// ----------------------------JAVA METHOD OVERLOADING -------------------------------
		
		//With method overloading, multiple methods can have the same name with different parameters:
		
		//**Calling Method**
		
		int a = 5;
		int b = 7;
		int total = add(a, b);
		System.out.println("Give me the sum " + total);
		
		double c = 12.25;
		double d = 12.25;
		double totalDouble = add(c, d);
		System.out.println("Give me the sum " + totalDouble);
		
		int e = 5;
		int totalAgain = add(e);
		System.out.println("Give me the sum " + totalAgain);
		
		
	}
	
		// **Always write the method after main**
	
		// Below is the original method
		static int add(int x, int y) {
			return (x+y);
		}
		
		
		/*
		 * Below are the overloaded methods
		 * To overload a method, I need to do one or both of the following:
		 * 1. have different data type of parameters
		 * 2. have a different quantity of parameters -- 
		 */
	
		static double add(double x, double y) {
			return (x+y);		
		}
		
		static int add(int z) {
			return (z + z );
		}

		/*
		 * The following is a valid method, 
		 * it has the same name and a single parameter like the one above,
		 * but the parameter is a string, not a double.
		 * this makes it different enough
		 */
		static String add(String z) {
			return (z + z);
		}
		/*
		* The following would not be a valid method,
		* because it has exactly the same number and type of parameters
		static double add(double x, double y) {
			
			return (x+y);		
		}
		*/

		// ---------------------------- METHOD SCOPE -------------------------------
		// In Java, variables are only accessible inside the region where they are created. 
		// This is called scope.	
		// There are different type of scopes:
		// 1. Method Scope - Any variable inside a method, only exist inside that method
		// 2. Block Scope - Any variable inside an IF/ IF ELSE/ ELSE statement, only exist inside that block
		// 3. Loop Scope - Any variable inside a loop, only exist inside that loop
		
}
