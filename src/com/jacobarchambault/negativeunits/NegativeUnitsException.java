package com.jacobarchambault.negativeunits;

public class NegativeUnitsException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * No-arg constructor
	 */
	public NegativeUnitsException() {
		super(
				"Negative number given for units");
	}

	/**
	 * This constructor reports the units value that caused the exception to be
	 * thrown.
	 *
	 * @param u The invalid units value
	 */
	public NegativeUnitsException(
			final double u) {
		super(
				"Negative number given for units: " + u);
	}

}
