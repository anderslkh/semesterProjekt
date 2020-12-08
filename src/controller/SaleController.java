package controller;

import model.SaleContainer;
import model.SaleOrder;

public class SaleController {
	private SaleContainer saleContainer;
	private SaleOrder currSaleOrder;

	public SaleController() {
		saleContainer = SaleContainer.getInstance();
		
	}

	public void enterSaleProduct(String name, String address, String postalCode, String city, String phone) {
		Person person = new Person(name, address, postalCode, city, phone);
		personContainer.addPerson(person);
	}

	public SaleOrder searchSaleProduct() {
		return saleContainer.findSaleProductByName();
	}
}
