
package esercitazioni;

import java.util.Random;
import java.util.Scanner;

public class Carta_Sasso_ForbiciDeepi {

    public static void main(String[] args) {

        // Keep track of the score
        int userWin = 0;
        int computerWin = 0;

        // Decide if we want to play again
        String playAgain = "yes";

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // Repeat the game while the answer is yes
        while (playAgain.equals("yes")) {

            // My choice
            System.out.println("Choose R, P or S:");
            String myChoice = scan.nextLine().toUpperCase().trim();

            // Computer choice
            int number = rand.nextInt(3);

            String computerChoice = "";

            if (number == 0) {
                computerChoice = "R";
            }
            else if (number == 1) {
                computerChoice = "P";
            }
            else {
                computerChoice = "S";
            }

            System.out.println("My choice: " + myChoice);
            System.out.println("Computer choice: " + computerChoice);

            // Compare the choices
            if (myChoice.equals(computerChoice)) {

                System.out.println("It's a draw!");

            }
            else if (myChoice.equals("R") && computerChoice.equals("S")) {

                System.out.println("You win!");
                userWin++;

            }
            else if (myChoice.equals("P") && computerChoice.equals("R")) {

                System.out.println("You win!");
                userWin++;

            }
            else if (myChoice.equals("S") && computerChoice.equals("P")) {

                System.out.println("You win!");
                userWin++;

            }
            else if (myChoice.equals("R") || myChoice.equals("P") || myChoice.equals("S")) {

                System.out.println("Computer wins!");
                computerWin++;

            }
            else {

                System.out.println("Invalid choice. Please choose R, P or S.");

            }

            // Display the current score
            System.out.println("----------------------");
            System.out.println("Your score: " + userWin);
            System.out.println("Computer score: " + computerWin);

            // Ask if the user wants to play again
            System.out.println("Do you want to play again? yes/no");
            playAgain = scan.nextLine().toLowerCase().trim();
        }

        // Display the final result
        System.out.println("----------------------");
        System.out.println("FINAL SCORE");
        System.out.println("Your score: " + userWin);
        System.out.println("Computer score: " + computerWin);

        if (userWin > computerWin) {
            System.out.println("Congratulations! You are the overall winner!");
        }
        else if (computerWin > userWin) {
            System.out.println("Computer is the overall winner!");
        }
        else {
            System.out.println("The game is a tie!");
        }

        scan.close();
    }
}
