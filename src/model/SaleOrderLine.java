package model;

public class SaleOrderLine {

	private SaleProduct saleProduct;
	private int quantity;

	public SaleOrderLine(SaleProduct saleProduct, int quantity) {
		this.saleProduct = saleProduct;
		this.quantity = quantity;
	}

	public SaleProduct getProduct() {
		return saleProduct;
	}

	public void setProduct(SaleProduct saleProduct) {
		this.saleProduct = saleProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
