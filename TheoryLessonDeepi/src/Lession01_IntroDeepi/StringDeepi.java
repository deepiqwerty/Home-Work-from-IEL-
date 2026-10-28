package Lession01_IntroDeepi;

public class StringDeepi {
	public static void main(String[] args) {
		
		// JAVA STRINGS 
		//Strings are used for storing text.
		//A String variable contains a collection of characters surrounded by double quotes (""):
		 
		String greeting = "hello";
		
		//String Length
		// String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
		// For example, you can find the length of a string with the length() method:
		
		String alphabets = "Deepika";
		System.out.println("The lenght of the alphabets String is: " + alphabets.length());
		// HERE WE NEED TO REMEMBER ANYTHING WE PUT AFTER --------alphabets.length --------
		//DOESNT HAVE TO ALPHABETS.LENGTH  IT CAN BE ANY NAME FOR THE VARIBLE STRING 
		// IT WILL GIVE THE LENGTH FOR THE STRING. SEE ANOTHER EXAMPLE BELOW 
		
		String husbandName = "ClaudioCurro";
		System.out.println("The length of the husbandName String is:" + husbandName.length());
		
		//MORE STRING METHODS
		//There are many string methods available in Java.
		
		//For example:

		//	The toUpperCase() method converts a string to upper case letters.
		//	The toLowerCase() method converts a string to lower case letters.
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
		
		//FINDING A CHARACTER IN THE STRING 
		//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
		
		
		
		
	}

}
