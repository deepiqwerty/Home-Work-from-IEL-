package lession02_StatementDeepi;

public class Switch_StatementDeepi {
	
	public static void main(String[] args) {
		
	
	
	//Java Switch Statements
	
	//Instead of writing many if..else statements, you can use the switch statement.
	//Think of it like ordering food in a restaurant:
	//If you choose number 1, you get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta. 
	//Otherwise, you get nothing.
	// For example 
	
	int day = 4; 
	switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;	
			case 4:
				System.out.println("Thursday");
				break;		
			case 5:
				System.out.println("Friday");
				break;		
			case 6:
				System.out.println("Saturday");
				break;		
			case 7:
				System.out.println("Sunday");
				break;		
		}	
		
	//A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
	
	// THE DEFAULT KEYWORD : 
	//The default keyword specifies some code to run if there is no case match:
	// For example 
	
	 day = 4;
	 switch (day) {
	 case 6:
		 System.out.println("Today is Saturday");
		 break;	 
	 case 7:
		 System.out.println("Today is Sunday");
		 break;
	 default:
		 System.out.println("Looking forward for weekend"); 	
		 break; 
	 }
	
	// Note that if the default statement is used as the last statement in a switch block, it does not need a break.
	
	//For loop inside switch statement
	 
	 String daysName = "Monday";
	 switch (daysName) {
	 case "Monday":
	 
	 	System.out.println("Today is the first day of the week");
	 
	
	 
	 for (int i = 0; i < 100; i++) {
		 
		 if (i== 20) {
			 System.out.println(i);
			 System.out.println("We have reached number 20");
		 }
	 }
	 
	 break;
	 
	 case "Tuesday":
		 
		 System.out.println("We are only on the second day ");
		 break;
	 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
	}
	
}


