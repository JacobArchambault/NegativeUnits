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
		item.setItemUnits();

		// Get the item price.
		item.setItemPrice();

		// Display the info for item.
		item.displayInfo();
	}

}
