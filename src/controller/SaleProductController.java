package controller;

import model.*;

public class SaleProductController {
	private SaleProductContainer saleProductContainer;

	public SaleProductController() {
		saleProductContainer = SaleProductContainer.getInstance();
	}
	
	public SaleProduct findSaleProductByID(int productID) {
		return saleProductContainer.findSaleProductByID(productID);
	}
}
