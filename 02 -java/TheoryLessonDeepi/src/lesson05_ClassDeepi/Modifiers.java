package lesson05_ClassDeepi;

public class Modifiers {
	
	// ---------------------------- JAVA MODIFIERS -------------------------------
	/*by now, you are quite familiar with the public keyword that appears in almost all of our examples:
	 *public class Main
	 * The public keyword is an access modifier,
	 * meaning that it is used to set the access level for classes, attributes, methods and constructors.
	 * 
	 * We divide modifiers into two groups:
	 * Access Modifiers - controls the access level
	 * Non-Access Modifiers - do not control access level, but provides other functionality
	 */
	
	// ---------------------------- ACCESS MODIFIERS -------------------------------
	/* For classes, you can use either public or default:
	 * Modifier	   Description
	 * public	   The class is accessible by any other class
	 * default	   The class is only accessible by classes in the same package. 
	 * 			  		
	 * 
	 * For attributes, methods and constructors, you can use the one of the following:
	 * Modifier	   Description
	 * public	   The code is accessible for all classes within the same project. 
	 * private	   The code is only accessible within the declared class
	 * default     The code is only accessible in the same package.
	 * protected   The code is accessible in the same package and subclasses. 
	 */
	
	public String name = "John";   // Public - accessible everywhere
	  private int age = 30;        // Private - only accessible inside this class
	
	  public static void main(String[] args) {
		  Modifiers p = new Modifiers();
		    System.out.println(p.name);   // Works fine
		    System.out.println(p.age);    // Error: age has private access in Person
	}

}
