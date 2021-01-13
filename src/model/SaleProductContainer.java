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
	public SaleProduct findSaleProductByID(int productID) {
		SaleProduct res = null;
		Iterator<SaleProduct> it = saleProducts.iterator();
		while (it.hasNext() && res == null) {
			SaleProduct temp = it.next();
			if (temp.getProductID() == productID) {
				res = temp;
			}
		}
		return res;
	}

	public SaleProduct findSaleProductByBarcode(String barcode) {
		SaleProduct res = null;
		Iterator<SaleProduct> it = saleProducts.iterator();
		while (it.hasNext() && res == null) {
			SaleProduct temp = it.next();
			if (temp.getProductBarcode().equals(barcode)) {
				res = temp;
			}
		}
		return res;
	}
	
	public void addSaleProduct(SaleProduct saleProduct) {
		saleProducts.add(saleProduct);
	}
}