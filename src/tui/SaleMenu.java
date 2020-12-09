package tui;

import java.util.List;
import controller.*;
import model.SaleOrder;

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
				// create sale
				// needs to be implemented VV
				// createSale();
				break;
			case 2:
				// find sale
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

	private void createSale() {

	}

	private void findSale() {

	}

	private void showDetails(SaleOrder saleOrder) {
		System.out.println("\nName: " + saleOrder.getName());
		System.out.println("Address: " + saleOrder.getAddress());
		System.out.println("Postalcode: " + saleOrder.getPostalCode());
		System.out.println("City: " + saleOrder.getCity());
		System.out.println("Phone: " + saleOrder.getPhone());
	}

	private void createReciept() {

	}
}
