package model;

public class SaleProduct {
	private String saleProductName;
	private String madeByCompany;
	private String description;
	private int saleProductNumber;
	private String saleProductBarcode;
	private int price;
	private String dateOfPrice;

	public SaleProduct(String saleProductName, String madeByCompany, String description, int saleProductNumber,
			String saleProductBarcode, int price, String dateOfPrice) {
		this.saleProductName = saleProductName;
		this.madeByCompany = madeByCompany;
		this.description = description;
		this.saleProductNumber = saleProductNumber;
		this.saleProductBarcode = saleProductBarcode;
		this.price = price;
		this.dateOfPrice = dateOfPrice;
	}

	public String getSaleProductName() {
		return saleProductName;
	}

	public void setSaleProductName(String saleProductName) {
		this.saleProductName = saleProductName;
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

	public int getSaleProductNumber() {
		return saleProductNumber;
	}

	public void setSaleProductNumber(int saleProductNumber) {
		this.saleProductNumber = saleProductNumber;
	}

	public String getSaleProductBarcode() {
		return saleProductBarcode;
	}

	public void setSaleProductBarcode(String saleProductBarcode) {
		this.saleProductBarcode = saleProductBarcode;
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
