package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Product;

@Service
public class ProductDao {
	
	@Autowired
	ProductRepository productRepository;

	public void register(Product product) {
		productRepository.save(product);
	}
	
	public List<Product> getAllItems(){
		return productRepository.findAll();
	}
}
