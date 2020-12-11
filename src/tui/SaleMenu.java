package tui;

import controller.*;

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
				createSaleOrder();
				break;
			case 2:
				// find sale
				System.out.println("Funktion er ikke implementeret endnu.");
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

	private int writeSaleMenu() {
		int choice = 0;
		System.out.println("\n*** Salgsmenu ***");
		System.out.println(" (1) Opret salg");
		System.out.println(" (2) Find et salg");
		System.out.println(" (3) Afslut");
		choice = TextInput.inputNumber("\nV�lg en mulighed");
		return choice;
	}

	private void createSaleOrder() {
		searchSaleProductByName();
		enterSaleProduct();
		addCustomerToSale();
		choosePaymentMethod();
		createReceipt();
	}

	private void searchSaleProductByName() {
		String productName = TextInput.inputString("Produktnavn");
		saleController.searchSaleProductByName(productName);
	}

	private void enterSaleProduct() {
		boolean done = false;
		while(!done) {
			int productID = TextInput.inputNumber("Produkt-ID");
			if(productID == 0) {
				done = true;
			} else {
				int quantity = TextInput.inputNumber("Antal");
				saleController.enterSaleProduct(productID, quantity);	
			}
		}
	}

	private void addCustomerToSale() {
		String phone = TextInput.inputString("Telefonnummer");
		saleController.addCustomerToSale(phone);
	}

	private void choosePaymentMethod() {
		int paymentMethod = TextInput.inputNumber("Betalingsmetode(1-kontant, 2-kortbetaling, 3-kredit)");
		saleController.choosePaymentMethod(paymentMethod);
	}

	private void createReceipt() {
		saleController.createReceipt();
	}

//	private void showDetails(SaleOrder saleOrder) {
//		System.out.println("\nSale Order ID: " + saleOrder.getSaleID());
//		System.out.println("Employee: " + saleOrder.getEmployee());
//		System.out.println("Saleproduct: " + saleOrder.getPostalCode());
//		System.out.println("Quantity: " + saleOrder.getCity());
//		System.out.println("Phone: " + saleOrder.getPhone());
//	}
}
