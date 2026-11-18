package lesson05_ClassDeepi;

public class CarObjectsDeepi {
	
	 public static void main(String[] args) {
		 
		 
		 
		 // OBJECT  1 = I created this class "Car" ALSO can be called as custom data type. like string and int etc..
		 CarDeepi car1 = new CarDeepi(); // the object here is new CarDeepi
		 car1.brand = "Volvo";
		 car1.color = "Red";
		 
		 // OBJECT 2
		 CarDeepi car2 = new CarDeepi(); // the object here is new CarDeepi
         car2.brand = "Audi";
         car2.color = "Blue";
		 
         // OBJECT 3
         CarDeepi car3 = new CarDeepi(); // the object here is new CarDeepi
         car3.brand = "Toyota";
         car3.color = "Yellow";
		 

         // Display object properties
         System.out.println(car1.brand + " - " + car1.color);
         System.out.println(car2.brand + " - " + car2.color);
         System.out.println(car3.brand + " - " + car3.color);
		 
         
         //And a third object: "Toyota" and "yellow". 
         //One class can create as many objects as you need, and each object has its own values.
		 
         //So, a class is a "template" for objects, 
         //and
         //an object is an "instance" of a class.
		 
	 }
		 
	
	

}
