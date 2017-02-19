package org.common.vo;

import java.util.ArrayList;
import java.util.List;

public class Product {

	static List<Product> allProducts = new ArrayList<Product>(5);
	
	public static List<Product> getAll() {
		if ( allProducts.size() == 0) {
			allProducts.add(new Product(1l, "iPad", 550.00));
			allProducts.add(new Product(1l, "Samsumg 7 Edge", 620.00));
			allProducts.add(new Product(1l, "Amazon Alexa", 250.00));
			allProducts.add(new Product(1l, "Google Home", 120.00));
		}
		return allProducts;
	}
	
	public Product() { }
	
	public Product(Long id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	private Long id;
	
	private String name;
	
	private Double price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
