package com.algaworks.springbootinitiation.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.springbootinitiation.domain.model.Product;
import com.algaworks.springbootinitiation.domain.repository.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> products = productRepository.findAll();
		return ResponseEntity.ok(products);
	}
	
	@GetMapping(value = "/{productId}")
	public ResponseEntity<Product> findById(@PathVariable Long productId){
		Product product = productRepository.findById(productId).get();
		return ResponseEntity.ok(product);
	}
}
