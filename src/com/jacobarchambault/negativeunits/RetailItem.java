package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * The RetailItem class stores data about a retail item for the RetailItem
 * Exceptions programming challenge.
 */
public class RetailItem {
	private String description; // Item description
	private int unitsOnHand; // Number of units on hand
	private double price; // Unit price
	private Scanner keyboard = new Scanner(
			System.in);

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
			String d,
			int u,
			double p) {
		description = d;
		unitsOnHand = u;
		price = p;
	}

	/**
	 * The setDescription method sets the item' sdescription.
	 * 
	 * @param d The item's description.
	 */
	public void setDescription(
			String d) {
		description = d;
	}

	/**
	 * The setUnitsOnHandmethod sets the item's number of units on hand.
	 * 
	 * @param u The number of units on hand
	 * @exception NegativeUnitsException When units on hand is negative.
	 */
	private void setUnitsOnHand(
			int u) throws NegativeUnitsException {
		if (u < 0)
			throw new NegativeUnitsException(
					u);
		else
			unitsOnHand = u;
	}

	/**
	 * The setPrice method sets the item's price.
	 * 
	 * @param p The item's price.
	 * @exception NegativePriceException When the price is negative.
	 */
	private void setPrice(
			double p) throws NegativePriceException {
		if (p < 0)
			throw new NegativePriceException(
					p);
		else
			price = p;
	}

	/**
	 * The getPrice method returns the item's price.
	 * 
	 * @return The item's price.
	 */
	public double getPrice() {
		return price;
	}

	void displayInfo() {
		System.out.println(
				"You entered:");
		System.out.println(
				"\tDescription: " + this.description);
		System.out.println(
				"\tUnits on hand: " + this.unitsOnHand);
		System.out.println(
				"\tPrice: " + this.getPrice());
	}

	void setItemUnits() {
		boolean goodInput;
		do {
			System.out.print(
					"Enter the units on hand: ");
			try {
				this.setUnitsOnHand(
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

	void setItemPrice() {
		boolean goodInput;
		do {
			System.out.print(
					"Enter the item price:");
			try {
				this.setPrice(
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
