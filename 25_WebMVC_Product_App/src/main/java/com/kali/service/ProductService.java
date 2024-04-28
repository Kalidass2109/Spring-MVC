package com.kali.service;

import java.util.List;

import com.kali.entity.Product;

public interface ProductService {

	public boolean saveProduct(Product p);
	
	public List<Product> getAllProducts();
}
