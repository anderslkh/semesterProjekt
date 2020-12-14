package tui;

import controller.*;
import model.SaleOrder;
import model.SaleOrderLine;

public class SaleMenu {
	private SaleController saleController;

	public SaleMenu() {
		saleController = new SaleController();
	}

	public void start() {
		saleMenu();
	}
	
//menu er blevet genbrugt fra miniprojekt design fra Anders' program
	private void saleMenu() {
		boolean exit = false;
		while (!exit) {
			int choice = writeSaleMenu();
			switch (choice) {
			case 1:
				createSaleOrder();
				printReceipt();
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

	//er blevet genbrugt fra miniprojekt design fra Anders' program
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
		saleController.createNewOrder();
		enterSaleProduct();
		addCustomerToSale();
		choosePaymentMethod();
		createReceipt();
	}

	private void enterSaleProduct() {
		boolean done = false;
		while (!done) {
			int productID = TextInput.inputNumber("Produkt-ID, Indtast 0 for at stoppe med at indtaste varer");
			if (productID == 0) {
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
		int paymentMethod = TextInput.inputNumber("Betalingsmetode(0-kontant, 1-kortbetaling, 2-kredit)");
		saleController.choosePaymentMethod(paymentMethod);
	}

	private void createReceipt() {
		saleController.createReceipt();
	}

	private void printReceipt() {
		String paymentMethod = null;
		SaleOrder currSaleOrder = saleController.getSaleOrder();
		System.out.println("\nProdukter:");
		for (SaleOrderLine ol : currSaleOrder.getSaleOrderLines()) {
			System.out.println(ol.getProduct().getProductName());
			System.out.println("Antal: " + ol.getQuantity());
		}
		System.out.println("\nSalgs-ID: " + currSaleOrder.getSaleOrderID());
		System.out.println("Kunde: " + currSaleOrder.getCustomer().getName());
		System.out.println("Du blev betjent af: " + currSaleOrder.getEmployee().getName());
		if (currSaleOrder.getPaymentMethod() == 0) {
			paymentMethod = "Kontant";
		} else if (currSaleOrder.getPaymentMethod() == 1) {
			paymentMethod = "Kortbetaling";
		} else if (currSaleOrder.getPaymentMethod() == 2) {
			paymentMethod = "Kredit";
		}
		System.out.println("Betalingsmetode: " + paymentMethod);
	}
}
