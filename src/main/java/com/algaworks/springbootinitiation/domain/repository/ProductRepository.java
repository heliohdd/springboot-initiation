package com.algaworks.springbootinitiation.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.algaworks.springbootinitiation.domain.model.Product;

@Component
public class ProductRepository {

	private Map<Long, Product> products = new HashMap<>();

	public void save(Product product) {
		products.put(product.getId(), product);
	}
	
	public List<Product> findAll(){
		return new ArrayList<Product>(products.values());
	}
	
	public Product findById(Long productId) {
		return products.get(productId);
	}
}
