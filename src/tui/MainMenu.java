package tui;

public class MainMenu {
	private SaleMenu saleMenu;
	private LoanMenu loanMenu;
	private ClientMenu clientMenu;
	
	public MainMenu() {
		saleMenu = new SaleMenu();
		loanMenu = new LoanMenu();
		clientMenu = new ClientMenu();
	}
	
	public void start() {
		mainMenu();
	}
	
	private void mainMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeMainMenu();
			switch (choice) {
			case 1:
				saleMenu.start();
				break;
			case 2:
				loanMenu.start();
				break;
			case 3:
				clientMenu.start();
				break;
			case 4:
				System.out.println("Bye!");
				exit = true;
				break;
			default:
				System.out.println("Not an option");
				break;
			}
		} 
	}
	
	private int writeMainMenu() {
		int choice = 0;
		System.out.println("\n*** Main Menu ***");
		System.out.println(" (1) Sale Menu");
		System.out.println(" (2) Loan Menu");
		System.out.println(" (3) Client Menu");
		System.out.println(" (4) Exit");
		choice = TextInput.inputNumber("\nPick an option");
		return choice;
	}
}
