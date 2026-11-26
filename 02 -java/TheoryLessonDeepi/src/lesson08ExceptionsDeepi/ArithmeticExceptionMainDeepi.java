package lesson08ExceptionsDeepi;

public class ArithmeticExceptionMainDeepi {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		double r = 0.0;
		//In this case, we will handle the exception through the Try & Catch blocks.These blocks allow me to control the exception that occurs during the execution of the code,therefore preventing the program from stopping. 
		
		try {
			//Try to execute the code
			r = x/y;
			System.out.println(r);
		}catch (ArithmeticException e) { 		//e. is the variable for ArithmeticException 
												//The below is executed if an exception is generated
			System.out.println(e.getMessage()); // getMessage - Returns the detail message string of this throwable.
			System.out.println("You cannot divide by 0");
		}finally {
			// This is always executed 
			System.out.println("This line will always be executed.");
		}
	
		
		System.out.println("The code did not stop");
		
		// Another example 
		
		int[] numbersArr = new int[3];
		// try and catch with shortcut Alt + Shift + Z	
		try {
				
			double number= 7/1; // the code crash here 
			
			numbersArr[0] = 2;
			numbersArr[1] = 4;
			numbersArr[2] = 6;
			numbersArr[3] = 8;
			System.out.println(numbersArr[3]);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot divide by 0");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are going out of the array bounds");
		} finally {
			System.out.println(numbersArr[0]);
		}
		
		
		
		
		
		
		
		
		
		
		
		}

}
