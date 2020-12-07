package model;

public class SaleProduct {
	private String saleProductName;
	private String madeByCompany;
	private String description;
	private int saleItemNumber;
	private String saleBarcode;

	public SaleProduct(String saleProductName, String madeByCompany, String description, int saleItemNumber, String saleBarcode) {
		this.saleProductName = saleProductName;
		this.madeByCompany = madeByCompany;
		this.description = description;
		this.saleItemNumber = saleItemNumber;
		this.saleBarcode = saleBarcode;
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
