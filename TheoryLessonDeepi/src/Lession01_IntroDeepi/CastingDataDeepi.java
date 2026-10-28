package Lession01_IntroDeepi;

import java.util.Iterator;

public class CastingDataDeepi {
	
	public static void main(String[] args) {
		 
	//In java there are two main types of casting
		
	//Widening Casting (automatic) - converting a smaller type to a larger type size
	//	byte -> short -> char -> int -> long -> float -> double	
		
	//--------	
		
	//	Narrowing Casting (manual) - converting a larger type to a smaller type size
	//double -> float -> long -> int -> char -> short -> byte
		
		//Widening Casting with examples 
	    
		int floor = 5;
		double appartment = floor; // Automatic casting: int to double 
		
		System.out.println(floor);
		System.out.println(appartment);
		
		//Narrowing Casting with examples
		//Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
		
		double Appartment = 1.23d;  
		int Floor = (int) Appartment; // Manual casting : double to int 
		
		System.out.println(Appartment);
		System.out.println(Floor);
		
		// real life example 
		// Set the maximum possible score in the game to 500
		
		int maxScore = 5;
		// The actual score of the user
		int userScore = 4;
		
		double Result = (double) userScore/maxScore*100;
		
		System.out.println("the result is " + Result);
		
		/* Calculate the percentage of the user's score in relation to the maximum available score.
		Convert userScore to double to make sure that the division is accurate */
		
		int maxSscore = 500;
		// The actual score of the user
		int userSscore = 423;
		
		double result = (double) userSscore/maxSscore*100.0d;
		System.out.println(result);
		
			
			
		}
		
		
	}
			
			

			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

