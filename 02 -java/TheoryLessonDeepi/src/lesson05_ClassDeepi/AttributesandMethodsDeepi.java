package lesson05_ClassDeepi;

public class AttributesandMethodsDeepi {
	
	// ---------------------------- JAVA - CLASS ATTRIBUTES -------------------------------
	
	/*
	 * Previously we saw, we used the term "variable" for x in the example (as shown below).
	 * In Java, variables declared inside a class are called "attributes".
	 * You can also say that attributes are variables that belong to a class:
	 * 
	 * Another name for attributes is "fields".
	 * 
	 * */
	
		// Accessing Attributes
		int x = 5;
		int y = 3;
		int z;
		
		// Multiple Attributes
		String fname = "Kartik"; 
		String lname = "Dutta";
		int age = 67;
		
		// Method
		static void myMethod() {  
			System.out.println("Hello World!");
		}
		
		// Create a fullSpeed() Method // the difference of static void and public void is mention in the main
		public void fullSpeed() { 
			System.out.println("The cars is going as fast it can");
		}
		
		// Create a fullSpeed() Method and add a parameter
		public void speed(int maxSpeed) { 
			System.out.println("Max speed is: " + maxSpeed);
		}
		
		
	
	
	// ACCESSING ATTRIBUTES
	/* You can access attributes by creating an object of the class, and by using the dot syntax (.):
	 * The following example will create an object of the Main class, with the name myObj. 
	 * We use the x attribute on the object to print its value:
	 * Example - Create an object called "myObj" and print the value of x:
	 * */
	
	public static void main(String[] args) {
		AttributesandMethodsDeepi myObj = new AttributesandMethodsDeepi();
		
		System.out.println(myObj.x);
		
	//	You can also modify attribute values: see above for ex "int z" has no value	 
		
		myObj.z = 40;
		System.out.println(myObj.z);
		
	// Or override existing values: Change the value of x to 25:
		
		myObj.x = 25;
		System.out.println(myObj.x);
		
	// The final keyword is useful when you want a variable to always store the same value,
	// The final keyword is called a "modifier". You will learn more about these in the Java Modifiers Chapter.
		
		
	// MULTIPLE ATTRIBUTES 
	// You can specify as many attributes as you want:
		
		
		AttributesandMethodsDeepi myObj1 = new AttributesandMethodsDeepi();
		System.out.println("Name: " + myObj1.fname + " " + myObj1.lname);
		System.out.println("Age: " + myObj.age);
		
		
		
		
	// ---------------------------- JAVA - CLASS METHODS -------------------------------	
		
	// 	You learned from the Java Methods chapter that methods are declared within a class, 
	//	and that they are used to perform certain actions:
	//	myMethod() prints a text (the action), when it is called. 
	// To call a method, write the method's name followed by two parentheses () and a semicolon;
		
		myMethod(); // METHOD 
	
	// ACCESS METHODS 
	
		//When we call a method with public void 
		//This method is non-static. To use it, you must create an object of the class first. For eg below:
		// WHAT DOES STATIC DOES ?
		// STATIC = I can use the method without creating an object.
		// NON-STATIC = I need to create an object before using the method.
		// STATIC METHOD - 
		AttributesandMethodsDeepi myCar = new AttributesandMethodsDeepi();
		myCar.fullSpeed(); // call the fullSpeed Method 
		
	// ACCESS METHODS and PARAMETERS 
		myCar.speed(200); // // call the speed Method 
		
			
	}
	
	
	
	
	// ---------------------------- REMEMBER THAT-------------------------------
	/*
	 * The dot (.) is used to access the object's attributes and methods.
	 * To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).
	 * A class must have a matching filename FOR EX (Main and Main.java).
	 */
	
	
	// ---------------------------- USING MULTIPLE CLASS-------------------------------
	/*
	 * Remember that the name of the java file should match the class name.
	 *  In this example, we have created two files in the same directory:
	 * Main.java
	 *Second.java
	 *
	 */
	
	// ---------------------------- BEST PRACTICE AS PER MY UNDERSTANDING -------------------------------//
	// We can write our codes in different or multiple file but run them in one file which is "MAIN" class
}
