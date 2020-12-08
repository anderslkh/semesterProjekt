package model;

public class OrderLine {

	private SaleProduct product;
	private int quantity;

	public OrderLine(SaleProduct product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public SaleProduct getProduct() {
		return product;
	}

	public void setProduct(SaleProduct product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
