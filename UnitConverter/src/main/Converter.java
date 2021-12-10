package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		//Create an int variable named menuSelection
		int menuSelection = 0;
		
		//Use a Scanner object to collect the user's menuSelection
		Scanner scanner = new Scanner(System.in);
		
		//Inside a while loop, with the condition menuSelection != /*last menu option */
		while(menuSelection != 4) {
			//Using System.out.println(), print a menu with numbered options. For example:
			// Please select an option
			// 1. Cups to Teaspoons
			// 2. Miles to Kilometers
			// 3. US Gallons to Imperial Gallons
			// 4. Quit
			
			System.out.println("Please select an option");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. US Gallons to Imperial Gallons");
			System.out.println("4. Quit");
			
			menuSelection = scanner.nextInt();
			
			
		}
	}
}
