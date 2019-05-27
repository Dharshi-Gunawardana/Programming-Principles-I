/**
 * Designed and implemented by A.A.D.M Gunawardana 
 * This is the Part 2 - Mini-Assignment: Sequence Of Values (loop) 
 * The package name is  SequenceOfValue.Part_2.CWK.Def so before run the program should convert it to this package name or rename it 
 * Used Array List, do-while loop, if-else conditions, regular expressions to manipulating strings  
 */
package SequenceOfValue.Part_2.CWK.Def;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class SequenceOfValue {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>(); 		// Creating generic double ArrayList
		Scanner scanner = new Scanner(System.in);
		System.out.printf("****** Sequence Of Values ******");
		System.out.printf("\n"); // \n to find a new line
		
		do {
			System.out.println("\nPlease Enter a value"); 
			String inputVal = scanner.next();
			boolean isCharacter = inputVal.matches("\\D");	// \D for find a non-digit character

			if (inputVal.matches("\\d*\\.\\d{1}")) {		//to check floating point	
				//http://files.zeroturnaround.com/pdf/zt_regular-expressions-cheat-sheet.pdf
				double formatedInput = Double.parseDouble(inputVal);	//to convert String to double for the further calculations, conditions
				
				if(formatedInput>=0.0 && formatedInput>50.0) {		//not valid this (0.0 to 50.0 inclusive) condition
					System.out.printf("Out of range...Please try again...%n");	

				}else if(list.size() < 10){			//list doesn't have 10 values
					list.add(Double.parseDouble(inputVal));		// add value to the list
				}
				
			}else {		// above conditions false user enter value check exit the terminate or execute  the program.
				
				if(isCharacter) {			//user enter a non-numeric character
					System.out.printf("........... END THE PROGRAM ...........%n ");
					break;					//to break the loop 
				}else {				//user enter numeric character or mixed 
					System.out.printf("Formatting Error...Please try again...%n");		
				}
			}
			
		}while (list.size() < 10);		//User can enter max 10 values (Summary display command)
		System.out.printf("%n============== Summary ==============%n");
		/**
		 * sort values, calculate total using enhanced for loop
		 */
		list.sort(null);			//default
		double total=0.0;
		for (Double d : list) {
			total+=d;			//updating total
		}

		if(list.size()>0) {			//To check that the list is greater than 0.  
			System.out.printf("%n-------------------------------------------------------------%n");
			System.out.printf("User entered %d set of valid floating-point values",list.size());
			System.out.printf("%n-------------------------------------------------------------%n");
			/**
			 * print Min value by sorted 0th value, Max value by sorted list size-1, Average by total of the sorted
			 * values/list size, Difference by max-min, listed values 
			 */
			System.out.printf("The smallest value: %.1f %n",list.get(0));							//took one decimal points
			System.out.printf("The largest value: %.1f %n",list.get(list.size()-1));				//took one decimal points
			System.out.printf("The average of the values: %.2f %n",total/list.size());				//took two decimal points because for the accurate
			System.out.printf("Difference between the smallest and largest: %.1f%n",list.get(list.size()-1)-list.get(0));	//took one decimal points	
			
			System.out.printf("%n Sorted values: ");
			for (int i=0; i<list.size(); i++) 			//to show sorted values 
				System.out.printf(+list.get(i) + "  ");
		}else {				//To check that the array list is empty   
			System.out.printf("%n------------------------------------------%n");
			System.out.printf("User entered all values are invalid %n");
			System.out.printf("------------------------------------------");
		}
	}
}
