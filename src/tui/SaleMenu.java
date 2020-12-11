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
				searchSaleProductByName();
				
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

//	private SaleProduct searchSaleProductByName(String productName) {
//		return saleController.searchSaleProductByName(productName);
//	}
//	
//	private void enterSaleProduct(int productID, int quantity) {
//		
//	}
	
	private void createSaleOrder(String productName, int productID, int quantity, String phone, int paymentMethod) {
		saleController.searchSaleProductByName(productName);
		saleController.enterSaleProduct(productID, quantity);
		saleController.addCustomerToSale(phone);
		saleController.choosePaymentMethod(paymentMethod);
		saleController.createReceipt();
	}

	private void searchSaleProductByName() {
		String productName = TextInput.inputString("Product name");
;		saleController.searchSaleProductByName(productName);
	}
	
	private void enterSaleProduct() {
		int productID = TextInput.inputNumber("Product ID");
		int quantity = TextInput.inputNumber("Quantity");
		saleController.enterSaleProduct(productID, quantity);
	}
	
	private void addCustomerToSale() {
		String phone = TextInput.inputString("Phonenumber");
		saleController.addCustomerToSale(phone);
	}
	
	private void choosePaymentMethod() {
		int paymentMethod = TextInput.inputNumber("Payment method, 1-cash, 2-card, 3-credit");
		saleController.choosePaymentMethod(paymentMethod);
	}
	
	
	
//	private void showDetails(SaleOrder saleOrder) {
//		System.out.println("\nSale Order ID: " + saleOrder.getSaleID());
//		System.out.println("Employee: " + saleOrder.getEmployee());
//		System.out.println("Saleproduct: " + saleOrder.getPostalCode());
//		System.out.println("Quantity: " + saleOrder.getCity());
//		System.out.println("Phone: " + saleOrder.getPhone());
//	}
//
//	private void createReciept() {
//
//	}
}
