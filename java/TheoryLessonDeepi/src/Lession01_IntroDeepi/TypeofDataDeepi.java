package Lession01_IntroDeepi;

public class TypeofDataDeepi {
	
	public static void main(String[] args) {
		
		
		// LEARNINGS WITH CLA
		/* Variables are containers of data
		 * Data stored inside the variables are information that you want to save
		 * Variables can be of different types
		 * If you want to save a whole number, you will need to have a variable of --> type int	
		 * For eg - I want to remember the age of my wife 
		 * I will create a variable of my wife
		 * I will create a variable called --> ageOfmywife
		 * and since the age is a whole number, I will give int as type of variable 
		 */
		int ageOfMyWife = 33;
		
		// If i want to remember the bank account balance of my wife 
		// I will create a variable called bankAccountBalance And since the account balance has a dot in it, I cannot use "int", I have to use "double"
		double bankAccountBalance = 10000.99;
				
		//we can also declare a variable without assigning the value, and assign the value later
	
		int myNum;
		myNum = 15;
		System.out.println(myNum);
		
		String myName;
		myName = "jesus";
		System.out.println(myName);
		
// <<< WE HAVE TWO TYPES OF DATA TYPES >>> Primitives & Non-primitive
		
		//The following data type are Non Primitives --> they are very basic 
		// Ex - includes byte, short, int, long, float, double, boolean and char
		
		// The following data type are Primitives --> they are very basic 
		// Ex - includes such as String, Arrays and Classes 
		
		//byte can use only whole numbers upto 127 in plus and in minus 128
		// 1 byte = 8 bit
		// 8 bit (-128 + 127) = 255 like we studied in harvard course
		byte age = 33;
		
		//just like byte but bigger numbers 
		// 2 byte = 16 bit
		// 16 bit (-32,768 to 32,767 )
		short waterTank = 30000;
		
		// once upon a time we use to have small space in memory so we had to save space using variables like "byte" and "short"
		// nowadays we dont care about space beacause we have lot so commonly we use "int"
		int cryptoBalance = 400000000; 
		
		// if all the variables like byte, short and int are not enough we can use "long"
		// we have add "L" at the end of the digits while inputing "long"
		long lifeOfEarth = 9223372036854775807L;
		
		// Numbers with decimals cannot go in byte, short, int, long 
		// We have to use float or double 
		
		// we have add "f" at the end of the digits while inputing "float"
		float litersOfWater = 1.5f;
		
		// exactly the same thing but is bigger 
		double creamOfMyface = 0.4459764325678900;
		
		// when we input final for any variables after that we cannot change the value 
		//If we don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only
		// For example 
		
		String dressColor = " White";
		dressColor = "Orange";
		dressColor = "Pink";
				
		System.out.println(dressColor);
				
		final String dressColorNight = "Blue ";
		System.out.println(dressColorNight);
		
		
		// lets try to go over the maximum capacity 
		byte year = 127;
		short yearPlusOne = (short) (year + 1);
		
		System.out.println("Before " + year);
		
		System.out.println("After " + yearPlusOne);
		
		
		//A char uses single quotation marks (' '), and stores one character.
		// we can put letter, number or symbol but it has to be single character.
		char myLetter = 'D';
		
		//A boolean stores only one of two possible values like 
		//true or false, yes or no , on or off
		//true and false do not need quotation marks. If you write "true", Java treats it as text (String), not as a boolean.
		boolean rolexIsExpensive = true;
		boolean rolexIsNotExpensive = false;
		
		System.out.println("Is Rolex is Expensive ?"+ " " + rolexIsExpensive);
		
		//We can assign same value to multiple variables in one line. 
		 int x, y, z;
		 x = y = z = 50;
		 System.out.println(x + y + z);
		
		 String papa, mother, juthika, komolika;
		 papa = mother = juthika = komolika = "dutta family";
		 
		 System.out.println(papa + " " + mother + " " + juthika + " " + komolika);
		 
		//printing variables 
		 int a = 5;
		 int b = 6;

		 System.out.println("The sum is " + a + b);   // Prints: The sum is 56
		 System.out.println("The sum is " + (a + b)); // Prints: The sum is 11
		 
         //printing varaiables Instead of writing
		 int d = 5;
		 int e = 6;
		 int f = 50;
		 System.out.println(d + e + f); // 61
		 
		
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
