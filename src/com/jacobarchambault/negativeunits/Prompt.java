package com.jacobarchambault.negativeunits;

import java.util.Scanner;

public class Prompt {
	/**
	 * The setDescription method sets the item's description.
	 *
	 * @param d The item's description.
	 * @return
	 */
	public static String response(
			final String toPrompt) {
		// set the item description.
		System.out.print(
				toPrompt);
		return new Scanner(
				System.in).nextLine();
	}

}
