package lesson05_ClassDeepi;

public class ClassesandObjectsDeepi {
	
	
		// Java Classes/Objects
		
		/* Java is an object oriented programming language 
		 * 
		 * Everything in Java is associated with classes and objects, along with its attributes and methods. 
		 * 
		 * For example: in real life, a car is an "OBJECT"
		 * The car has "ATTRIBUTES", such as weight and color, 
		 * and 
		 * "METHODS", such as drive and brake.
		 */ 
		
		 // A "CLASS" is like an OBJECT CONSTRUCTOR, or a "blueprint" for creating objects.
		
		 // HOW TO CREATE A CLASS, use the keyword "class"
	
			// Remember from the Java Syntax that a class should always start with an uppercase first letter,
			// and that the name of the java file should match the class name.
			 
			 
			 /* HOW TO CREATE AN OBJECT,
			  * In Java, an object is created from a class. 
			  * After defining a class, you can create objects from it using the new keyword:
			  */
		// Here our class is " 	ClassesandObjectsDeepi "

	  int x = 5;

	  public static void main(String[] args) {
		  ClassesandObjectsDeepi myObj = new ClassesandObjectsDeepi();  // the object here is new ClassesandObjectsDeepi
	    System.out.println(myObj.x);
	    
	    // We can create multiple objects for example 
	    ClassesandObjectsDeepi myObj1 = new ClassesandObjectsDeepi();// the object here is new ClassesandObjectsDeepi
	    ClassesandObjectsDeepi myObj2 = new ClassesandObjectsDeepi();// the object here is new ClassesandObjectsDeepi
	    System.out.println(myObj.x);
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	  
	    //Using Multiple Classes
	    /* You can also create an object of a class and access it in another class.
		 * This is often used for better organization of classes (one class has all the attributes and methods,
		 * while the other class holds the main() method (code to be executed)).
		*/
	   
	    //Remember that the name of the java file should match the class name
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
	  
	  
		
	
	}
	
	
	
	
	
