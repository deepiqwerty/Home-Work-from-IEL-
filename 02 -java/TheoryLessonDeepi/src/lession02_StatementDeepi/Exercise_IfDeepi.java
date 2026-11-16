package lession02_StatementDeepi;

public class Exercise_IfDeepi {
	public static void main(String[] args) {
		
		 /**
         * University Exams
         *
         * We need to evaluate a university exam.
         * To be allowed to take the oral exam, I must have
         * achieved at least 18 in the written exam.
         * Once both grades have been entered, calculate
         * the average for the final grade.
         */
		
		 /*Your teacher wants to create a small university examination system.
		 * Imagine a university where:
		 * A student must pass the written exam before being admitted to the oral exam.
		 * The minimum passing grade is 18.
		 * The maximum grade is 30.
		 * If the student fails the oral exam, they must repeat the entire exam.
		 * If both exams are passed, Java calculates the final average.
		 */
		
		int writtenGrade = 22; 
		int oralGrade = 23;
		
		if (writtenGrade >= 18 && writtenGrade <= 30) {

            System.out.println("Well done, you are admitted to the oral exam");

            if (oralGrade >= 18 && oralGrade <= 30) {

                double finalGrade = Math.round((double)(oralGrade + writtenGrade) / 2);

                System.out.println("Well done, you have also passed the oral exam. Your grade is " + finalGrade);

            } else if (oralGrade >= 1 && oralGrade < 18) {

                System.out.println("Sorry, your oral exam result is insufficient. You must retake the entire exam");

            } else {

                System.out.println("Invalid grade");

            }

        } else if (writtenGrade >= 1 && writtenGrade < 18) {

            System.out.println("Sorry, you did not pass the written exam. Try again");

        } else {

            System.out.println("Invalid grade");

        }
		
		// ANOTHER SIMPLE EXERCISES 
		
		int grade = 22;
		
		if (grade>= 18) {
			System.out.println("Passed");
			
		} else if (grade >= 1) {
			System.out.println("Failed");
			
		} else {
			System.out.println("Invalid Grade ");
		}
		
		/* For me to do 
		 Exercise 1: Temperature
			A weather app checks the temperature.
			
			Create an int variable called temperature.
			- If temperature is greater than 30, print "It's hot"
			- Else if temperature is greater than 15, print "The weather is pleasant"
			- Else print "It's cold"
			Test with: 35, 22, and 10.
							
		Exercise 2: Shopping discount
			An online store gives discounts based on the order amount.
			
			Create a double variable called orderAmount.
			- If the amount is 100 or more, print "20% discount"
			- Else if the amount is 50 or more, print "10% discount"
			- Else print "No discount"
			Test with: 120, 75, and 30.
		
		Exercise 3: Exam result
			A student receives a grade between 1 and 30.
			
			Create an int variable called grade.
			- If the grade is 18 or higher, print "Passed"
			- Else if the grade is 1 or higher, print "Failed"
			- Else print "Invalid grade"
			Test with: 25, 15, and 0.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
	    }
	}


