package lession02_StatementDeepi;

import java.util.Scanner;

public class Scanner_ExampleDeepi {

    public static void main(String[] args) {

        // Scanner is an object that allows us to receive user input

        // Reading a String

        Scanner scan = new Scanner(System.in);

        String myName = ""; // We start with an empty String because the user hasn't entered their name yet

        while (myName.equals("")) { 

            System.out.println("Enter your name");

            myName = scan.nextLine(); // Reads the complete line of text entered by the user and stores it in the myName variable.

            if (myName.trim().equals("")) {

                System.out.println("You haven't entered anything");

            } else {

                System.out.println("Hello " + myName);

            }

        }

        // Reading a number. We can use Scanner with different data types

        int age = 0;

        while (age == 0) {

            System.out.println("Now enter your age");

            age = scan.nextInt();

            if (age >= 18) {

                System.out.println("Great, you are an adult");

            } else if (age < 18 && age > 0) {

                System.out.println("Sorry, you are underage");

            } else {

                System.out.println("You haven't entered anything");

            }

        }

        scan.nextLine(); // Clear the Scanner buffer

        System.out.println("Enter a number");

        try {

            double num = scan.nextDouble();

            System.out.println("You entered " + num);

        } catch (Exception e) {

            // Automatically generated catch block

            System.out.println("You entered something that is not a number");

        }

        scan.close(); // Close the Scanner

    }
}
