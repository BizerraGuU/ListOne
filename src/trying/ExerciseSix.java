package trying;

import java.util.Scanner;

public class ExerciseSix {
	
	public static void main(String[] args) {
		
		/*Develop an algorithm in Java that reads an integer and prints its
		predecessor and its successor.*/
		
		Scanner numberUser =  new Scanner(System.in);
		
		System.out.print("Please, type it an integer number: ");
		int numberType = numberUser.nextInt();
		
		int numPredecessor = numberType - 1;
		
		int numSuccessor = numberType + 1;
		
		System.out.printf("\nThe predecessor of %d is %d and te sucessor is %d!", numberType, numPredecessor, numSuccessor);
				
	}
}
