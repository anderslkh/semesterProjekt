package controller;

import model.Sale;
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

	public Person findPerson(String phone) {
		return personContainer.findPerson(phone);
	}
}

