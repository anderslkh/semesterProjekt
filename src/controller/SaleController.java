package controller;

import model.SaleContainer;

public class SaleController {

	private SaleContainer saleContainer;

	public SaleController() {
		saleContainer = SaleContainer.getInstance();
	}

	public void createPerson(String name, String address, String postalCode, String city, String phone) {
		Person person = new Person(name, address, postalCode, city, phone);
		personContainer.addPerson(person);
	}

	public SaleProduct searchSaleProduct() {
		return saleProductContainer.findSaleProductByName(phone);
	}
}

