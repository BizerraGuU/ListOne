package trying;

public class ExerciseTwo {

	public static void main(String[] args) {
		
		/* Write a program that prints the arithmetic mean of the numbers 8,9 and 7. 
		The mean of the numbers 4, 5 and 6. The sum of the two averages. The average of averages.*/
		
		double avaOne;
		double avaTwo;
		double avaOfAva; 
		
		avaOne = (8 + 9 + 7)/3;
		
		avaTwo = (4 + 5 + 6)/3;
		
		System.out.println("The avarage one is: " + avaOne);
		System.out.println("The avarage two is: " + avaTwo);	
		System.out.println("The sum of both is: " + (avaOne + avaTwo));
	
		avaOfAva = (avaOne + avaTwo)/2;
		
		System.out.println("The avarage of the avarages is: " + avaOfAva);
		
	}
}
