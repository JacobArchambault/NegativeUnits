package com.jacobarchambault.negativeunits;

import java.util.Scanner;

/**
 * This program demonstrates a solution to theRetailItem Exceptions programming
 * challenge.
 */
public class RetailItemDemo {

	public static void main(
			String[] args) {
		// Create a RetailItem object.
		RetailItem item = new RetailItem();
		item.setDescription();
		item.setItemUnits();
		item.setItemPrice();
		item.displayInfo();
	}

}
