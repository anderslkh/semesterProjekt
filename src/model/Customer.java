package model;

public class Customer {
	private int customerID;
	private String name;
	private String phone;
	private String mail;
	private String address;
	private String zipCode;
	private String city;
	
	public Customer(int customerID, String name, String phone, String mail, String address, String zipCode,
			String city) {
		this.customerID = customerID;
		this.name = name;
		this.phone = phone;
		this.mail = mail;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}
