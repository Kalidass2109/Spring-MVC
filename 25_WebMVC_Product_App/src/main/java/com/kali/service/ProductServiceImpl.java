package com.kali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kali.entity.Product;
import com.kali.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public boolean saveProduct(Product p) {
		
		Product savedProduct=productRepo.save(p);
		
		return savedProduct.getPid()!=null;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepo.findAll();
	}

}
