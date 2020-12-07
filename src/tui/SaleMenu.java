package tui;

import java.util.List;
import java.util.Scanner;

import controller.SaleController;
import model.Person;

public class SaleMenu {

	private SaleController saleController;

	public SaleMenu() {
		saleController = new SaleController();
	}

	public void start() {
		saleMenu();
	}

	private void saleMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeSaleMenu();
			switch (choice) {
			case 1:
				//create sale
				//needs to be implemented VV
				//createSale();
				break;
			case 2:
				//find sale
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

	private int writeSaleMenu() {
		int choice = 0;
		System.out.println("\n*** Loan Menu ***");
		System.out.println(" (1) Create a sale");
		System.out.println(" (2) Find a sale");
		System.out.println(" (3) Exit");
		choice = TextInput.inputNumber("\nPick an option");
		return choice;
	}
	
	
	private int findPerson() {
		List<Person> currL = null;
		boolean found = false;
		System.out.println("søg efter personer med navn");
		Scanner scanner = new Scanner(System.in);
		String input = null;
		while (!found && scanner.hasNext()) {
			input = scanner.next();
			if (lC.findPeople(input).size() > 0) {
				currL = lC.findPeople(input);
				displayPerson(currL);
				found = true;
			} else {
				System.out.println("kunne ikke finde nogle personner med det navn");
			}
		}
		System.out.println("vælg person med med [tal]");
		return chooseInput(currL, scanner);
	}
	
	private void searchSaleProduct() {
		List<SaleProduct> currP = null;
		boolean found = false;
		System.out.println("søg efter personer med navn");
		Scanner scanner = new Scanner(System.in);
		String input = null;
		while (!found && scanner.hasNext()) {
			input = scanner.next();
			if (lC.findPeople(input).size() > 0) {
				currL = lC.findPeople(input);
				displayPerson(currL);
				found = true;
			} else {
				System.out.println("kunne ikke finde nogle personner med det navn");
			}
		}
		System.out.println("vælg person med med [tal]");
		return chooseInput(currL, scanner);
	}
	
	private void enterSaleProduct() {
		
	}
	
	private void addCustomerToSale() {
		
	}
	
	private void choosePaymentMethod() {
		
	}
	
	private void createReciept() {
		
	}
}
