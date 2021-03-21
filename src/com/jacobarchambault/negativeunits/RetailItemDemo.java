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
				RetailItemDemo.setDescription(
						"Enter the item description: "));
		item.setItemUnits();
		item.setItemPrice();
		item.displayInfo();
	}

	/**
	 * The setDescription method sets the item's description.
	 *
	 * @param d The item's description.
	 * @return
	 */
	public static String setDescription(
			final String toPrompt) {
		// set the item description.
		System.out.print(
				toPrompt);
		return new Scanner(
				System.in).nextLine();
	}

}
