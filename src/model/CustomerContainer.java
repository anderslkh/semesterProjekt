package model;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomerContainer {
	private ArrayList<Customer> customers;
	private static CustomerContainer instance;
	
	private CustomerContainer() {
		customers = new ArrayList<>();
	}
	
	public static CustomerContainer getInstance() {
		if(instance == null) {
			instance = new CustomerContainer();
		}
		return instance;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public Customer findCustomerByPhone(String phone) {
		Customer res = null;
		Iterator<Customer> it = customers.iterator();
		while (it.hasNext() && res == null) {
			Customer temp = it.next();
			if (temp.getPhone() == phone) {
				res = temp;
			}
		}
		return res;
	}
}
