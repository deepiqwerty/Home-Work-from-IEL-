package lesson06_EncapsulationDeepi;

public class MainDeepi {
	
	public static void main(String[] args) {
		//PersonDeepi myObj = new PersonDeepi();
		//myObj.name = "John"; // error
		//System.out.println(myObj.name); //there will be error as name is declared  as private in PersonDeepi class
	
		// Instead, we use the getName() and setName() methods to access and update the variable:
		
		PersonDeepi myObj = new PersonDeepi();
		myObj.setName("John"); // Set the value of the name variable to "John"
		System.out.println(myObj.getName());
	
		
		//Code outside the class cannot use  directly,because it is private.
		//Java gives an error. 
		//This is encapsulation: the data is locked inside the object,
		//and only the object's own methods can change it.
		
		//Why Encapsulation?
		/*Better control of class attributes and methods
		 * Class attributes can be made read-only (if you only use the get method), 
		 * or write-only (if you only use the set method)
		 * Flexible: the programmer can change one part of the code without affecting other parts
		 * Increased security of data
		 * */
		
		
	
	}

}
