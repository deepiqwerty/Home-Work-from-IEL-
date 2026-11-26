package lesson08ExceptionsDeepi;

public class ThrowExceptionHandlingDeepi {
	
	// "throw" creates and sends an error
	// "try-catch" receives and fixes it.

	public static void calculateDivision(int num1, int num2){
		double result = 0.0;
		
		if(num2 == 0) {
			throw new ArithmeticException();// This must be handled with a Try & Catch when I call the method.
		}else {
			result = num1/ num2;
			System.out.println(result);
		}
	}
	
	// In this case, the exceptions are handled directly within the method. 
	//I will then be required to implement the different catch blocks
	
	public static void printText(String text) throws Exception, MyExceptionsDeepi {
		if (text == null) {
			throw new Exception();// When I use an exception other than ArithmeticException, I have to use throws in the method.
		}else if (text == "Stupid") {
			throw new MyExceptionsDeepi();
		}else {
			System.out.println("Your text is " + text);
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		// Call calculateDivision
		try {
			calculateDivision(10,0);
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide by 0");
		}
		
		// Call printText
		try {
			printText("Stupid");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Your text is Null. You didnot insert anything");
		} catch (MyExceptionsDeepi e) {
			
			System.out.println(e.getMessage());
		}
		
	}
	
}
