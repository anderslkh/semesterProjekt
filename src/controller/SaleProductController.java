package controller;

import model.*;

public class SaleProductController {
	private SaleProductContainer saleProductContainer;

	public SaleProductController() {
		saleProductContainer = SaleProductContainer.getInstance();
	}

	public SaleProduct findSaleProductByName(String name) {
		return saleProductContainer.findSaleProductByName(name);
	}
}
