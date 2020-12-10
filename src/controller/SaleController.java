package controller;

import java.util.ArrayList;

import model.*;

public class SaleController {
	private SaleContainer saleContainer;
	private SaleOrder currSaleOrder;
	private SaleProductContainer saleProductContainer;
	private SaleProductController saleProductController;
	private ArrayList<SaleProduct> chosenProducts;
	private Employee testEmployee;

	public SaleController() {
		saleContainer = SaleContainer.getInstance();
		saleProductContainer = SaleProductContainer.getInstance();
		testEmployee = new Employee();
	}

// taget fra sidste projekt
	public void enterSaleProduct(int productID, int quantity, ) {
		SaleProduct saleProduct = saleProductController.findSaleProductByID(productID);
		SaleOrderLine saleOrderLine = new SaleOrderLine(saleProduct, quantity);
		if(currSaleOrder == null) {
			currSaleOrder = new SaleOrder(testEmployee);
		}
		currSaleOrder.addSaleOrderLine(saleOrderLine);
		
	}

	public SaleProduct searchSaleProductByName(String productName) {
		return saleProductController.findSaleProductByName(productName);
	}

	public SaleProduct searchSaleProductByID(int productID) {
		return saleProductController.findSaleProductByID(productID);
	}

	public Customer addCustomerToSale() {

		return null;
	}


	public SaleOrder createReceipt() {
		currSaleOrder = null;
		return null;
	}

	public int choosePaymentMethod() {
		return 0;
	}
	
	
}
