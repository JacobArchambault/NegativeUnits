package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * This program demonstrates a solution to theRetailItem Exceptions programming
 * challenge.
 */
public class RetailItemDemo {

	public static void main(
			String[] args) {
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(
				System.in);

		// Create a RetailItem object.
		RetailItem item = new RetailItem();

		// Get the item description.
		System.out.print(
				"Enter the item description:");
		item.setDescription(
				keyboard.nextLine());

		// Get the item units.
		setItemUnits(
				keyboard,
				item);

		// Get the item price.
		setItemPrice(
				keyboard,
				item);

		// Display the info for item.
		item.displayInfo();
	}

	private static void setItemUnits(
			Scanner keyboard,
			RetailItem item) {
		boolean goodInput;
		do {
			System.out.print(
					"Enter the units on hand: ");
			try {
				item.setUnitsOnHand(
						keyboard.nextInt());

				// The next statement won't execute if units is negative because an exception
				// will occur.
				goodInput = true;
			} catch (NegativeUnitsException e) {
				System.out.println(
						"Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
	}

	private static void setItemPrice(
			Scanner keyboard,
			RetailItem item) {
		boolean goodInput;
		do {
			System.out.print(
					"Enter the item price:");
			try {
				item.setPrice(
						keyboard.nextDouble());

				// The next statement won't execute if price
				// is negative because an exception will occur
				goodInput = true;
			} catch (NegativePriceException e) {
				System.out.println(
						"Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
	}

}
