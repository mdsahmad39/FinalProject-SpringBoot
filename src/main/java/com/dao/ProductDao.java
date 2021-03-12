package com.dao;

import java.util.List;
import java.util.Optional;

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
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}

	public List<Product> getProductsByStoreId(String storeId) {
		return productRepository.findByStoreId(storeId);
	}

	public void updateProduct(Product product) {
		productRepository.save(product);
		
	}

	public void deleteProduct(Product product) {
		productRepository.delete(product);
	}

	public Optional<List<Product>> findProductByName(String productName) {
		return productRepository.findByProductName(productName);
	}
}
