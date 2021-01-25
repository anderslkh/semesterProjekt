package tui;

import model.SaleProduct;
import model.Customer;
import model.CustomerContainer;
import model.SaleProductContainer;

public class TryMe {
	public static void main(String[] args) {
		CustomerContainer customerContainer = CustomerContainer.getInstance();

		customerContainer.addCustomer(new Customer(1, "Anders Lund", "12131415", "AndersL@gmail.com","Lundsgade 42", "9000", "Aalborg"));
		customerContainer.addCustomer(new Customer(3, "Thomas Petersen", "40326838", "ThomasP@gmail.com", "Kastetvej 11", "9000", "Aalborg"));
		customerContainer.addCustomer(new Customer(2, "Gustav", "12345678", "hej@live.dk" ,"Søndergade 32", "7441", "Bording"));

		SaleProductContainer saleProductContainer = SaleProductContainer.getInstance();

		saleProductContainer.addSaleProduct(new SaleProduct("Sav", 123, "Sav A/S", "Super god sav, tager det hele", "0001235476859", 150, "11-12-20"));
		saleProductContainer.addSaleProduct(new SaleProduct("Hammer", 122, "Hammer A/S", "Super god hammer, tager det hele", "0001335472859", 99, "11-12-20"));
		saleProductContainer.addSaleProduct(new SaleProduct("Skruer", 121, "Skruer A/S", "Super gode skruer, passer til det meste", "0001135376159", 75, "11-12-20"));
		
		MainMenu mainMenuUI = new MainMenu();
		mainMenuUI.start();
	}
}
