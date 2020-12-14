package tui;

import controller.ClientController;

public class ClientMenu {

	public ClientMenu() {
	}

	public void start() {
		saleMenu();
	}

	private void saleMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeClientMenu();
			switch (choice) {
			case 1:
				// create client
				// needs to be implemented VV
				// createCustomer();
				break;
			case 2:
				// create employee
				System.out.println("Funktion er ikke implementeret endnu.");
				break;
			case 3:
				// find customer
				System.out.println("Funktion er ikke implementeret endnu.");
				break;
			case 4:
				// find employee
				System.out.println("Funktion er ikke implementeret endnu.");
				break;
			case 5:
				System.out.println("Farvel!");
				exit = true;
				break;
			default:
				System.out.println("Ikke et muligt valg!");
				break;
			}
		}
	}

	private int writeClientMenu() {
		int choice = 0;
		System.out.println("\n*** Klientmenu ***");
		System.out.println(" (1) Opret en kunde");
		System.out.println(" (2) Opret en medarbejder");
		System.out.println(" (3) Find en kunde");
		System.out.println(" (4) Find en medarbejder");
		System.out.println(" (5) Afslut");
		choice = TextInput.inputNumber("\nV�lg en mulighed!");
		return choice;
	}
}
