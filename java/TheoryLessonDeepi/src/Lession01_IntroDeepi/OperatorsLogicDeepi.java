package Lession01_IntroDeepi;

public class OperatorsLogicDeepi {
	public static void main(String[] args) {
		
		//As with comparison operators, you can also test for true or false values with logical operators.
		//Logical operators are used to determine the logic between variables or values, by combining multiple conditions::
		
		// && || ! these are all LOGICAL OPERATORS 
 /*Operator	Name	      Description	                                           
  	
    && 	    Logical and	  Returns true if both statements are true	                 	
    || 	    Logical or	  Returns true if one of the statements is true	          	
    !	    Logical not	  Reverse the result, returns false if the result is true	
*/
		// 
		
		int age = 30;
		boolean hasMembership = true;
			
			System.out.println(age >= 18 &&  hasMembership ==true);
			
		boolean hasDiscountcode = false;
		 hasMembership = true;
		
			System.out.println(hasDiscountcode || hasMembership); // compare here
		
		boolean isOpen = true;
		System.out.println(!isOpen); // To make it not true! Infront of variable name 
		
		//Logical operators often become easier to understand once you start using them inside if statements, 
		//which you will learn about in the upcoming chapters.
		
		// JAVA OPERATOR PRECEDENCE
		//When a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.

        //For example, multiplication happens before addition:
		
		int result1 = 2 + 3 * 4;     // 2 + 12 = 14
		int result2 = (2 + 3) * 4;   // 5 * 4 = 20

		System.out.println(result1);
		System.out.println(result2);
		
		/*Why Does This Happen?
		In 2 + 3 * 4, the multiplication is done first, so the answer is 14.

		If you want the addition to happen first, 
		you must use parentheses: (2 + 3) * 4, which gives 20.
				
		Always use parentheses ( ) if you want to make sure the calculation is done in the order you expect. 
		It also makes your code easier to read.
		*/
		
		/*
		 * Order of Operations
			Here are some common operators, from highest to lowest priority:
			
			() - Parentheses
			*, /, % - Multiplication, Division, Modulus
			+, - - Addition, Subtraction
			>, <, >=, <= - Comparison
			==, != - Equality
			&& - Logical AND
			|| - Logical OR
			= - Assignment
		 */
		
		/*
		 * Another Example
			Subtraction and addition are done from left to right, unless you add parentheses:
			
			Example
			int result1 = 10 - 2 + 5;    // (10 - 2) + 5 = 13
			int result2 = 10 - (2 + 5);  // 10 - 7 = 3
			
			System.out.println(result1);
			System.out.println(result2);
		 */
	}

}
