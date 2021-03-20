package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * This program demonstrates a solution to theRetailItem Exceptions programming
 * challenge.
 */
public class RetailItemDemo {

	public static void main(String[] args) {
		int units; // To hold the item units
		boolean goodInput; // Flag for validating input

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(
				System.in);

		// Create a RetailItem object.
		RetailItem item = new RetailItem();

		// Get the item description.
		System.out.print("Enter the item description:");
		item.setDescription(keyboard.nextLine());

		// Get the item units.
		do {
			System.out.print("Enter the units on hand: ");
			units = keyboard.nextInt();
			try {
				item.setUnitsOnHand(units);

				// The next statement won't execute if units is negative because an exception
				// will occur.
				goodInput = true;
			} catch (NegativeUnitsException e) {
				System.out.println("Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
		
		// Get the item price.
		do {
			System.out.print("Enter the item price:");
			try {
				item.setPrice(keyboard.nextDouble());
				
				// The next statement won't execute if price
				// is negative because an exception will occur
				goodInput = true;
			} catch(NegativePriceException e) {
				System.out.println("Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
		
		// Display the info for item.
		System.out.println("You entered:");
		System.out.println("\tDescription: " + item.getDescription());
		System.out.println("\tUnits on hand: " + item.getUnitsOnHand());
		System.out.println("\tPrice: " + item.getPrice());
	}

}
