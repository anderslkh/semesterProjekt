package model;

public class SaleOrder {
	private int saleOrderID;
	private Employee employee;
	
	public SaleOrder(int saleOrderID, Employee employee) {
		this.saleOrderID = saleOrderID;
		this.employee = employee;
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
}
