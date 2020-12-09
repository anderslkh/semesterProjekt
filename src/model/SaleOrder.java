package model;

import java.util.ArrayList;

public class SaleOrder {
	private int saleOrderID;
	private Employee employee;
	private ArrayList<SaleOrderLine> saleOrderLines;
	private Customer customer;
	private int paymentMethod;

	public SaleOrder(int saleOrderID, Employee employee, Customer customer,
			int paymentMethod) {
		this.saleOrderID = saleOrderID;
		this.employee = employee;
		saleOrderLines = new ArrayList<>();
		this.customer = customer;
		this.paymentMethod = paymentMethod;
	}

	public int getSaleID() {
		return saleOrderID;
	}

	public void setSaleID(int saleOrderID) {
		this.saleOrderID = saleOrderID;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getSaleOrderID() {
		return saleOrderID;
	}

	public void setSaleOrderID(int saleOrderID) {
		this.saleOrderID = saleOrderID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
