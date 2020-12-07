package tui;

import controller.ClientController;

public class ClientMenu {

	private ClientController clientController;

	public ClientMenu() {
		clientController = new ClientController();
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
				//create client
				// needs to be implemented VV
				// createCustomer();
				break;
			case 2:
				//create employee
				System.out.println("Feature not yet implemented.");
				break;
			case 3:
				//find customer
				System.out.println("Feature not yet implemented.");
				break;
			case 4:
				//find employee
				System.out.println("Feature not yet implemented.");
				break;
			case 5:
				System.out.println("Bye!");
				exit = true;
				break;
			default:
				System.out.println("Not an option");
				break;
			}
		}
	}

	private int writeClientMenu() {
		int choice = 0;
		System.out.println("\n*** Loan Menu ***");
		System.out.println(" (1) Create a customer");
		System.out.println(" (2) Create an employee");
		System.out.println(" (3) Find a customer");
		System.out.println(" (4) Find an employee");
		System.out.println(" (5) Exit");
		choice = TextInput.inputNumber("\nPick an option");
		return choice;
	}
}
