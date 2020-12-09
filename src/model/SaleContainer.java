package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SaleContainer {
	private static SaleContainer instance;
	private ArrayList<SaleOrder> saleOrders;

	private SaleContainer() {
		saleOrders = new ArrayList<>();
	}

	public static SaleContainer getInstance() {
		if (instance == null) {
			instance = new SaleContainer();
		}
		return instance;
	}

	public void addSaleOrder(SaleOrder saleOrder) {
		saleOrders.add(saleOrder);
	}

	public SaleOrder findSaleOrder(int saleOrderID) {
		SaleOrder res = null;
		Iterator<SaleOrder> it = saleOrders.iterator();
		while (it.hasNext() && res == null) {
			SaleOrder temp = it.next();
			if (temp.getSaleID() == saleOrderID) {
				res = temp;
			}
		}
		return res;
	}
}
