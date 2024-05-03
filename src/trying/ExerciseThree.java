package trying;

import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		
		/*Enter a balance and print the balance with a 1% adjustment.*/
		
		Scanner balaceUser = new Scanner(System.in);
		
		System.out.print("Type it the balance of your account:");
		double balaceOfAccount = balaceUser.nextDouble();
		
		double newBalanceOfAccount = balaceOfAccount + ((balaceOfAccount * (1))/100);
		
		System.out.println("Balance with adjustment: $" + newBalanceOfAccount);
		
	}
}
