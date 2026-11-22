package lesson05_ClassDeepi;

	// // Create a class called ConstructorsDeepi 
public class ConstructorsDeepi {
	
	// ---------------------------- CONSTRUCTORS -------------------------------
	
	//A constructor in Java is a special method that is used to initialize objects.
	// The constructor is called when an object of a class is created.
	//It can be used to set initial values for object attributes:
	
	// BASICALLY - A constructor is a special method that prepares an object when you create it.
	// Example
	
	
	int x; // Create a class attribute
	
	// // Create a class constructor for the "ConstructorsDeepi" class
	
	public ConstructorsDeepi() {
		x = 5; // Set the initial value for the class attribute x
	}	
	// Note that the constructor name must match the class name, and it cannot have a return type (like void).
		

	// ---------------------------- CONSTRUCTORS PARAMETERS -------------------------------	
	/*Constructors can also take parameters, which is used to initialize attributes.
	 * The following example adds an int y parameter to the constructor. 
	 * Inside the constructor we set a to y (a=b). 
	 * When we call the constructor, we pass a parameter to the constructor (5), 
	 * which will set the value of x to 5:
	 * */
	public ConstructorsDeepi(int y) { // Parameters
		x = y;
	}

	int modelYear;				// Multiple Parameters
	String modelName;
	public ConstructorsDeepi(int modelYear, String modelName) {
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	// JAVA "this"
	// The this keyword in Java refers to the current object in a method or constructor.
	//The this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.
	
	
		
		
	public static void main(String[] args) {
		ConstructorsDeepi myObj = new ConstructorsDeepi(); //	Create an object of class ConstructorsDeepi
														   // 	(This will "call teh constructor"	
		System.out.println(myObj.x); // Print the value of x
		
		
		
		ConstructorsDeepi myObj1 = new ConstructorsDeepi(5);
		System.out.println(myObj1.x); // Parameters
		
		ConstructorsDeepi myCar = new ConstructorsDeepi(1969, "Mustang");
		System.out.println(myCar.modelYear + " " + myCar.modelName); //// Multiple Parameters
		
	}
	
	
	
	
	
	
	
}
