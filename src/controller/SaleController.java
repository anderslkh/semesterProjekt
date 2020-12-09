package controller;

import model.*;

public class SaleController {
	private SaleContainer saleContainer;
	private SaleOrder currSaleOrder;
	private SaleProductContainer saleProductContainer;

	public SaleController() {
		saleContainer = SaleContainer.getInstance();
		saleProductContainer = SaleProductContainer.getInstance();
	}

// taget fra sidste projekt
	public void enterSaleProduct(String productName, int productID, String madeByCompany, String description,
			int productNumber, String productBarcode, int price, String dateOfPrice) {
		SaleProduct saleProduct = new SaleProduct(productName, productID, madeByCompany, description, productNumber,
				productBarcode, price, dateOfPrice);
		saleProductContainer.addSaleProduct(saleProduct);
	}

	public SaleProduct searchSaleProductByName(String productName) {
		return saleProductContainer.findSaleProductByName(productName);
	}

	public SaleProduct searchSaleProductByID(int productID) {
		return saleProductContainer.findSaleProductByID(productID);
	}

	public Customer addCustomerToSale() {

		return null;
	}


	public SaleOrder createReceipt() {
		return null;
	}

	public int choosePaymentMethod() {
		return 0;
	}
}
