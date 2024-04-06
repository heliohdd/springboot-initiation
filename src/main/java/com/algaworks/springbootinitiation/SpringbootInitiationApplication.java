package com.algaworks.springbootinitiation;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algaworks.springbootinitiation.domain.model.Category;
import com.algaworks.springbootinitiation.domain.model.Product;
import com.algaworks.springbootinitiation.domain.repository.CategoryRepository;
import com.algaworks.springbootinitiation.domain.repository.ProductRepository;

@SpringBootApplication
public class SpringbootInitiationApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootInitiationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(1L, "Electronics"); 
		Category category2 = new Category(2L, "Books");
		
		Product product1 = new Product(1L, "TV", 2200.0, category1);
		Product product2 = new Product(2L, "Domain Driven Design", 120.0, category2);
		Product product3 = new Product(3L, "PS5", 2800.0, category1);
		Product product4 = new Product(4L, "Docker", 100.0, category2);
		
		category1.getProducts().addAll(Arrays.asList(product1, product3));
		category2.getProducts().addAll(Arrays.asList(product2, product4));
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		
	}

}
