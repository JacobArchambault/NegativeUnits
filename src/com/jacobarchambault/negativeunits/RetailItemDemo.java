package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * This program demonstrates a solution to theRetailItem Exceptions programming
 * challenge.
 */
public class RetailItemDemo {

	public static void main(
			final String[] args) {
		// Create a RetailItem object.
		final var item = new RetailItem(
				new Prompt(
						new Scanner(
								System.in)).response(
										"Enter the item description: "));
		item.setItemUnits();
		item.set("Enter the item price:");
		item.displayInfo();
	}
}
