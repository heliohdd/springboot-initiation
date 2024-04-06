package com.algaworks.springbootinitiation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algaworks.springbootinitiation.domain.model.Category;
import com.algaworks.springbootinitiation.domain.repository.CategoryRepository;

@SpringBootApplication
public class SpringbootInitiationApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootInitiationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(1L, "Electronics"); 
		Category category2 = new Category(2L, "Books");
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
	}

}
