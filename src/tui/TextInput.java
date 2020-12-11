package tui;

import java.util.Scanner;

/**
 * Description of TextInput goes here.
 * 
 * @author Istvan Knoll, Mogens Holm Iversen
 * @version 0.0.1 initial draft version
 */

public class TextInput {
	// instance variables

	/**
	 * Constructor for objects of TextInput
	 */
	public TextInput() {
		// initialise instance variables
	}

	// other methods
	
	public static int inputNumber(String question) {
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		printQuesiton(question);
		while (!keyboard.hasNextInt()) {
			System.out.println("Indput skal v�re et tal, pr�v igen!");
			keyboard.nextLine();
		}
		number = keyboard.nextInt();
		return number;
	}

	public static String inputString(String question) {
		Scanner keyboard = new Scanner(System.in);
		printQuesiton(question);
		return keyboard.nextLine();
	}

	private static void printQuesiton(String question) {
		System.out.print(" " + question + ": ");
	}
}
