package tui;

public class LoanMenu {

	public LoanMenu() {
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
				// create loan
				// needs to be implemented VV
				// createLoan();
				break;
			case 2:
				// find loan
				System.out.println("Funktion er ikke implementeret endnu");
				break;
			case 3:
				System.out.println("Farvel!");
				exit = true;
				break;
			default:
				System.out.println("Ikke et muligt valg!");
				break;
			}
		}
	}

	private int writeLoanMenu() {
		int choice = 0;
		System.out.println("\n*** Udl�nsmenu ***");
		System.out.println(" (1) Opret et l�n");
		System.out.println(" (2) Find et l�n");
		System.out.println(" (3) Afslut");
		choice = TextInput.inputNumber("\nV�lg en mulighed!");
		return choice;
	}
}
