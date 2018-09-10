package com.hulkstore.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Service;

import com.hulkstore.model.Product;

@Service
public class ProductService {

	private final ConcurrentMap<String, Product> products;

	public ProductService() {
		this.products = new ConcurrentHashMap<String, Product>();
	}

	public void add(Product product) {
		this.products.put(product.getSku(), product);
	}
	
	public void update(Product product) {
		if (products.containsKey(product.getSku())) {
			products.put(product.getSku(), product);
		}
	}
	
	public void delete(Product product) {
		if (products.containsKey(product.getSku())) {
			products.remove(product.getSku());
		}
	}

	public Product findById(String sku) {
		return products.get(sku);
	}
	
	public Collection<Product> findAll() {
		Collection<Product> allProducts = products.values();
		if (allProducts.isEmpty()) {
			return Collections.emptyList();
		} else {
			return new ArrayList<Product>(allProducts);
		}
	}

}
