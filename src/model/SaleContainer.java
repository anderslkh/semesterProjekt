package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SaleContainer {
	private static SaleContainer instance;
	private ArrayList<SaleOrder> saleOrders;
	private int saleID;

	private SaleContainer() {
		saleOrders = new ArrayList<>();
		saleID = 1;
	}

	public static SaleContainer getInstance() {
		if (instance == null) {
			instance = new SaleContainer();
		}
		return instance;
	}

	public void addSaleOrder(SaleOrder saleOrder) {
		saleOrder.setSaleID(saleID);
		saleID++;
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
