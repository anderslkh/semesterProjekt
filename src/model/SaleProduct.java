package model;

public class SaleProduct {
	private String productName;
	private int productID;
	private String madeByCompany;
	private String description;
	private String productBarcode;
	private int price;
	private String dateOfPrice;

	public SaleProduct(String productName, int productID, String madeByCompany, String description,	String productBarcode, int price, String dateOfPrice) {
		this.productName = productName;
		this.productID = productID;
		this.madeByCompany = madeByCompany;
		this.description = description;
		this.productBarcode = productBarcode;
		this.price = price;
		this.dateOfPrice = dateOfPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getMadeByCompany() {
		return madeByCompany;
	}

	public void setMadeByCompany(String madeByCompany) {
		this.madeByCompany = madeByCompany;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductBarcode() {
		return productBarcode;
	}

	public void setProductBarcode(String productBarcode) {
		this.productBarcode = productBarcode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDateOfPrice() {
		return dateOfPrice;
	}

	public void setDateOfPrice(String dateOfPrice) {
		this.dateOfPrice = dateOfPrice;
	}
}