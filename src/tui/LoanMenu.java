package tui;

import controller.LoanController;

public class LoanMenu {

	private LoanController loanController;

	public LoanMenu() {
		loanController = new LoanController();
	}

	public void start() {
		loanMenu();
	}

	private void loanMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeLoanMenu();
			switch (choice) {
			case 1:
				//needs to be implemented VV
				//createLoan();
				break;
			case 2:
				System.out.println("Feature not yet implemented.");
				break;
			case 3:
				System.out.println("Bye!");
				exit = true;
				break;
			default:
				System.out.println("Not an option");
				break;
			}
		}
	}

	private int writeLoanMenu() {
		int choice = 0;
		System.out.println("\n*** Loan Menu ***");
		System.out.println(" (1) Create Loan");
		System.out.println(" (2) Find a loan");
		System.out.println(" (3) Exit");
		choice = TextInput.inputNumber("\nPick an option");
		return choice;
	}
}
