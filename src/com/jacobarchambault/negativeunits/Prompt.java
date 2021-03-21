package com.jacobarchambault.negativeunits;

import java.util.Scanner;

public class Prompt {
	Scanner scanner;
	Prompt(Scanner scanner){
		this.scanner = scanner;
	}
	
	/**
	 * The setDescription method sets the item's description.
	 *
	 * @param d The item's description.
	 * @return
	 */
	public String response(
			final String toPrompt) {
		// set the item description.
		System.out.print(
				toPrompt);
		return scanner.nextLine();
	}

}
