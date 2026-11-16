package lession01_IntroDeepi;

public class ArrayDeepi {
	
	public static void main(String[] args) {
		
		// Arrays are containers of elements that are similar to each other
        // (they must be of the same type). 
		//* for example data type
		
        // Like Strings, arrays are also zero-based (0-based).
		// like we studied in String.charAt() 0, 1, 2, 3 etc 

        // We declare them using square brackets [].

        // Arrays are also objects -> stored in Heap memory.
		//like claudio explained. 

        // Arrays have a fixed size. When I declare an array,
		//when you create Array, you cannot change the size like in VARCHAR in database.
        // I must decide how many positions it will contain.
		// I must decide the size

        // The number 4 inside [] defines the size of the array.

        String[] colors = new String[4]; // for example in my pouch i can have only 4 color pens
        								//in detail you can fit upto 4 color pens, even 3 but not more then 4.	
        //*String[] colours = new String[4] creates four positions but it doesnt automatically assign value in the position 
        //*So we need to Assign a value to each position.

        // 0, 1, 2, 3 are indexes.

        colors[0] = "Blue";
        colors[1] = "Red";
        colors[2] = "Purple";
        colors[3] = "Yellow";

        // colori[4] = "Green";
        // I CANNOT insert this because the array has only 4 positions.
        
              	System.out.println(colors.length);
        
       //For Strings, we use name.length() because it is a method.
       //For arrays, we use colours.length because it is a property (field).

        int arraylength = colors.length;
        // Now imagine you want Java to tell you how many colors are stored in your array.
        // Instead of counting manually, you can write:
        //For arrays, length is a property.
        //.length counts the positions, not just the positions containing values; 
        // See example below 
        
        String[] colour2ex = new String[4];
        colors[0] = "Blue";
        colors[1] = "Red";
        		System.out.println(colors.length);

        System.out.println("The array contains " + arraylength + " colors");

        System.out.println("The first colour is " + colors[0]);

        System.out.println("The last colour is " + colors[colors.length - 1]);
        //* like we did it in charAt

        System.out.println(colors);
        // Here I am printing the reference (memory address representation).

        // To read individual colors, I use a for loop.

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("FOREACH on the colours");

        for (String colore : colors) {
            System.out.println(colore);
        }

        System.out.println("Printing the list of colours in reverse order");

        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        // There is another way to define an array.
        // These arrays also have a fixed size.

        String[] nomi = {"Marco", "Anna", "Luca", "Maria"};
;
        System.out.println("There are " + nomi.length + " names in the array");

        for (String nome : nomi) {
            System.out.println(nome);
        }	
		
        // below is practice 
        String[] weekdays = new String[5];
        weekdays[0] = "monday";
        weekdays[1] = "tuesday";
        weekdays[2] = "wednesday";
        weekdays[3] = "thursday";
        weekdays[4] = "friday";
        System.out.println(weekdays);
        
        
		
	}

}
