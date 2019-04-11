package com.quikr.product.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quikr.product.model.Product;
import com.quikr.product.service.Productservice;
//@RequestMapping("/product")
@RestController
public class ProductController {
	
@Autowired
	private Productservice productservice;
	
	@GetMapping("/getallproducts")
	public List<Product> getproducts() {
		
		System.out.println(productservice.getproducts());
		return productservice.getproducts();
	}
	
	
	@GetMapping("/{id}")
	public Optional<Product> getproduct(@PathVariable Long id) {
		return productservice.getproduct(id);
	}
	
	@PostMapping("/create")
	public String addUser(@RequestBody Product product) {
		System.out.println(product);
		System.out.println("Saving product...");
		productservice.createProduct(product);;
		return " product added succesfully";
	}
	
	@GetMapping("/show")
	public String show() {
		return "showing...";
	}
}
