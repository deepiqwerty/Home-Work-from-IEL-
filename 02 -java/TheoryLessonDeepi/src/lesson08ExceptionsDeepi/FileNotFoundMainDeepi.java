package lesson08ExceptionsDeepi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileNotFoundMainDeepi {

	
	public static void main(String[] args) {
		// Let's look at some checked exceptions
		
		
		
		try {
			FileReader myTextFile = new FileReader("./myText.txt");// here when you write ./myText.txt he is already suggesting to use try and catch
			BufferedReader readMyTextFile = new BufferedReader(myTextFile); // This object generates another checked exception.
			
			
			try {
				System.out.println(readMyTextFile.readLine());
			} catch (IOException e) {
				System.out.println("Empty line");
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file has not been found");
		} 
		
		
		print("Hello all");
		print(null);
		
		
	}
	
	// Exception Unchecked - 
	public static void print (String text) {
		if(text != null) {
			System.out.println("This is a text " + text);
		}
	}
}
