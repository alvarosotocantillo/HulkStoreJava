package com.hulkstore.model;

/**
 * 
 * @author Alvaro Soto
 *
 */
public class Product {

	private String sku;
	private String name;
	private Integer stock;
	
	public Product(){
		
	}
			
	public Product(String sku, String name, Integer stock) {
		super();
		this.sku = sku;
		this.name = name;
		this.stock = stock;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", stock=" + stock + "]";
	}
}
