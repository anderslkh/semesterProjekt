package model;

public class SaleProduct {
	private String saleProductName;
	private String madeByCompany;
	private String description;
	private int saleItemNumber;
	private String saleBarcode;
	private int price;
	private String dateOfPrice;

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

	public SaleProduct(String saleProductName, String madeByCompany, String description, int saleItemNumber,
			String saleBarcode, int price, String dateOfPrice) {
		this.saleProductName = saleProductName;
		this.madeByCompany = madeByCompany;
		this.description = description;
		this.saleItemNumber = saleItemNumber;
		this.saleBarcode = saleBarcode;
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

	public int getSaleItemNumber() {
		return saleItemNumber;
	}

	public void setSaleItemNumber(int saleItemNumber) {
		this.saleItemNumber = saleItemNumber;
	}

	public String getSaleBarcode() {
		return saleBarcode;
	}

	public void setSaleBarcode(String saleBarcode) {
		this.saleBarcode = saleBarcode;
	}

}
