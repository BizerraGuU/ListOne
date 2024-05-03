package trying;

import java.util.Scanner;

public class ExerciseOne {
	
	/*Create an algorithm that reads a person's age expressed in years, months and days and
	show it expressed in days. Take into account the year with 365 days and the month with 30.
	(Ex: 3 years, 2 months and 15 days = 1170 days.)*/

	public static void main(String[] args) {
			
		Scanner userAge = new Scanner(System.in);
				
		System.out.print("Enter age: ");
		int ageEnter = userAge.nextInt();
					
		if (ageEnter < 0) {		
			System.out.println("Invalid Age, try again");
		}
			
		System.out.print("Enter month: ");
		int monthEnter = userAge.nextInt();
				
		if (monthEnter < 0 || monthEnter > 12) {		
				System.out.println("Invalid Month, try again");
			}
		
		System.out.print("Enter days: ");
		int daysEnter = userAge.nextInt();
				
		if (daysEnter < 0) {	
			System.out.println("Invalid Month, try again");
		}
			
		int totalLifeInDays = (ageEnter * 365) + (monthEnter * 30) + daysEnter;
			
		System.out.println("Your age, in days is: " + totalLifeInDays);
			
	}
}
