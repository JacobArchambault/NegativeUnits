package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * The RetailItem class stores data about a retail item for the RetailItem
 * Exceptions programming challenge.
 */
public class RetailItem {
	private final String description; // Item description
	private final Scanner keyboard = new Scanner(
			System.in);
	private double price; // Unit price
	private int unitsOnHand; // Number of units on hand

	/**
	 * This constructor initializes the item's description with an empty string,
	 * units on hand to 0, and price to 0.0.
	 */
	public RetailItem() {
		description = "";
		unitsOnHand = 0;
		price = 0.0;
	}

	/**
	 * This constructor initializes the item's description, units on hand, and price
	 * with values passed as arguments.
	 *
	 * @param d The item's description.
	 * @param u The number of units on hand.
	 * @param p The item's price.
	 */
	public RetailItem(
			final String d) {
		description = d;
	}

	/**
	 * The setPrice method sets the item's price.
	 *
	 * @param p The item's price.
	 * @exception NegativePriceException When the price is negative.
	 */
	private void setPrice(
			final double p) throws NegativePriceException {
		if (p < 0) {
			throw new NegativePriceException(
					p);
		} else {
			price = p;
		}
	}

	/**
	 * The setUnitsOnHandmethod sets the item's number of units on hand.
	 *
	 * @param u The number of units on hand
	 * @exception NegativeUnitsException When units on hand is negative.
	 */
	private void setUnitsOnHand(
			final int u) throws NegativeUnitsException {
		if (u < 0) {
			throw new NegativeUnitsException(
					u);
		} else {
			unitsOnHand = u;
		}
	}

	void displayInfo() {
		System.out.println(
				"You entered:");
		System.out.println(
				"\tDescription: " + description);
		System.out.println(
				"\tUnits on hand: " + unitsOnHand);
		System.out.println(
				"\tPrice: " + price);
	}

	void set(String prompt) {
		boolean goodInput;
		do {
			System.out.print(prompt
					);
			try {
				setPrice(
						keyboard.nextDouble());

				// The next statement won't execute if price
				// is negative because an exception will occur
				goodInput = true;
			} catch (final NegativePriceException e) {
				System.out.println(
						"Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
	}

	void setItemUnits() {
		boolean goodInput;
		do {
			System.out.print(
					"Enter the units on hand: ");
			try {
				setUnitsOnHand(
						keyboard.nextInt());

				// The next statement won't execute if units is negative because an exception
				// will occur.
				goodInput = true;
			} catch (final NegativeUnitsException e) {
				System.out.println(
						"Error: " + e.getMessage());
				goodInput = false;
			}
		} while (!goodInput);
	}
}
