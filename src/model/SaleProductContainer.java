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
	
	public SaleProduct searchSaleProduct(String name) {
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
