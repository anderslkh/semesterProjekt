package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SaleContainer {
	private static SaleContainer instance;
	private ArrayList<SaleOrder> saleOrders;

	private SaleContainer() {
		orders = new ArrayList<>();
	}

	public static SaleContainer getInstance() {
		if (instance == null) {
			instance = new SaleContainer();
		}
		return instance;
	}

	public void addOrder(SaleOrder saleOrder) {
		orders.add(saleOrders);
	}

	public SaleOrder findOrder(int saleOrderID) {
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
