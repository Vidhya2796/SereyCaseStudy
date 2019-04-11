package com.quikr.product.service;

import java.util.List;
import java.util.Optional;

import com.quikr.product.model.Product;
import com.quikr.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Productservice {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getproducts() {
		
		return productRepository.findAll();
	}

	public Optional<Product> getproduct(Long id) {
		return productRepository.findById(id);
	}
	
	public void createProduct(Product product) {
		productRepository.save(product);
	}

}
