package gui;

import model.SaleProduct;
import model.SaleProductContainer;
import tui.MainMenu;

public class TryMe {
	public static void main(String[] args) {

		SaleProductContainer saleProductContainer = SaleProductContainer.getInstance();

		saleProductContainer.addSaleProduct(new SaleProduct("Sav", 123, "Sav A/S", "Super god sav, tager det hele", "0001235476859", 150, "11-12-20"));
		saleProductContainer.addSaleProduct(new SaleProduct("Hammer", 122, "Hammer A/S", "Super god hammer, tager det hele", "0001335472859", 99, "11-12-20"));
		saleProductContainer.addSaleProduct(new SaleProduct("Skruer", 121, "Skruer A/S", "Super gode skruer, passer til det meste", "0001135376159", 75, "11-12-20"));
		
		MainMenu mainMenuUI = new MainMenu();
		mainMenuUI.start();
	}
}
