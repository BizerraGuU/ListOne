package trying;

import java.util.Scanner;

public class ExerciseFive {
	
	public static void main(String[] args) {

		/*Create an algorithm that reads the minimum wage value and the salary value of a user,
		calculate the amount of minimum wages this user earns and print the result.
		(1MW=$788.00)*/
		
		Scanner userWage = new Scanner(System.in);
		
		System.out.print("Type it your wage: ");
		double wageType = userWage.nextDouble();
		
		int total = (int) (wageType/788);
		
		System.out.println("\nThe amount of minimum wages is: " + total);
		
	}
}
