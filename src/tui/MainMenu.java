package tui;

public class MainMenu {
	private SaleMenu saleMenu;
	//ikke implementeret endnu
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
				//start sale menu
				saleMenu.start();
				break;
			case 2:
				//start loan menu
				loanMenu.start();
				break;
			case 3:
				//start client menu
				clientMenu.start();
				break;
			case 4:
				System.out.println("Farvel!");
				exit = true;
				break;
			default:
				System.out.println("Ikke et muligt valg!");
				break;
			}
		} 
	}
	
	private int writeMainMenu() {
		int choice = 0;
		System.out.println("\n*** Hovedmenu ***");
		System.out.println(" (1) Salgsmenu");
		System.out.println(" (2) Udl�nsmenu");
		System.out.println(" (3) Klientmenu");
		System.out.println(" (4) Afslut");
		choice = TextInput.inputNumber("\nV�lg en mulighed!");
		return choice;
	}
}
