package Lession01_IntroDeepi;

public class StringDeepi {
	public static void main(String[] args) {
		
		                         //** JAVA STRINGS** //
		
		//Strings are used for storing text.
		//A String variable contains a collection of characters surrounded by double quotes (""):
		 
		String greeting = "hello";
		
		
		//--- STRING LENGTH ---
		// String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
		// For example, you can find the length of a string with the length() method:
		
		String alphabets = "Deepika";
			System.out.println("The lenght of the alphabets String is: " + alphabets.length());
		// Here we need to remember anything we input after --------alphabets.length --------
		//Does not have to be alphabets.length, it can be any name for the variable string 
		// It will give the length for the string. See another example below:
		
		String husbandName = "ClaudioCurro";
			System.out.println("The length of the husbandName String is:" + husbandName.length());
		
		
		//---MORE STRING METHODS---
		//There are many string methods available in Java. For example:
		
		//	The toUpperCase() method converts a string to upper case letters.
		//	The toLowerCase() method converts a string to lower case letters.
		
		String txt = "Hello World";
			System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
			System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		
		//---FINDING A CHARACTER IN THE STRING---
		//-indexOf()-
		//returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		//The indexOf() method searches for a specific character or word inside a String and tells you the position where it appears for the first time.
		
		String name = "DARIO";
		
		//		    Java sees the letters like this:
		//			Letter	    D	A	R	I	O
		//			Position	0	1	2	3	4
		//Why does it start at 0?    Because Java counts the position of the first character as zero, not one.
		//Now, what does indexOf() do?
		//Imagine you ask Java:
        //"Where can you find the letter R?"
			System.out.println(name.indexOf("R")); //remember indexOf("") is case sensitive. 
											// remember when printing indexOf("") the character which we are looking for should be inside the ""
		
		// Check if a String contains specific text 
		String course = "Technical Development";
		boolean found = course.contains("Technical");
		   System.out.println("Does the string contain the searched word? " + found);
			
		// Find the last occurrence of a character
		 String courseText = "Technical Development";
		 int lastLetterPosition = courseText.lastIndexOf("e");
		 	System.out.println("The last position of the letter e is: " + lastLetterPosition); 
		   
		// Remember:
		// - indexOf() finds the first occurrence.
		// - lastIndexOf() finds the last occurrence. 
		   
		// Extract parts of a string 
		 String courseTitle = "Technical Development";
		 String partial = courseTitle.substring(5, 10);
		 	System.out.println("Partial string: " + partial); 
		// substring(5, 10) extracts characters starting at position 5 and stops before position 10.
		 
		 
		 
		 
		 
		//-charAt()-
		//method to access a character at a specific position in a string:
		//The charAt() method allows you to take out one specific character from a String by using its position (index).
		
		String birthday = "October";
				System.out.println(birthday.charAt(2));
				
		// Find the last character of a String 
		
		String courseName = "Technical Development";
		char lastletter = courseName.charAt(courseName.length()-1);
		 		System.out.println("The last letter is: " + lastletter);
		
		// what if it is a long sentence ? 
		String sentence = "I love learning Java programming";
		int position = sentence.indexOf("Java");
			System.out.println(position);
			System.out.println(sentence.charAt(position));
		
		//what if we have J two times? for example 
		sentence = "John enjoys learning Java";
		//There are two things to notice:
		// The letter J appears in "John" first.
		// The word Java appears later.
		//int position = sentence.indexOf("J"); Java finds the first J which is in John.
		//int position = sentence.indexOf("Java"); // Java will finds the position of Java
				
		
		//---COMPARING STRINGS--- 
		// -equal()-
		//To compare two strings, you can use the equals() method:
		
		String txt1  = "Hello";
		String txt2 = "Hello";
		
		String txt3  = "Greetings";
		String txt4 = "Great things"; // true 
		
			System.out.println(txt1.equals(txt2));
			System.out.println(txt2.equals(txt4)); // false 
		
		//We use .equals() when we want Java to check whether two pieces of text are exactly the same.
		
		
		//-- REMOVING WHITE SPACES-- 
		// -trim()-
		//We use trim() to remove unnecessary spaces from the beginning and end of a String.
		//One important detail: trim() removes whitespace at the beginning and end, not between words.
		String text = "   Hello World   ";
		System.out.println("Before: [" + text + "]");
		System.out.println("After:  [" + text.trim() + "]");	
		
		
								//**JAVA STRING CONCATENATION**//
		
		//--- STRING CONCATENATION ---
		//	The + operator can be used between strings to combine them. 
		//This is called concatenation:	Example:
		
		String firstName = "John";
		String lastName = "Doe";
			System.out.println(firstName + " " + lastName);
		
		//--- CONCATENATION in SENTENCES ---
		//You can use string concatenation to build sentences with both text and variables:
			
			String Name = "John";
			int age = 25;
			System.out.println("My name is " + Name + " and I am " + age + " years old.");
			
		
		//--- CONCAT()METHOD  ---
		//You can also use the concat() method to concatenate strings:
		
		String FirstName = "John ";
		String LastName = "Doe";
			System.out.println(FirstName.concat(LastName));
		// You can also join more than two strings by chaining concat() calls:
		String a = "Java ";
		String b = "is ";
		String c = "fun!";	
			System.out.println(a.concat(b).concat(c));
		//	Note: While you can use concat() to join multiple strings, 
		//most developers prefer the + operator because it is shorter and easier to read!
			
			
			                   //**JAVA NUMBERS AND STRINGS**//
			
		//--- ADDING NUMBERS AND STRINGS ---	
		//	WARNING!
		//Java uses the + operator for both addition and concatenation.
		//Numbers are added. Strings are concatenated.
			
		//If you add two int, the result will be a int: Example
			int d = 10;
			int e = 20;
			int f = d + e;  
				System.out.println(d + e);
			// or result = 30
				System.out.println(f);
				
		//If you add two strings, the result will be a string concatenation: Example 		
			String g = "10";
			String h = "20";
			String i = g + h;	
				System.out.println(g +h);
			// or result = 1020
				System.out.println(i);
				
		
		//If you add a number and a string, the result will be a string concatenation:
			String j = "10";
			int k = 20;
			String l = g + h;
				System.out.println(j + k);
			//or result = 1020
				System.out.println(l);
				
		// Creating a string using new 
		String s1 = new String("Hello, this is a string");
			System.out.println(s1); 
			System.out.println(s1.charAt(2));  //claudio says buhhhhhh!!!!
		
		
		// Compare two string contents using equals 
		String s2 = "Hello";
		String s3 = new String("Hello");
		boolean comparison1 = s2.equals(s3);
			System.out.println("Are the two strings equal? " + comparison1);
		// compare the sequence of characters inside the variables
	
		//Compare String refrence using 
		boolean comparison2 = (s2 == s3);
			System.out.println("Are the two strings equal? " + comparison2);
		// remember the example of electronic Cigarettes	
			
		//String Pool Comparison
		String s4 = "Hello";
		boolean comparison3 = (s2 == s4);
			System.out.println("Are the two strings equal? " + comparison3);
		// remeber the John arrow example 
			
		//Compare two objects using new 
		String s5 = new String("e Cigarettes");
		String s6 = new String("e Cigarettes");
		boolean Cigarettes = s5.equals(s6);
			System.out.println("Do the two e Cigarettes have the same features " + Cigarettes);
		boolean Cigarettes2 = s5==s6;// they do not point to the same memory.
			System.out.println("Are these two Cigarettes are the same Cigarettes  " + Cigarettes2);
		
		
		//Compare two different string literals 
		String s7 = "Hello";
		String s8 = "Meow";
		boolean comparison8 = s7==s8;
			System.out.println(comparison8);
			
			
				              //**JAVA STRINGS - SPECIAL CHARACTERS**//
				
		//--- STRINGS SPECIAL CHARACTERS ---	
		//Because strings must be written within quotes, 
		//Java will misunderstand this string, and generate an error:
				
		//String movie = "We are the so-called "Vikings" from the north.";
		//We cannot use double quotes in strings
		/*The solution to avoid this problem, is to use the backslash escape character.

		The backslash (\) escape character turns special characters into string characters:

		Escape character	      Result	        Description
		      \'	                '	            Single quote
		      \"	                "	            Double quote
		      \\	                \	            Backslash	
		  
		*/
		// The sequence \"  inserts a double quote in a string:
		String movie = "We are the so-called \"Vikings\" from the north.";		
				
		//The sequence \'  inserts a single quote in a string:		
		String text1 = "It\'s alright.";
		
		//The sequence \\  inserts a single backslash in a string:
		String text2 = "The character \\ is called backslash.";
		
		/*
		 * Other common escape sequences that are valid in Java are:

			Code	Result		
			\n		New Line	
			\t		Tab	
			\b		Backspace	
			\r		Carriage Return	
			\f		Form Feed
		 
		 */
		
	
	}

}
