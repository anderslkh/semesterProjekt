package tui;

import java.util.List;
import controller.*;
import model.SaleOrder;
import model.SaleProduct;

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

	private SaleProduct searchSaleProductByName(String productName) {
		return saleController.searchSaleProductByName(productName);
	}
	
	private void enterSaleProduct(int productID, int quantity) {
		
	}
	
	private void createSaleOrder(String productName, int productID, int quantity, String phone) {
		saleController.searchSaleProductByName(productName);
		saleController.enterSaleProduct(productID, quantity);
		saleController.addCustomerToSale(phone);
		saleController.choosePaymentMethod();
		saleController.createReceipt();
	}

	private void showDetails(SaleOrder saleOrder) {
		System.out.println("\nSale Order ID: " + saleOrder.getSaleID());
		System.out.println("Employee: " + saleOrder.getEmployee());
		System.out.println("Saleproduct: " + saleOrder.getPostalCode());
		System.out.println("Quantity: " + saleOrder.getCity());
		System.out.println("Phone: " + saleOrder.getPhone());
	}

	private void createReciept() {

	}
}
