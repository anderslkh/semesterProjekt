package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SaleProductContainer {
	private static SaleProductContainer instance;
	private ArrayList<SaleProduct> saleProducts;

	private SaleProductContainer() {
		saleProducts = new ArrayList<>();
	}

	public static SaleProductContainer getInstance() {
		if (instance == null) {
			instance = new SaleProductContainer();
		}
		return instance;
	}

	// Dette stykke kode er taget fra Anders gruppe i miniprojekt design
	public SaleProduct findSaleProductByName(String name) {
		SaleProduct res = null;
		Iterator<SaleProduct> it = saleProducts.iterator();
		while (it.hasNext() && res == null) {
			SaleProduct temp = it.next();
			if (temp.getSaleProductName().equalsIgnoreCase(name)) {
				res = temp;
			}
		}
		return res;
	}

	// Dette stykke kode er taget fra Anders gruppe i miniprojekt design
	public SaleProduct findSaleProductByID(int id) {
		SaleProduct res = null;
		Iterator<SaleProduct> it = saleProducts.iterator();
		while (it.hasNext() && res == null) {
			SaleProduct temp = it.next();
			if (temp.getSaleProductNumber() == id) {
				res = temp;
			}
		}
		return res;
	}

	public void addSaleProduct(SaleProduct saleProduct) {
		saleProducts.add(saleProduct);
	}

}