package com.algaworks.springbootinitiation.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.springbootinitiation.domain.model.Category;
import com.algaworks.springbootinitiation.domain.repository.CategoryRepository;


@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> categories = categoryRepository.findAll();
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<Category> findById(@PathVariable Long categoryId){
		Category category = categoryRepository.findById(categoryId);
		return ResponseEntity.ok(category);
	}
}
