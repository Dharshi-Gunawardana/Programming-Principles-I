/**
 * Designed and implemented by A.A.D.M Gunawardana
 * This is the Part 1 - Mini-Assignment: Grocery Discount system
 * The package name is  GroceryDiscount.Part_1.CWK.Def so before run the program should convert it to this package name or rename it 
 * Used do-while loop, if-else conditions, methods
 */
package GroceryDiscount.Part_1.CWK.Def;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryDiscount{

	public static void main(String[] args) {
		System.out.printf("****** Grocery Discount ******"); 
		new GroceryDiscount().execute();						//create an object for Grocery Discount
	}

	/**
	 * Main method for Discount Calculations
	 */
	private void execute() {
		Double totalCost = 0.0;
		Double totalDiscount = 0.0;
		Double cost = 0.0;
		int totalCustomer=0;
		do {
			System.out.print("\nPlease Enter the cost of your groceries: ");
			Scanner scanner = new Scanner(System.in);
			try{
				cost = scanner.nextDouble();

				if (cost > 0) {	
					//To check that the amount entered is greater than £0.  
					Double discountPercent = getDiscountPercent(cost);
					Double discountAmount = cost * discountPercent / 100;   // Calculating discount amount
					totalCost += cost;                                      // updating total cost
					totalDiscount += discountAmount; 						//updating total Discount
					totalCustomer++;		//update total customer		
					if (discountPercent == 0.0) {
						System.out.printf("No coupon for your purchase.");
					} else {
						System.out.printf("You win a discount coupon of £%.2f (%.0f%% of your purchase).",discountAmount,discountPercent);
						// reference : https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
					}
					System.out.printf("%n---------------------------------------------------------------%n");

				} else if (cost != -99) {						//To check that the cashier not wants to exit the program   
					System.out.printf("Invalid cost !%n"); 
				}
				
			}catch (InputMismatchException ime){				//To check that the amount entered is non-numeric  
				System.out.printf("%nError!!!%n");
			}
		} while (cost != -99);       				// loop for any cost amount other than -99 (total summary display command)
		System.out.printf("%n==========Summary of %d customers==========%n%n",totalCustomer);    //to get valid total customers                    
		System.out.printf("Total cost: £%.2f  %n" ,totalCost);
		System.out.printf("Total Discount : £%.2f  %n" , totalDiscount);
		// Exit system
	}

	/**
	 * Returns DiscountPercent for a given cost
	 * 
	 * @param cost
	 * @return discountPercent
	 */
	private Double getDiscountPercent(Double cost) {
		if (cost > 210) {
			return 14.0;
		} else if (cost > 150) {
			return 12.0;
		} else if (cost > 60) {
			return 10.0;
		} else if (cost >=10) {
			return 8.0;
		} else {
			return 0.0;
		}
	}
}
