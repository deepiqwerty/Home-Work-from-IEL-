package lession03_MethodsDeepi;

public class IntroDeepi {
	public static void main(String[] args) {
		
		// ----------------------------JAVA METHODS-------------------------------
		/* A method is a block of code which only runs when it is called!
		 * You can pass data, known as "PARAMETERS", into a method. 
		 * Methods are used to perform certain actions, and they are also known as functions.
		 * Why use methods????
		 * TO REUSE A CODE : define the code once and use it many times 
		 */
		// A method must be declared within a class. 
		// It is defined with the name of the method, followed by parentheses() 
		// Java provides some predefined methods, such as "System.out.println()", but you can create your own methods to perform certain actions. 
		// For example - Create a method inside main: 
		
		/*public class Main{
			static void myMethod() {
				
			}
		}
		
		* myMethod() is the name of the method
		* static means that the method belongs to the Main class and not an object of the Main class. 
		* we will learn more about objects and how to access methods through objects later in this tutorial.
		* void means that this method does not have a return value. You will learn more about return values later in this chapter
		*/
		
		// ----------------------------- CALL A METHOD -----------------------------
		//For example - Inside main, call the happyBirthday()method:
		
				happyBirthday(); // calling the method!
				happyBirthday(); // method can be called multiple times. 
				
				welcomeMessage();
				
				String name = "Claudio";
				myMethod("Claudio");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				myMethod("Deepika");
				
				myMethod(name);
				myMethod(name);
				myMethod(name);
				myMethod(name);
				myMethod(name);
				myMethod(name);
				
				int age = 17;
				checkAge(age);
				
				String greeting = "";
				greeTing(greeting);
				
				int yearOfBirth = 1956;
				int currentAge = calculateAge(yearOfBirth);
				checkAge(currentAge);
				System.out.println("Your age is " + currentAge);
				
				String email = "deepika.dutta@gmail.com";
				String password = "Ihateyou4this";
				boolean input = isLoginSuccessfull(email,password);
				System.out.println("Login is successfull " + input );
				
				
				
				
	}	
	
				static void happyBirthday(){
					System.out.println("Happy Birthday to you");
					System.out.println("Happy Birthday to you");
				}
				
				static void welcomeMessage(){
					System.out.println("Welcome to Java ");
				}
				
				
				
		// ---------------------------JAVA METHOD PARAMETERS ----------------------------
		// PARAMETERS AND ARGUMENTS
		/* Information can be passed to methods as a parameter. 
		 * Parameters act as variables inside the method.
		 * Parameters are specified after the method name, inside the parentheses.
		 * You can add as many parameters as you want, just separate them with a comma.
		 * For example (name, age, email)
		 */		
				
				static void myMethod(String name){
					System.out.println( name  + " are you from India ? ");
					
				}
		// When a parameter is passed to the method, it is called an argument.	
		// So from the above example " String name" is a parameter, when we use it above for eg,"Deepika and Claudio" they are the arguments. 
		/* Note that when you are working with multiple parameters, 	
		 * the method call must have the same number of arguments as there are parameters,
		 *  and the arguments must be passed in the same order.
		*/
				
				
				
		// -------------------------JAVA METHOD PARAMETERS WITH IF...ELSE ---------------------------
			
		// Create a "checkAge()" method with an integer called age 
				
			static void checkAge(int age){
					if (age >= 18) {
						System.out.println("You can enter the course! ");
					}else {
						System.out.println("You cannot enter the course ");
					}
					
				}
			
		/*Another Example - 
		 * if you say "hello", I say "hello to you".
		 * If you say "ciao", I say "ciao a te",
		 * otherwise I will say "Nobody talks to me"
		 * */ 
		
			static void greeTing(String greeting) {
				String caseSensitiveCheck = "";
				caseSensitiveCheck = greeting.toLowerCase();
				if(caseSensitiveCheck.equals("english")) {
					System.out.println("Hello to You");
				}else if(caseSensitiveCheck.equals("italian")) {
					System.out.println("Ciao a te");		
				}else if(caseSensitiveCheck.equals("")) {
					System.out.println("Nobody talks to me");
				}else {
					System.out.println("You are talking a foreign language");
				}
			}
		
			// -------------------------JAVA RETURN VALUES ---------------------------
			/* In the previous exercises, we used the "void" keyword in all examples - like
			 * static void happyBirthday(), static void welcomeMessage()
			 * static void myMethod(String name), static void checkAge(int age)
			 * static void greeTing(String greeting)
			 * which indicates that the method should not return a value.
		     * If you want the method to return a value, you can use a primitive data type 
			 * (such as int, char, etc.) instead of void, and use the return keyword inside the method:
			 */
			
				// For example - Ask year of birth, so you can calculate how old is that person 
			
			static int calculateAge (int yearOfBirth){
				int currentYear = 2026;
				int age = currentYear-yearOfBirth;
				return age;
			}
			
			// Another example - Create one method of type boolean called "IsLoginSuccessfull"
			// the method must receive two parameters in order to be used
			// the parameters are 2 strings called "emailProvided" and "passwordProvided"
			// inside the method create 2 variables called "correctEmail" and "correctPassword"
			// compare "correctEmail" with "emailProvided" to check if they are the same
			// compare "correctPassword" and "passwordProvided" to check if they are the same
			// if both are correct, return true, otherwise return false
			
			static boolean isLoginSuccessfull(String emailProvided, String passwordProvided) {
				String correctEmail = "deepika.dutta@gmail.com";
				String correctPassword = "Ihateyou4this";
				if(emailProvided.equals(correctEmail) && passwordProvided.equals(correctPassword)) {
					System.out.println("The email is correct");
					System.out.println("The password is correct");
					return true;
				}else {
					System.out.println("Invalid entry");
					return false;
				}
				
			}
			
			
				

				
}
