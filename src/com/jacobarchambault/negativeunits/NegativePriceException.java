package com.jacobarchambault.negativeunits;

public class NegativePriceException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * No-arg constructor
	 */
	public NegativePriceException() {
		super(
				"Negative number given for item price.");
	}

	/**
	 * This constructor reports the price that caused the exception to be thrown.
	 *
	 * @param price The invalid price.
	 */
	public NegativePriceException(
			final double price) {
		super(
				"Negative number given for price: " + price);
	}
}
