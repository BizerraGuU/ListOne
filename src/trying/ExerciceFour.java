package trying;

import java.util.Scanner;

public class ExerciceFour {

	public static void main(String[] args) {
	
		Scanner taxUser = new Scanner(System.in);
		
		/*Write an algorithm that reads:
		- the percentage of IPI to be added to the value of the pieces
		- part code 1, unit value of part 1, quantity of parts 1
		- part code 2, unit value of part 2, quantity of parts 2
		The algorithm must calculate the total amount to be paid and present the result.
		Formula: (value1*quant1 + value2*quant2)*(IPI/100 + 1)*/
		
		//IPI is the name of Brazil's tax.
		
		System.out.print("Tell the new tax valleu: ");
		double newTax = taxUser.nextDouble();
		
		System.out.print("\nTell the price of the product 1: ");
		double priceOfProduct = taxUser.nextDouble();
		
		System.out.print("\nTell the quantity of the product 1: ");
		int quantOfProduct = taxUser.nextInt();
		
		System.out.print("\nTell the price of the product 2: ");
		double priceOfProductTwo =  taxUser.nextDouble();
		
		System.out.print("\nTell the quantity of the product 1: ");
		int quantOfProductTwo = taxUser.nextInt();
		
		double totalCalc =  ((priceOfProduct*quantOfProduct)+(priceOfProductTwo*quantOfProductTwo))*((newTax/100)+1);

		System.out.printf("\nThe total to be paid is: %.2f", totalCalc);
		
	}
}
