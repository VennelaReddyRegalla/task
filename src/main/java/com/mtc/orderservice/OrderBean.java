package com.mtc.orderservice;

public class OrderBean {

	public OrderBean() {

	}

	public OrderBean(int id, int quantity, int productid) {
		this.id = id;
		this.quantity = quantity;
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "OrderBean [id=" + id + ", quantity=" + quantity + ", productid=" + productid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + productid;
		result = prime * result + quantity;
		return result;
	}

	private int id;
	private int quantity;
	private int productid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

}
