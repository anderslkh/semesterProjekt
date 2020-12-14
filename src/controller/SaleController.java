package controller;

import model.*;

public class SaleController {
	private SaleContainer saleContainer;
	private SaleOrder currSaleOrder;
	private SaleProductController saleProductController;
	private Employee testEmployee;
	private CustomerController customerController;

	public SaleController() {
		saleContainer = SaleContainer.getInstance();
		saleProductController = new SaleProductController();
		customerController = new CustomerController();
		testEmployee = new Employee("Bob");
	}

	public void createNewOrder() {
		currSaleOrder = new SaleOrder(testEmployee);
	}
	
// taget fra sidste projekt
	public void enterSaleProduct(int productID, int quantity) {
		SaleProduct saleProduct = saleProductController.findSaleProductByID(productID);
		SaleOrderLine saleOrderLine = new SaleOrderLine(saleProduct, quantity);
		if (currSaleOrder == null) {
			currSaleOrder = new SaleOrder(testEmployee);
		}
		currSaleOrder.addSaleOrderLine(saleOrderLine);
	}

	public SaleProduct searchSaleProductByID(int productID) {
		return saleProductController.findSaleProductByID(productID);
	}

	public Customer addCustomerToSale(String phone) {
		Customer customer = customerController.findCustomerByPhone(phone);
		currSaleOrder.setCustomer(customer);
		return customer;
	}

	public void choosePaymentMethod(int paymentMethod) {
		currSaleOrder.setPaymentMethod(paymentMethod);
	}
	
	public SaleOrder createReceipt() {
		saleContainer.addSaleOrder(currSaleOrder);
		return currSaleOrder;
	}
	
	public SaleOrder getSaleOrder() {
		return currSaleOrder;
	}
	
	public void setEmployee() {
		currSaleOrder.setEmployee(testEmployee);
	}

}
